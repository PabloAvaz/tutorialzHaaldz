package zhaaldz.leccion6.metodos;

/**
 * Cuando un bloque de codigo se repite varias veces hay que crear un metodo 
 * o funcion para no tener que escribir el mismo bloque de codigo varias veces
 * 
 */
public class Metodos {

    public static void main(String[] args) {
        saludar();
        saludar();
        saludar();
        saludar();
        imprimir("zHaaldz es el mejor");
        imprimir("Viva Katy");
    }

    public static void saludar() {
        System.out.println("Hola a todos!");
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
}
