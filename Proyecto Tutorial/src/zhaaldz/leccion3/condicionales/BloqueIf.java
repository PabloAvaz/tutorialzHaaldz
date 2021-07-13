package zhaaldz.leccion3.condicionales;

/**
 * Ejecuta un bloque de codigo si se cumple una condicion
 * 
 * if (condicion) {
 *      bloque de codigo q se ejecuta SOLO si se cumple la condicion
 * } else {
 *      Bloque de codigo que se ejecuta SOLO si NO se cumple la condicon
 * }
 * 
 */
public class BloqueIf {

    public static void main(String[] args) {
        
        //If
        boolean saludar = true;
        if (saludar == true) { 
            System.err.println("Esta linea solo se imprime si el valor de saludar es true");
        }
        
        //Tambien se puede hacer asi
        if (saludar) { 
            System.err.println("Esta linea solo se imprime si el valor de saludar es true");
        }
        
        //IfElse
        int edad = 10;
        
        if (edad >= 18) { //Condicion: edad >= 18
            System.out.println("Legal");  //Si se cumple la condicion hace esto
        } else {
            System.out.print("Ilegal");  //Si NO se cumple la condicion hace esto
        }
        
        //IfElseIf
        int puntos = 0;
        
        if (puntos < 100) { //Condicion 1: puntos < 100
            System.out.println("Eres un manco"); 
        } else if (puntos <= 200) { //Si no se cumple -> Condicion 2: puntos < 200
            System.out.println("No eres malo"); 
        } else if (puntos <= 273) { //Si no se cumplen las anteriores -> Condicion 3: puntos < 273
            System.out.println("Eres bueno"); //Si se cumple la condicion hace esto
        } else {
            System.out.println("Toma la skin de Thanos"); //Si no se cumple NINGUNA condicion hace esto
        }

    }
}
