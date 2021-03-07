package com.company;


import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // Create and set up a frame window
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu myGUIform = new MainMenu();
<<<<<<< HEAD
                myGUIform.setVisible(true);//sadasdasdasd
=======
                myGUIform.setVisible(true);
>>>>>>> 8cc5ae8e82aa307203ce218f4fbc6d5b72a19661
            }
        });


    }

}