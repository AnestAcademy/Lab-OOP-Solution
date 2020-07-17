package main;

import service.LoginService;
import util.Helper;
import util.Validate;

import java.util.Locale;
import java.util.ResourceBundle;

public class TPBank {

    public static void main(String[] args) {

        Helper.menu();
        int choice = Validate.getInt("Please choice one option: ", 1, 3);

        switch (choice) {
            case 1:
                Locale.setDefault(new Locale("vi", "VN"));
                break;
            case 2:
                Locale.setDefault(new Locale("en", "US"));
                break;
            case 3:
                System.exit(0);
                break;
        }

        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/Language");
        new LoginService().loginProcess(resourceBundle);
    }
}

