package Repeticao;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		int I = 0,IM = 0,IMI = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		
		I =ler.nextInt();
		
		if(I < 21) {
			
			IM = IM + 1;
			
		}
		
		if(I > 50) {
			
			IMI = IMI + 1;
			
		}
		
		System.out.println("idade menor que 21: "+ IM);
		
		System.out.println("idade maior que 50: "+IMI);

	}

}
