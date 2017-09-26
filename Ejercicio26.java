/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     * de pide una temperatura y se pide si se quiere pasar Celsius o 
     * Fahrenheit, hacer la cuenta y mostrar el resultado
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        String respuesta;
        Double temperatura;
        
        Scanner Misc= new Scanner(System.in);
        
        System.out.println("Indique temperatura: ");
        datoAux= Misc.next();
        temperatura= Double.parseDouble(datoAux);
        
        System.out.println("¿Quiere ver la temperatura en grados Fahrenheit?" );
        respuesta= Misc.next();
        
        if (respuesta.equals("si"))
            
        { temperatura= ((temperatura*1.8)+32);
            System.out.println("La temperatura es "+temperatura+" grados Farenheint.");}
        
        
        else{ System.out.println("La temperatura es "+temperatura+" grados Celsius." );}
        
        
       
      
        
        
    }
    
}
