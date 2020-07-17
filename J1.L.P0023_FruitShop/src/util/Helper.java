package util;

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
        System.out.println("\nFRUIT SHOP SYSTEM");
        System.out.println("1. Create fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
    }

    /**
     * Returns continue option.
     *
     * @param message
     * @return <code>true</code> if value input is [y] or [Y]; <code>false</code> otherwise
     */
    public static boolean isContinue(String message) {
        String c = Validate.getString(message, "Only [Y/N].", IConstant.YES_NO);
        return c.equalsIgnoreCase("y");
    }
}
