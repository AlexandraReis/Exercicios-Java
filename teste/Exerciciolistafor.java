package teste;

import java.util.Scanner;

public class Exerciciolistafor {
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	public static void main(String[] args) {
		int x, contImpar = 0, contPar = 0, num;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;

			}

		}
		System.out.println("\nQuantidade de n�meros pares:" + contPar);
		System.out.println("\nQuantidade de n�meros impares: " + contImpar);

	}

}
