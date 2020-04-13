package exerciciosSimples;

import java.util.Locale;

public class ExercicioIniciante05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A=12.7, B=10.4, C=15.2;
		
		
		double triangulo=(A*C)/2;
		
		double circulo=3.14159*Math.pow(C,2);
		
		double trapezio=((A+B)*C)/2;
		
		double quadrado=B*B;
		
		double retangulo=A*B;
		
		System.out.printf("Triangulo %.3f\n", triangulo);
		System.out.printf("Circulo %.3f\n", circulo);
		System.out.printf("Trapezio %.3f\n", trapezio);
		System.out.printf("quadrado %.3f\n", quadrado);
		System.out.printf("Retangulo %.3f\n", retangulo);
		
		
		
	}

}
