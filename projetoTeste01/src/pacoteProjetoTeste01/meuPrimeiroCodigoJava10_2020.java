package pacoteProjetoTeste01;

import java.util.Scanner;

public class meuPrimeiroCodigoJava10_2020 {
	public static void main (String args[])
	{
		Scanner ler =new Scanner(System.in);
		
		int a,b,c,soma,dias,meses,anos,ano,anodia,mesdia,totaldia,d ,e, f;
		
		System.out.println("Qual ano vc nasceu? ");
		a = ler.nextInt();
		System.out.println("Qual mês vc nasceu? ");
		b =ler.nextInt();
		System.out.println("Qual dia vc nasceu? ");
		c =ler.nextInt();
	
		
		System.out.println("Em qual ano estamos? ");
		d = ler.nextInt();
		System.out.println("Em qual mês estamos? ");
		e =ler.nextInt();
		System.out.println("Em qual dia estamos? ");
		f =ler.nextInt();
						
		ano= d-a;
		meses= e-b;
		dias= 30-c;
						
		
	//	dias =  30 -c;
	//	meses = 12 - b;		
	//	ano = 2020 - a;
		
		anodia=ano*365;
		mesdia=meses*30;
				
		totaldia=dias+mesdia+anodia;
		
		System.out.printf("Vc está com " + totaldia +" dias vivídos!");
	}
	

}
