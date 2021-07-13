package zhaaldz.leccion5.clases;

public class ImprimirConFormato {

    public static void main(String[] args) {
        String nombre = "Pipo";
        int edad = 4;
        boolean huerfano = false;
        
         /**
         * \n -> Salto de linea (Como un enter)
         * %s -> Cadena de texto
         * %d -> Numero entero
         * %b -> booleano
         */
        System.out.printf("Nombre: %s\nEdad: %d\nHuerfano: %b\n", nombre, edad, huerfano);

    }
}
