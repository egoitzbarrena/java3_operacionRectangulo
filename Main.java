import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Main {

	public static void main (String args[]) {

		double altura,base, resultadoArea, resultadoPerimetro ;
		Rectangulo rectangulo = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la ALTURA del rectangulo: ");
		altura = sc.nextDouble();
		System.out.print("\ningresa la BASE del rectangulo: ");
		base = sc.nextDouble();
		rectangulo.setAltura(altura);
		rectangulo.setBase(base);

		resultadoArea = rectangulo.area();

		System.out.println("\nEl AREA del RECTANGULO es: " + resultadoArea);

		resultadoPerimetro = rectangulo.perimetro();
	
		System.out.println("\nLa PERIMETRO del RECTANGULO es: " + resultadoPerimetro);

	}
}
