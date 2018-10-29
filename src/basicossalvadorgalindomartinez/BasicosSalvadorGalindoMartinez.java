/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicossalvadorgalindomartinez;

/**
 *
 * @author Salvador Galindo Martínez <your.name at your.org>
 */
public class BasicosSalvadorGalindoMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    numericos();
    cadenas();
    }
    
    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos(){
    
        //Estos son los tipos básicos
        byte elmaspequeño;
        short elsiguientemaspequeño;
        int entero;
        long superlargo;
        float decimalsimple;
        double decimaldoble;
        
        //Ejemplos de asignación de valores a las variables de tipos básicos
         elmaspequeño = 0;
         elsiguientemaspequeño = 3;
         entero = 15;
         superlargo = 1234567890;
         decimalsimple = 3.4f;
         decimaldoble = 13.3;
         
         //Mostrar en pantalla el contenido de las variables de tipos básicos
         System.out.println("Valor byte");
         System.out.println(elmaspequeño);
         System.out.println("Valor short");
         System.out.println(elsiguientemaspequeño);
         System.out.println("Valor int");
         System.out.println(entero);
         System.out.println("Valor long");
         System.out.println(superlargo);
         System.out.println("Valor float");
         System.out.println(decimalsimple);
         System.out.println("Valor double");
         System.out.println(decimaldoble);
         System.out.println("");
    }
    /**
     * Método para mostrar ejemplos de tipo cadenas.
     */
    public static void cadenas(){
        
        //Esta es la clase String
        String cadenadetexto;
        String s2, s3, s4, s5,s6;
        
        //Ejemplo de asignación de valores a la clase String
        cadenadetexto = "Hola, soy Salvador Galindo Martínez";
        s2 = "Hola, ";
        s3 = "soy ";
        s4 = "Salvador ";
        s5 = "Galindo ";
        s6 = "Martínez";
        
        //Mostrar en pantalla el contenido de la clase String.
        System.out.println("Contenido del primer String");
        System.out.println(cadenadetexto);
        System.out.println("");
        System.out.println("Contenido del resto de Strings");
        System.out.println(s2 + s3 + s4 + s5 + s6);
        System.out.println("");
        
    }
}
