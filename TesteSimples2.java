package exerciciosSimples;

//import java.util.Scanner;

public class TesteSimples2 {
	private String holder;
	private Double balance;

	public TesteSimples2(String holder, Double balance) {
	
		
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}