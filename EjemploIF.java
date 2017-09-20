/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in); 
        //defino variables
        String nombre;
        String clave;
        String sexo;
        String localidad;
        String colorfavorito;
        //tomo datos
        System.out.println("Ingrese nombre");
        nombre= misc.next();
        
        System.out.println("Ingrese clave: ");
        clave= misc.next();
        
        System.out.println("Ingrese sexo: ");
        sexo= misc.next();
        
        System.out.println("Ingrese localidad: ");
        localidad= misc.next();
        
         System.out.println("Ingrese su color favorito: ");
        colorfavorito= misc.next();
      /**
       * Si es masculino que vive en lanus o avellaneda y que su color favorito
       * sea el rojo motrar el mensaje: Sos de independiente
       * Si el nombre es Andrea la localidad es moron y el color favorito es 
       * verde o azul, mostrar mensaje: Feliz primavera
       * 18.se pide el seño y el nombre, si es F de femenino, se muestra el 
       * mensaje "feliz dia XXXX donde XXXX es el nombre"
       * 19.se pide el nombre,sexo,localidad. si se llama jose o maria 
       */
      
      if ((sexo.equals("m"))&& colorfavorito.equals("rojo"))
      
      if (localidad.equals("lanus")|| localidad.equals("avellaneda"))
      {System.out.println("SOS DE INDEPENDIENTE");}
      
      if (nombre.equals("andrea")&& localidad.equals("moron"))
              
      if (colorfavorito.equals("verde")|| colorfavorito.equals("azul"))
              
              {System.out.println("Feliz Primavera");}
      
     
      
   
      
         if (nombre.equals("admin"))
           { 
            System.out.println("BIENVENIDO AMINISTRADOR");
           }
        
        else   
           { System.out.println("BIENVENIDO " +nombre);
       
          }
         if (sexo.equals("f"))
         {System.out.println("FELIZ DIA DE LA MUJER");}
       
        if (localidad.equals("lanus")&& sexo.equals("f"))
        {System.out.println("BIENVENIDA");}
        
        
        if (colorfavorito.equals("celeste") || colorfavorito.equals("blanco"))
        {System.out.println("Patriota");}
               
//        if (colorfavorito.equals("celeste")){
//            System.out.println("Sos un patriota");
//          }
//        if (colorfavorito.equals("blanco")){
//            System.out.println("Sos un patriota");
//        }
        
        
        
        
    }
    
}
