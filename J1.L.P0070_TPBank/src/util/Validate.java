package util;

import java.util.Scanner;

public class Validate {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Don't let anyone instantiate this class.
     */
    private Validate() {
    }

    /**
     * Returns an input integer from the keyboard.
     *
     * @param messageInfo message info
     * @param min         minimum limit value
     * @param max         maximum limit value
     * @return the integer value
     */
    public static int getInt(String messageInfo, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Numeric value out of range.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer number.");
            }
        } while (true);
    }

    /**
     * Returns an input string from the keyboard.
     *
     * @param messageInfo  message info
     * @param REGEX        the pattern to test string is valid or not
     * @param messageError message error
     * @return the string value
     */
    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = scanner.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }

    /**
     * Returns result verify captcha.
     *
     * @param messageInfo     message info
     * @param messageError    message error
     * @param captchaGenerate captcha to compare
     * @return <code>true</code> if captcha match; <code>false</code> otherwise
     */
    public static boolean verifyCaptcha(String messageInfo, String messageError, String captchaGenerate) {
        String captchaInput;
        do {
            captchaInput = getCaptcha(messageInfo);
            if (captchaGenerate.contains(captchaInput)) {
                break;
            }
            System.out.println(messageError);
        } while (true);
        return true;
    }

    /**
     * Returns captcha from the keyboard.
     *
     * @param messageInfo message info
     * @return the string value
     */
    public static String getCaptcha(String messageInfo) {
        System.out.print(messageInfo);
        return scanner.nextLine();
    }
}
