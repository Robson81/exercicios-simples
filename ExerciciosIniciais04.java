package exerciciosSimples;

import java.util.Locale;
public class ExerciciosIniciais04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		int qtd1=1, qtd2=2;
		double valor1=5.30, valor2=5.10;
		
		double preco_total=qtd1*valor1, preco_total2=qtd2*valor2;
		double total=preco_total + preco_total2;
		//System.out.println("Number: "+ number);
		System.out.printf("Valor a pagar: U$ %.2f\n", preco_total);
		System.out.printf("Valor a pagar: U$ %.2f\n", preco_total2);
		System.out.printf("Valor a pagar: U$ %.2f\n", total);
		
		
	}

}
