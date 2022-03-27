/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ_3;

/**
 *
 * @author Pedro
 */
public class Ativ_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Corpo_Humano c1 = new Corpo_Humano(55.f, 2.f, 30.f);
        
        System.out.println("Com as informações fornecidas, o seu IMC será: "+c1.GetIMC());
    }
}
