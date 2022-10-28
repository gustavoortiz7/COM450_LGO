/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial_practica;

import java.util.Scanner;

/**
 *
 * @author GUSTAVO ORTIZ
 */
public class Parcial_Practica {

    public static void main(String[] args) {
        Funcion f = new Funcion();
        
        //Scanner sc =new Scanner(System.in);
        //System.out.println("introducir varaible : ");
        //String n,x;
        //boolean a;
       // n = sc.next();
        //System.out.println("introducir Variable3: ");    
        //a = sc.nextBoolean();
        //System.out.println("introducir Variable2: ");    
        //x = sc.next();
        String resultado;
        resultado = f.ObtenerAccion("si",true);
        System.out.println("RESULTADO = "+resultado);
    }
}
