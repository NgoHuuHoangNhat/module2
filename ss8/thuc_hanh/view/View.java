package ss8.thuc_hanh.view;

import ss8.thuc_hanh.controller.MainController;
import ss8.thuc_hanh.model.Student;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.showMenu();
    }
}
