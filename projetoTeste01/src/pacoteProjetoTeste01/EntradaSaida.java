package pacoteProjetoTeste01;

import java.util.Scanner;

public class EntradaSaida {
	public static void main (String args[])
	{
		Scanner ler =new Scanner(System.in);
		
		int a,b,c,soma,dias,meses,anos,ano,anodia,mesdia,totaldia;
		
		System.out.println("Qual ano vc nasceu? ");
		a = ler.nextInt();
		System.out.println("Qual mês vc nasceu? ");
		b =ler.nextInt();
		System.out.println("Qual dia vc nasceu? ");
		c =ler.nextInt();
		
		dias =  30 -c;
		meses = 12 - b;		
		ano = 2020 - a;
		
		anodia=ano*365;
		mesdia=meses*30;
				
		totaldia=dias+mesdia+anodia;
		
		System.out.printf("Vc está com " + totaldia +" dias vivídos!");
	}
	

}
