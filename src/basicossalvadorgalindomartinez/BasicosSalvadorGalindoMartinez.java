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
    logicos();
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
    
        /**
     * Método para mostrar las comparaciones de variables de tipo lógicos
     */
    public static void logicos(){
    
        //Ejemplos de tipos logicos
        int x = 20;
        int y = 10;
        boolean compara;
        compara = (x>y); //Aquí le damos la instrucción de que mire si x es mayor que y es verdadero o falso.
        System.out.println("x>y es: " + compara); //Y aquí le damos la instrucción de que lo saque por consola.
        
        compara = (x<y); //Aquí al reves, si x es menor que y.
        System.out.println("x<y es: " + compara); //Salida por consola.
        
        compara = (x==y); //En esta instrucción decimos que x es igual que y.
        System.out.println("x==y es: " + compara); //Y lo sacamos por consola.
        
        compara = (x!=y); //Ahora estamos diciendo que x no es igual que y.
        System.out.println("x!=y es: " + compara); //Sale por consola.
        
        compara = (x>y && x>=y); //Aquí estamos utilizando el operador lógico && y la instrucción significa que x es mayor que y, y x es mayor o igual que y.
                                 //Si ambas expresiones son verdaderas el resultado será verdadero.
        System.out.println("x>y y x>=y es: " + compara); //Como ambas expresiones son verdaderas el resultado es verdadero, si una fuese falsa, el resultado sería falso.
        
        compara = (x<y || x>y); //Aquí estamos utilizando || (or) si alguna expresión es verdadera el resultado será verdadero.
        System.out.println("x<y o x>y es: " + compara); //Una de las expresiones es verdadera, por lo tanto el resultado es verdadero.
        System.out.println("");
    }
    
}
