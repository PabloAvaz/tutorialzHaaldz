package zhaaldz.leccion2.operadores;

public class OperadoresLogicos1 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        boolean resultado;

        //Mayor q
        System.out.println("Comparaciones:  ");
        System.out.println("5 > 10 : " + (5 > 10));

        //Menor q
        System.out.println("5 < 10 : " + (5 < 10));

        System.out.println("=======================");

        //Igual
        System.out.println("5 == 6 : " + (5 == 10));

        //Igual
        System.out.println("5 == 5 : " + (5 == 5));

        //Distinto
        System.out.println("5 != 5 : " + (5 != 5));

        //Distinto
        System.out.println("5 != 4 : " + (5 != 4));

        System.out.println("=======================");

        //Mayor q
        System.out.println("7 > 7 : " + (7 > 7));

        //Mayor o igual q -> Es lo mismo q > + ==
        System.out.println("7 >= 7 : " + (7 >= 7));
    }
}
