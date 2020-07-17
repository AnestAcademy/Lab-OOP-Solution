package util;

public interface IConstant {

    // Special characters <([{\^-=$!|]})?*+.>
    // Refer: https://docs.oracle.com/javase/tutorial/essential/regex/literals.html

    String NAME = "^[A-Za-z ]+$";
    String PHONE = "^[0-9]{10,}$";
    String EMAIL = "^([\\w\\-\\.]+)@([\\w\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    String ADDRESS = "[A-Za-z0-9 ,\\-\\./]+$";
    String TEXT = "^[A-Za-z0-9 ,\\.]+$";
    String YES_NO = "^[yYnN]$";
}
