package Repeticao;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		int N,X,P = 0,I = 0;
			
		Scanner ler = new Scanner(System.in);

		for (X=1; X < 11; X++) {
			
			System.out.println("Escreva um numero: ");
	
			N =ler.nextInt();
	
			if(N % 2 == 1) {
				P = P + 1
				;
				
			}
	
			else {
				
				I = I+ 1;
				
			}
		}
		
		System.out.println(P +" são pares, "+I+" são impares.");
		
	}
}