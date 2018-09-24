package testMVC.visual;

import testMVC.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private static String yes;
    public static void getYes(String yes) {
        Window.yes=yes;
    }

    public void init(){
            setTitle("Main window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(400,300);
            JPanel jPanel=new JPanel();
            jPanel.setLayout(new BorderLayout());
            //JButton jButton=new JButton("BUTTON");
            JButton jButton=new JButton("Button");

            jButton.addActionListener(e-> {
                System.out.println("pressed BUTTON");
                String buttonText=e.getActionCommand();
                Controller.sendButtonText(buttonText);
                jButton.setText(yes);
            });

            jPanel.add(jButton);
            add(jPanel);
            setVisible(true);
        }



}
