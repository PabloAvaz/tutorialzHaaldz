package zhaaldz.leccion1.variables;

/**
 * Las constantes son variables que siempre tienen el mismo valor, es decir si
 * intentamos cambiarlo dará un error
 * Por convencion en java se escriben en mayuscula y separadas con _ 
 * Ejemplo de nombre: ESTO_ES_UNA_CONSTANTE
 */
public class Constantes {
    
    public static void main(String[] args) {
        //final sirve para declarar constantes
        final int MESES = 12;
        final String CIUDAD = "Ourense";
        
        //MESES = 23; //Esta linea da un error porque no se puede reasignar el valor de una constante
        
        System.out.println("Un año tiene " + MESES + " meses");
    }
    
}
