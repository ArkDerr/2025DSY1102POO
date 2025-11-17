/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosemana14_1;

import com.mycompany.ejemplosemana14_1.controller.MenuController;
import com.mycompany.ejemplosemana14_1.view.Menu;

/**
 *
 * @author Cetecom
 */
public class EjemploSemana14_1 {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setAlwaysOnTop(true);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        MenuController menucontroller = new MenuController(menu);
    }
}
