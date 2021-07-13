package zhaaldz.leccion4.bucles;

/**
 * Ejecuta un bloque de codigo mientras se cumpla una condicion
 * 
 * while (condicion) {
 *      bloque de codigo
 * }
 */
public class BucleWhile {
    
    public static void main(String[] args) {
        int edad = 0;
        
        while(edad < 18) {
            System.out.println("Todavia eres menor de edad, tienes " + edad + " años");
            edad = edad + 1;
        }
        
        System.out.println("Ya eres mayor de edad!");
    }
    
}
