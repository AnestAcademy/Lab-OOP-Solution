package util;

import java.util.Calendar;

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
        System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }

    /**
     * Returns continue option.
     *
     * @return <code>true</code> if value input is [y] or [Y]; <code>false</code> otherwise
     */
    public static boolean isContinue() {
        String c = Validate.getString("Do you want to continue (Y/N)? ", "Only [Y/N].", IConstant.YES_NO);
        return c.equalsIgnoreCase("y");
    }

    /**
     * Returns current year.
     *
     * @return the integer value
     */
    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
