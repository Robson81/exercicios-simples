package exerciciosSimples;
import java.util.Locale;

public class TesteRenomear_01 {

	public static void main(String[] args) {
	
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender ='F';
		
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is: $%.2f%n", product1, price1);
		System.out.printf("%s, which price is: $%.2f%n%n", product2, price2);
		System.out.printf("Record: "+age+" yers old, code: "+code+" and gender: %c\n\n",gender);
		//System.out.printf("%n%n%n");
		System.out.printf("whith eight decimal places: %f00%n", measure);
		System.out.printf("Rouded (Three decima. places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
