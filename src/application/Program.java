package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print(" How many rooms will be rented? ");
		int quartos = sc.nextInt();
		Rent[] rent = new Rent[10];

		for (int i = 1; i <= quartos; i++) {

			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email); /*
												 * Aqui o vetor recebe o numero inteiro que indica qual quarto esta
												 * sendo alugado, esse indicador vai apontar dentro do vetor...
												 */

			System.out.println("Cadastro de hospede COMPLETO!");
			System.out.println();
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		sc.close();
	}
}
