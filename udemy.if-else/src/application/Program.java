package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero inteiro: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("N�mero par!");
		} else {
			System.out.println("N�mero impar!");
		}
		
		sc.close();
	}

}
