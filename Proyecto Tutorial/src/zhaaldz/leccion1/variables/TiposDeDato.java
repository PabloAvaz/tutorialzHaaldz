package zhaaldz.leccion1.variables;

public class TiposDeDato {

    public static void main(String[] args) {
        //Texto
        char letra = 'a'; //1 caracter cualquiera
        String baloteli = "Viva la Baloteli"; //Un texto de multiples caracteres

        //Booleanos
        boolean zHaalDzEsElMejor = true; //Verdadero
        boolean wokiSeComeASuGato = false; //Falso

        //Numeros
        byte miniEntero = 111; //Numero de -128 a 127
        short enterito = 3333; //Numero de -32.768 a 32.767.
        int entero = 555555555; //Numero de -2^31 a 2^31
        long enterazo = 999999999; //Numero de -2^63 a 2^63
        float decimalito = 23.423F; //Numero decimal pequeño
        double decimalazo = 232332323.83918239214917491; //Numero decimal grande

        System.out.println("======== Texto ========");
        System.out.println("Letra: " + letra);
        System.out.println("Baloteli: " + baloteli);
        System.out.println("");

        System.out.println("======== Booleanos ========");
        System.out.println("zHaalDzEsElMejor: " + zHaalDzEsElMejor);
        System.out.println("WokiSeComeASuGato: " + wokiSeComeASuGato);
        System.out.println("");

        System.out.println("======== Numeros ========");
        System.out.println("MiniEntero: " + miniEntero);
        System.out.println("Enterito: " + enterito);
        System.out.println("Entero: " + entero);
        System.out.println("Enterazo: " + enterazo);
        System.out.println("Decimalito: " + decimalito);
        System.out.println("Decimalazo: " + decimalazo);
    }
}
