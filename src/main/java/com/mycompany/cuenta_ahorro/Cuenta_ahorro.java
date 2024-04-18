/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuenta_ahorro;

/**
 *
 * @author JUAN-SEBASTIAN
 */
public class Cuenta_ahorro {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
//        c1.setTitular("Juan");
//        c1.getTitular();
//        c1.setCantidad(5000);
        c1.Ingresar_Nombre();
        c1.getCantidad();
        c1.Ingresar();
        System.out.println(c1.toString());
        c1.Retirar();
        System.out.println(c1.toString());
        
    }
}
