package util;

public interface IConstant {

    // Special characters <([{\^-=$!|]})?*+.>
    // Refer: https://docs.oracle.com/javase/tutorial/essential/regex/literals.html

    String CUSTOMER_NAME = "^[a-zA-Z ]+$";
    String FRUIT_NAME = "^[a-zA-Z0-9 \\-]+$";
    String ORIGIN = "^[a-zA-Z0-9 \\-,]+$";
    String YES_NO = "^[yYnN]$";
}
