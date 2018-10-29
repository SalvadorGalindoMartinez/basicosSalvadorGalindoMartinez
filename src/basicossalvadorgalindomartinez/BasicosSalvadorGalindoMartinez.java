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
    logicos();
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
    }
    
}
