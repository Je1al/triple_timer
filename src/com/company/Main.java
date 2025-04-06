package com.company;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {


            public static void main(String[] paramArrayOfString) {

                TimerGUI timerGUI = new TimerGUI();
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                } catch (InstantiationException instantiationException) {
                    instantiationException.printStackTrace();
                } catch (IllegalAccessException illegalAccessException) {
                    illegalAccessException.printStackTrace();
                } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                    unsupportedLookAndFeelException.printStackTrace();
                }
                new TimerGUI();
                
    }
}
