package zhaaldz.leccion5.clases;


public class ClaseMath {
    public static void main(String[] args) {
        //Algunos de los metodos mas importantes de la clase Math
        System.out.println("Pi: " + Math.PI); //Raiz cuadrada
        System.out.println("Raiz cuadrada: " + Math.sqrt(25)); //Raiz cuadrada
        System.out.println("Potencia: " + Math.pow(2, 3)); //Eleva el primer numero (base) al segundo (exponente)
        System.out.println("Numero mayor: " + Math.max(4, 7)); //Compara dos numeros y devuelve el mayor
        System.out.println("Numero menor: " + Math.max(4, 7)); //Compara dos numeros y devuelve el menor
        System.out.println("Redondeo normal: " + Math.round(5.5)); //Redondo normal (0.5 pasa al siguiente numero)
        System.out.println("Redondeo hacia arriba: " + Math.ceil(5.1)); //Redonda siempre hacia arriba
        System.out.println("Redondeo hacia abajo: " + Math.floor(5.9)); //Redondo siempre hacia abajo
        System.out.println("Valor absoluto: " + Math.abs(-23)); //Devuelve el valor absoluto de un numero
        System.out.println("Numero aleatorio: " + Math.random()); //Devuelve un numero aleatorio
        
    }
}
