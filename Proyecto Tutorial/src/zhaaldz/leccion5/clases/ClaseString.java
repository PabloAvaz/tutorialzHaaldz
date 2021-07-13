package zhaaldz.leccion5.clases;

public class ClaseString {

    public static void main(String[] args) {
        String texto = "Hola zHaalDz eres un grande";
        
        System.out.println("Repetir el texto: " + texto.repeat(2));
        System.out.println("Mayusculas: " + texto.toUpperCase());
        System.out.println("Minusculas: " + texto.toLowerCase());
        System.out.println("Caracter en la posicion 5 : " + texto.charAt(5));
        System.out.println("Primera vez que aparece zHaaldz: " + texto.indexOf("zHaalDz"));
        System.out.println("Dividir texto: " + texto.substring(5,17));
        System.out.println("Reemplazar un fragmento : " + texto.replace("grande", "idolo"));
        System.out.println("Compara un texto con otro : " + texto.equals("Hola zHaalDz eres un grande"));
    }
}
