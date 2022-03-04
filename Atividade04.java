package Repeticao;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

	  int calmas = 0,Mnervosas = 0,HAgressivos = 0, JCalmos = 0,Ocalmos = 0,NIdosos = 0,total = 0,idade;
	  
	  char sexo,caracteristica;
	  
	  Scanner ler = new Scanner(System.in);

	  
	  for (total=0;total < 5; total++) {
	    
	    System.out.println("Informe idade ");
	    
	    idade = ler.nextInt();
	    
	    System.out.println("\nInforme sexo (M)asculino, (F)eminino ou (O)utro");
	    
	    sexo = ler.next().charAt(0);
	    
	    System.out.println("\nInforme a característica (C)alma, (N)ervosa, (A)gressiva ");
	    
	    caracteristica = ler.next().charAt(0);
	  
	    if (caracteristica == 'C' ){
	    	
	    	calmas++;
	    	
	    	};
	    	
	    if(sexo=='F' && caracteristica=='N'){
	    	
	    	Mnervosas++;
	    	
	    	};
	    	
	    if(idade>40){
	    	
	    	NIdosos++;
	    	
	    };
	    
	    if(sexo=='M' && caracteristica=='A'){
	    	
	    	HAgressivos++;
	    	
	    };
	    
	    if(caracteristica =='C' && idade<18){
	    	
	    	JCalmos++;
	    	
	    };
	  };


	  System.out.println("Total de pessoas calmas " + calmas);
	  
	  System.out.println("Total de mulheres nervosas "+ Mnervosas);
	  
	  System.out.println("Total de homens agressivos " + HAgressivos);
	  
	  System.out.println("Total de outros calmos " + Ocalmos);
	  
	  System.out.println("Total de pessoas nervosas com mais de 40 anos " +NIdosos);
	  
	  System.out.println("Total de pessoas calmas com menos de 18 anos " + JCalmos);

	}
}