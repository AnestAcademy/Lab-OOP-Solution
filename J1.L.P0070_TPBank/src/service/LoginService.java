package service;

import entity.Account;
import mock.Data;
import util.Helper;
import util.IConstant;
import util.Validate;

import java.util.ResourceBundle;

public class LoginService {

    /**
     * Login process.
     *
     * @param resourceBundle resources language
     */
    public void loginProcess(ResourceBundle resourceBundle) {

        String account = Validate.getString(
                resourceBundle.getString("account"),
                resourceBundle.getString("accountInvalid"),
                IConstant.ACCOUNT_NUMBER
        );
        String password = Validate.getString(
                resourceBundle.getString("password"),
                resourceBundle.getString("passwordInvalid"),
                IConstant.PASSWORD
        );

        String captchaGenerate = Helper.generateCaptcha(IConstant.CAPTCHA_LENGTH);
        System.out.print(resourceBundle.getString("captcha") + captchaGenerate + "\n");

        Validate.verifyCaptcha(
                resourceBundle.getString("inputCaptcha"),
                resourceBundle.getString("captchaIncorrect"),
                captchaGenerate
        );

        if (authentication(account, password)) {
            System.out.println(resourceBundle.getString("loginSuccess"));
        } else {
            System.out.println(resourceBundle.getString("loginFailed"));
        }
    }

    /**
     * Returns result the authentication.
     *
     * @param account  to authentication
     * @param password to authentication
     * @return <code>true</code> if authentication successfully; <code>false</code> otherwise
     */
    private boolean authentication(String account, String password) {
        for (Account a : Data.listAccount) {
            if (account.equals(a.getAccount()) && password.equals(a.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
