import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args) {
		int Num1= 0, Num2=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Digite el primer valor: ");
		Num1= entrada.nextInt();
		System.out.println("Digite el primer valor: ");
		Num2= entrada.nextInt();
		System.out.println("La suma entre "+ Num1 + " + " + Num2 +" es: "+ suma(Num1, Num2));
		System.out.println("La resta entre "+ Num1 + " - " + Num2 +" es: "+ resta(Num1, Num2));
		System.out.println("La multiplicacion entre "+ Num1 + " * " + Num2 +" es: "+ multi(Num1, Num2));
	}
	/**Descripcion: El metodo suma tiene como tarea tomar dos numeros enteros y retonar el resutado
	 * pre: El metodo suma
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static int suma(int Num1, int Num2){
		int sum;
		sum= Num1+Num2;
		return sum;
	}
	public static int resta(int Num1, int Num2){
		int res;
		res= Num1-Num2;
		return res;
	}
	public static int multi(int Num1, int Num2){
		int multi;
		multi= Num1*Num2;
		return multi;
	}
}
