package util;

import java.util.Random;

public class Helper {

    /**
     * Don't let anyone instantiate this class.
     */
    private Helper() {
    }

    /**
     * Display menu.
     */
    public static void menu() {
        System.out.println("\n-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
    }

    /**
     * Returns generate captcha.
     *
     * @param length length of captcha
     * @return the string value
     */
    public static String generateCaptcha(int length) {
        String alpha = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            alpha += c;
        }
        String digits = "0123456789";
        String alphaNumeric = alpha + digits;

        String captcha = "";
        for (int i = 0; i < length; i++) {
            captcha += alphaNumeric.charAt(new Random().nextInt(alphaNumeric.length()));
        }
        return captcha;
    }
}
