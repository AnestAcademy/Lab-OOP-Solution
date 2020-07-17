package mock;

import entity.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock initial data.
 */
public class Data {

    public static List<Account> listAccount = new ArrayList<Account>() {
        {
            add(new Account("1550002323", "1234xxx89FF"));
            add(new Account("1550002324", "abc444xxx888F"));
            add(new Account("1550002325", "12345678Gxx"));
            add(new Account("1550002326", "abc123XXX"));
        }
    };
}
