package com.company;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;

public class TimerGUI<p> extends JFrame implements ActionListener {
private void printThreadInfo() {
    System.out.println("Timer gui on" +Thread.currentThread().getName()+"with id"+Thread.currentThread().getId());
}
public void run(){
    printThreadInfo();
}
    private JSpinner jSpinner1;

    private JSpinner jSpinner2;

    private JSpinner jSpinner3;

    private JButton jButton1;

    private JButton jButton2;

    private JButton jButton3;

    private Boolean stopF1;

    private Boolean stopF2;

    private Boolean stopF3;

    private Thread t1;

    private Thread t2;

    private Thread t3;

    private Timer tm1;

    private Timer tm2;

    private Timer tm3;

    public TimerGUI() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.stopF1 = Boolean.valueOf(false);
        this.stopF2 = Boolean.valueOf(false);
        this.stopF3 = Boolean.valueOf(false);
        setSize(250, 150);
        this.jSpinner1 = new JSpinner();
        this.jSpinner2 = new JSpinner();
        this.jSpinner3 = new JSpinner();
        this.jSpinner1.setBounds(10, 10, 60, 20);
        this.jSpinner2.setBounds(10, 40, 60, 20);
        this.jSpinner3.setBounds(10, 70, 60, 20);
        this.jButton1 = new JButton("Start");
        this.jButton2 = new JButton("Start");
        this.jButton3 = new JButton("Start");
        this.jButton1.setName("1");
        this.jButton2.setName("2");
        this.jButton3.setName("3");
        this.jButton1.setBounds(80, 10, 60, 20);
        this.jButton2.setBounds(80, 40, 60, 20);
        this.jButton3.setBounds(80, 70, 60, 20);
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton3.addActionListener(this);
        add(this.jSpinner1);
        add(this.jSpinner2);
        add(this.jSpinner3);
        add(this.jButton1);
        add(this.jButton2);
        add(this.jButton3);
        setResizable(false);
        setLayout((LayoutManager)null);
        setVisible(true);
        setLocationRelativeTo((Component)null);
        setDefaultCloseOperation(3);
        setTitle("Timer");

    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        switch (((JButton)paramActionEvent.getSource()).getName()) {
            case "1":
                if (((JButton)paramActionEvent.getSource()).getText().equals("Start")) {
                    if (this.t1 != null && this.t1.isAlive())
                        this.t1.interrupt();
                    this.tm1 = new Timer(this.jButton1, this.jSpinner1);
                    this.t1 = new Thread(this.tm1);
                    this.t1.setDaemon(true);
                    this.t1.start();
                    break;
                }
                if (this.t1 != null && this.t1.isAlive())
                    this.tm1.stopF = Boolean.valueOf(true);
                break;
            case "2":
                if (((JButton)paramActionEvent.getSource()).getText().equals("Start")) {
                    if (this.t2 != null && this.t2.isAlive())
                        this.t2.interrupt();
                    this.tm2 = new Timer(this.jButton2, this.jSpinner2);
                    this.t2 = new Thread(this.tm2);
                    this.t2.setDaemon(true);
                    this.t2.start();
                    break;
                }
                if (this.t2 != null && this.t2.isAlive())
                    this.tm2.stopF = Boolean.valueOf(true);
                break;
            case "3":
                if (((JButton)paramActionEvent.getSource()).getText().equals("Start")) {
                    if (this.t3 != null && this.t3.isAlive())
                        this.t3.interrupt();
                    this.tm3 = new Timer(this.jButton3, this.jSpinner3);
                    this.t3 = new Thread(this.tm3);
                    this.t3.setDaemon(true);
                    this.t3.start();
                    break;
                }
                if (this.t3 != null && this.t3.isAlive())
                    this.tm3.stopF = Boolean.valueOf(true);
                break;

        }
    }
}

