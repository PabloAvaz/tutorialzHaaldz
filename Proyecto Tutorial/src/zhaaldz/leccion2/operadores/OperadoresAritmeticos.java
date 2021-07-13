package zhaaldz.leccion2.operadores;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int resultado;
		
		//Suma
		resultado = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + resultado);
		
		//Resta
		resultado = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + resultado);
		
		//Multiplicacion
		resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		
		//Division
		resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		
		//Resto
		resultado = num1 % num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
	}
}
