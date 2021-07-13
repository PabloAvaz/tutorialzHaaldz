package zhaaldz.leccion5.clases;

import java.util.Scanner;

public class ClaseScanner {
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.print("Hola, introduce tu nombre: ");
        String nombre = escaner.nextLine();
        
        System.out.print("Hola " + nombre + " introduce tu edad: ");
        int edad = escaner.nextInt();
        
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
    }
}
