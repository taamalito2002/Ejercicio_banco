/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta_ahorro;

import java.util.Scanner;

/**
 *
 * @author JUAN-SEBASTIAN
 */
public class Cuenta {
    
    Scanner sc = new Scanner(System.in);
    
    private String titular; 
    private double cantidad;
    double retirar;
    

    public Cuenta() {
        
        
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
    
    public void Ingresar_Nombre(){
        String Vacio;
       System.out.print("Ingrese su nombre: ");
       Vacio = sc.nextLine();
       if("".equals(Vacio) ){
           titular = "Anonimo";
       }else{
           titular = Vacio;
       }
       
      
    }
    
    
    public void Ingresar(){
       double validate;
       do {
              System.out.print("Ingrese la cantidad que desea guardar en la cuenta");
              validate = sc.nextDouble();
       } while (validate < 0);

       cantidad = validate;

    }
    
    
    
    
    
    public void Retirar(){
        System.out.print("Ingrese la cantidad a retirar: ") ;
        retirar = sc.nextDouble();
        if (retirar<0){
            System.out.println("Error, No se puede ingresar cantidades inferiores a 0");
        }else{
            cantidad = cantidad-retirar;
            System.out.println("El total de su cuenta es: "+cantidad);
        }
        
        
    }
    
    
     @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    
}

