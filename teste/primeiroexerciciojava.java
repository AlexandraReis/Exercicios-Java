package teste;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.


import java.util.Scanner;

public class primeiroexerciciojava {

	public static void main(String[] args) {
		
	int n1,n2,n3;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEscreva um número: ");
	n1 = leia.nextInt();
	System.out.println("\nEscreva um número: ");
	n2 = leia.nextInt();
	System.out.println("\nEscreva um número: ");
	n3 = leia.nextInt();
		
	
		if (n1 >= n2 && n1 >= n3) {
		System.out.println("\nO maior número é:  "+n1);
	}else if (n2 >= n1 && n2 >= n3) {
		System.out.println("\nO maior número é:  "+n2);
	}else {
		System.out.println("\nO maior número é: "+n3);
	}

	}

}
