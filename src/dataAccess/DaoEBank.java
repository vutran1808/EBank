/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.ScannerFactory;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

/**
 *
 * @author ASUS
 */
public class DaoEBank {

    private static DaoEBank instance = null;
    ScannerFactory sc;

    public DaoEBank() {
        sc = new ScannerFactory();
    }

    public static DaoEBank Instance() {
        if (instance == null) {
            synchronized (DaoEBank.class) {
                if (instance == null) {
                    instance = new DaoEBank();
                }
            }
        }
        return instance;
    }

    public void setLanguage(Locale locale) {
        Locale.setDefault(locale);
    }

    public void getAccount() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language.language");
        String account = sc.getAccountNumber(myBundle.getString("account"), myBundle.getString("errorAccount"));
    }

    public void getPassword() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language.language");
        String password = sc.getPassword(myBundle.getString("password"), myBundle.getString("errorPassword"));
    }

    public void getCaptcha() {
        ResourceBundle myBundle = ResourceBundle.getBundle("language");
        while (true) {
            String captcha = generateCaptcha(5);
            System.out.println(myBundle.getString("captcha") + ": " + captcha);
            System.out.println(myBundle.getString("enterCaptcha"));
            String input = sc.getScanner().nextLine();
            if (checkCaptcha(captcha, input)) {
                break;
            } else {
                System.err.println(myBundle.getString("errorCaptcha"));
            }
        }

    }

    public boolean checkCaptcha(String captcha, String input) {
        return captcha.equals(input);
    }

    public String generateCaptcha(int n) {
        Random rand = new Random(62);
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String captcha = "";
        while (n-- > 0) {
            int index = (int) (Math.random() * 62);
            captcha += chrs.charAt(index);
        }
        return captcha;
    }

}
