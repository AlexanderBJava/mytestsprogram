

import krestikiNolokiOOP.controller.GameController;
import krestikiNolokiOOP.model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    GameController gameController;
    public static final int SIZE = 3;
    JButton[][] buttons;
    private String yes;

    public void init() {


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);

        setTitle("XO Game");
        setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu aboutMenu = new JMenu("About");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutMenu.add(aboutItem);
        JFrame thisFrame = this; //конструкция позволяющая использовать ниже экземпляр класса JFrame
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test Restart");
                JOptionPane.showMessageDialog(thisFrame, "About program? Its cool, man!", "Upper window title:ABOUT", JOptionPane.WARNING_MESSAGE);
            }
        });

        jMenuBar.add(gameMenu);
        jMenuBar.add(aboutMenu);
        JMenuItem startItem = new JMenuItem("Start Game");
        JMenuItem exitItem = new JMenuItem("Exit Game");
        gameMenu.add(startItem);
        gameMenu.add(exitItem);
        exitItem.addActionListener(e -> System.exit(0));
        startItem.addActionListener(e -> System.out.println("StartButton"));


        JPanel jPanel = new JPanel();
        add(jPanel);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        jPanel.setLayout(new GridLayout(SIZE, SIZE, 0, 0));
//        jPanel.add(new JButton("HelloWord!");
//        jPanel.add(new JButton("X"));
//        jPanel.add(new JButton("X2"));
//        jPanel.add(new JButton("X3"));
//        jPanel.add(new JButton("X4"));
//        jPanel.add(new JButton("X5"));
        buttons = new JButton[SIZE][SIZE];


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                //JButton jButton=new JButton(j %2 ==0 ? "X" : "O");
                JButton jButton = new JButton("X");
                final int finalI = i;
                final int finalJ = j;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        //   System.out.printf("Button %s  x: %d  y: %d %n",buttonText, finalJ,finalI);
                        // GameController.doShoot(new Point(finalJ,finalI),buttonText.equals("X") ? "X":"O");
                        GameController.peredayButtonText(buttonText);
                        //
                    }

                });

                buttons[i][j] = jButton;


                jPanel.add(jButton);
                setJMenuBar(jMenuBar);
                setVisible(true);
            }


            // JButton jButton=new JButton("dfsdfsdf");
            //   buttons[1][1]=jButton;
            // buttons[1][1].addActionListener(e-> System.out.println("dfsdfsdf"));

//        public static void setYesText(String yes){
//            this.yes=yes;
//            //GameWindow.yes=yes;
//            for (int i = 0; i < SIZE; i++) {
//                for (int j = 0; j < SIZE; j++) {
//                    buttons[i][j].setText(yes);
//                }

        }



    }
    public void setYes (String yes){
        this.yes=yes;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
               // buttons[1][1]=yes;
            }
        }

    }
}