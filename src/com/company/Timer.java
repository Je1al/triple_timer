package com.company;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class Timer implements Runnable {
    private JButton btn;

    private JSpinner spinner;

    private int seconds;

    public Boolean stopF;

    public Timer(JButton paramJButton, JSpinner paramJSpinner) {
        this.btn = paramJButton;
        this.spinner = paramJSpinner;
        this.seconds = ((Integer)this.spinner.getValue()).intValue();
        if (this.seconds < 0)
            paramJSpinner.setValue(Integer.valueOf(0));
        this.stopF = Boolean.valueOf(false);
    }

    public void run() {
        try {
            this.btn.setText("Stop");
            this.spinner.setEnabled(false);
            while (this.seconds > 0 && !this.stopF.booleanValue()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                this.seconds--;
                this.spinner.setValue(Integer.valueOf(this.seconds));
            }
            this.btn.setText("Start");
            this.spinner.setEnabled(true);
        } catch (Exception exception) {
            System.out.println(exception.getMessage() + " " + exception.getMessage());
            this.spinner.setEnabled(true);
            this.btn.setText("Start");
        }
    }
}
