/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.Locale;

/**
 *
 * @author ASUS
 */
public interface IBankRespository {
    void setLocate(Locale locale);
    void checkAccountNumber();
    void checkPassword();
}
