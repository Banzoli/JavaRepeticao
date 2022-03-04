package Repeticao;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		 int num, soma=0;
		 
		 float media=0, cont=0;
		 
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Digite seu numero: ");
		 
		 num =ler.nextInt();
		 
		 if(num %3==0 && num!=0)
			 
		 {
			 
		 soma=soma+num;
		 
		 cont++;
		 
		 }
		 while(num!=0)
		{
			 System.out.println("Digite seu numero: ");
		 
			 num =ler.nextInt();
		 

		 if(num %3==0 && num!=0)
			 
		 {
			 
		 soma=soma+num;
		 
		 cont++;
		 
		 }}
		 
		 media=soma/cont;
		 
		 System.out.println("A media dos numeros e: "+media+".");

		}

	}