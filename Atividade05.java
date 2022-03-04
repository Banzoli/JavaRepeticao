package Repeticao;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		int num, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os numeros \n");
		
		do {
			num =ler.nextInt();
		    
		    soma=soma+num;
		    
		   } while(num !=0);
		
		System.out.println("A soma é " + soma + ".");
		

		
	}
}