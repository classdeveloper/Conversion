package exercicios;

import java.util.Scanner;

public class Conversão {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String name;
		
		int idade;
		int mes;
		
		System.out.printf("Insira seu nome: ");
		name = ler.nextLine();
		
		System.out.printf("Insira a sua idade: ");
		idade = ler.nextInt();
		
		System.out.printf("Insira a quantidade de meses que falta até seu próximo aniversário: ");
		mes = ler.nextInt();
		
		int diastotais = (idade * 365) + mes * 30;
		
		System.out.println("\n" + name + " você tem " + diastotais + " de vida!");
		
	}
}