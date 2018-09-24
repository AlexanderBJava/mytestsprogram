package testMVC.controller;

import testMVC.model.Model;
import testMVC.visual.Window;

public class Controller {
    Window window;
    public Controller(Window window1) {
        this.window=window1;
    }

    public static void sendButtonText(String buttonText) {
        Model.incomingButtonText(buttonText);
    }

    public static void sendYes(String yes) {
        Window.getYes(yes);
    }
}
