package util;

public interface IConstant {

    // Special characters <([{\^-=$!|]})?*+.>
    // Refer: https://docs.oracle.com/javase/tutorial/essential/regex/literals.html

    String ACCOUNT_NUMBER = "^[0-9]{10}$";
    String PASSWORD = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,31})$";
    int CAPTCHA_LENGTH = 5;
}
