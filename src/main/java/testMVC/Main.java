package testMVC;

import testMVC.controller.Controller;
import testMVC.model.Model;
import testMVC.visual.Window;



public class Main  {

    public static void main(String[] args) {
        Window window=new Window();
        window.init();
        Model model=new Model();
        Controller controller=new Controller(window);
        model.showButtonText();
        model.sendYes();


    }

}
