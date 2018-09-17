package testMVC.model;

import testMVC.controller.Controller;

public class Model {



    private static  String buttonText;

    public static void incomingButtonText(String buttonText) {
        Model.buttonText=buttonText;
        System.out.println(buttonText);
    }

    public static String getButtonText() {
        return buttonText;
    }

    public void showButtonText(){
        System.out.println(buttonText);
    }

    public void sendYes(){
        String yes= "YES";
        Controller.sendYes(yes);
    }

}
