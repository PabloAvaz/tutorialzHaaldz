package zhaaldz.leccion1.variables;

/**
 * Una variable es un espacio reservado en la memoria que tiene la capacidad de 
 * cambiar de contenido
 * 
 * Sintaxis:
 * <TipoDeDato> <nombreVariable> = <ValorVariable>;
 * <TipoDeDato>: Dato que almacena la variable
 * <nombreVariable>: Nombre de la variable: Puede ser cualquier nombre, salvo palabras reservadas* y no puede contener algunos caracteres especiales*
 */
public class Variables {

    public static void main(String[] args) {
        String nombre = "Ruben";
        System.out.println("Hola " + nombre);

        int mascotas = 1;
        System.out.println(nombre + " tiene " + mascotas + " mascotas");
        
        //Ejemplo en el que se utiliza la misma variable para guardar distinta informacion
        nombre = "Wokero";
        mascotas = 2;
        System.out.println(nombre + " tiene " + mascotas + " mascotas");
    }
}
