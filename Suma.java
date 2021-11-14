//Suma.java
//Programa que muestra la suma de dos entreros
import java.util.Scanner; //El programa usa la clase Scanner

public class Suma{
	//El metodo main
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		int suma;

		System.out.print("Escriba el primer numero entero: "); //Pide el primer numero
		numero1 = entrada.nextInt(); //Lee el primer numero

		System.out.print("Escriba el segundo numero entero: "); //Pide el segundo numero
		numero2 = entrada.nextInt(); //Lee el segundo numero

		suma = numero1 + numero2; //Suma los numeros

		System.out.printf("La suma es: %d\n ", suma); //Muestra la suma

	} //Fin del metodo main

}//Fin de la clase suma