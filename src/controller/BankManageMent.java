/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import repository.BankRespository;
import repository.IBankRespository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class BankManageMent extends Menu {

    static String mc[] = {"Vietnamese", "English", "Exit"};
    IBankRespository mn;

    public BankManageMent() {
        super("Login program", mc);
        mn = new BankRespository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                mn.setLocate(new Locale("vn", "VN"));
                mn.checkAccountNumber();
                mn.checkPassword();
            }
            case 2 -> {
                mn.setLocate(new Locale("en", "US"));
                mn.checkAccountNumber();
                mn.checkPassword();
            }
            case 3 ->
                System.exit(0);
        }
    }

}
