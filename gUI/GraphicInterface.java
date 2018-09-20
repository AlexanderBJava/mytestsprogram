package gUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class GraphicInterface extends JFrame {



     public GraphicInterface(){
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(700, 500);
        setTitle("TestWindow");
        setLocationRelativeTo(null);

        JMenuBar jMenuBar=new JMenuBar();//делаем горизонтальное меню
        JMenu gameMenu=new JMenu("Game");//делаем пункты горизонт. меню
        JMenu aboutMenu=new JMenu("About");

        jMenuBar.add(gameMenu);//добавляем пункты в гор. меню (порядок важен)
         jMenuBar.add(aboutMenu);

         JMenuItem startGameItem=new JMenuItem("Start Game!"); //подпункты (вертикальный список)
         JMenuItem testItem= new JMenuItem("Test");
         JMenuItem closeItem=new JMenuItem("Close");
        JMenuItem restartItem=new JMenuItem("Restart");

        gameMenu.add(startGameItem); //добавляем в "Game" вертикальные пункты "Start Game!" и "Close"
         gameMenu.add(testItem);
         gameMenu.add(closeItem);
         aboutMenu.add(restartItem);

         JFrame thisFrame=this; //конструкция позволяющая использовать ниже экземпляр класса JFrame
         restartItem.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Test Restart");
                 JOptionPane.showMessageDialog(thisFrame,"This is restart", "Upper window title", JOptionPane.WARNING_MESSAGE);
             }
         });

         testItem.addActionListener(e -> {
             //JOptionPane.showMessageDialog(thisFrame,"Test Frame messege","TEST ITEM",JOptionPane.ERROR_MESSAGE);
             String[] options={"Left","Forward","Right"};
             int n=JOptionPane.showOptionDialog(thisFrame,"Chose Da Wae!","Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
                                     //Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue
                                     //окно JFrame thisFrame=this; основн.сообщ, заголов окна, выбор опций, значок вопроса, ИКОНКА?, текст опций options , начальное положение выбора.
             System.out.println(options[n]);
         });

         closeItem.addActionListener(e -> { //анонимный внутренний класс написанный лямбдой.
             System.out.println("close CLICK");// с несколькими командами.
                 System.exit(0);
         });


            startGameItem.addActionListener(e -> {
                System.out.println("click on Start");

            });
         testItem.addActionListener(e-> System.out.println("Lambda test")); //анонимный внутренний класс написанный лямбдой.
        JButton jButton1=new JButton("HelloWord!");
        jButton1.addActionListener(e -> System.out.println("ItsHelloWorldButton!"));
        JButton jButton2=new JButton("2");
        JButton jButton3=new JButton("3");

        JPanel jPanel=new JPanel();//по умолчанию использует FlowLayout()

        setLayout(new BorderLayout());//обработчик кнопок (центр-север-юг-зап-вост)ДЕФОЛТНЫЙ
        //setLayout(new FlowLayout());//установка простого обработчика кнопок (ПОТОКОВЫЙ)
        add(jPanel,BorderLayout.CENTER);
        jPanel.add(jButton1);
         jPanel.add(new JButton("Button4"));
         jPanel.add(new JButton("Button5"));
         jPanel.add(new JButton("Button6"));
         jPanel.add(new JButton("Button7"));
         jPanel.add(new JButton("Button8"));
         jPanel.setLayout(new GridLayout(2,3,5,5));//обработчик типа ПЛИТКА




        add(jButton2,BorderLayout.NORTH);
        add(jButton3,BorderLayout.WEST);


         setJMenuBar(jMenuBar);
         setVisible(true); //ставится в низу (сначала дизайним-потом отрисовываем)
    }

 //startGameItem.addActionListener(new ActionListener() {
//        @Override
 //       public void actionPerformed(ActionEvent e) {
 //           System.out.println("click on Start");
//        }
//    });



    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
     //Test0 test0=
           //new GraphicInterface();
           SwingUtilities.invokeAndWait(new Runnable() {
               @Override
               public void run() {
                   new  GraphicInterface();
               }
           });
    }
}
