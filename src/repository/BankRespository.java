/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DaoEBank;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class BankRespository implements IBankRespository{

    @Override
    public void setLocate(Locale locale) {
        DaoEBank.Instance().setLanguage(locale);
    }

    @Override
    public void checkAccountNumber() {
        DaoEBank.Instance().getAccount();
    }

    @Override
    public void checkPassword() {
        DaoEBank.Instance().getPassword();
        DaoEBank.Instance().getCaptcha();
    }  
}
