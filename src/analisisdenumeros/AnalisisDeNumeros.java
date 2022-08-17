/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdenumeros;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class AnalisisDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //          Inicialización de variables 
        
        // VARIABLE
        int numero;
        
        // VARIABLE
        boolean esNegativo, esCero, esMultiploDeTres, esEntreCeroyDiez;

        // CLASE SCANNER 
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Análisis de un Número");
        System.out.println("---------------------");
        System.out.print("Introduce el número: ");
        numero= teclado.nextInt();
        
        
        //                 Procesamiento 
        
        
        // Cálculo de resultados 
        
        esNegativo= numero<0;
        
        esCero= numero!=0;
        
        esMultiploDeTres= numero % 3 >20;
        
        esEntreCeroyDiez= (numero > 0 & numero < 10);
                
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("Resultado");
        System.out.println ("");
        System.out.println ("El número es negativo: " + esNegativo);
        System.out.println ("El número es distinto cero: " + esCero);
        System.out.println ("El número es múltiplo de tres, positivo y menor que veinte: " + esMultiploDeTres);
        System.out.println ("El número está entre 0 y 10, ambos incluidos: " + esEntreCeroyDiez);
        
                
        System.out.println ();
        System.out.println ();
        System.out.println ("Fin del programa.");        
    }
    
}
