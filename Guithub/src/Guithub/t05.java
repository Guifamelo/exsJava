package Guithub;

import java.util.Scanner;

public class t05 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int num, soma=0;
		
		do
		{
			System.out.println("Digite um número: ");
			num= ler.nextInt();
			
			soma=soma+num;
			
		}
		while(num!=0);
		
			//System.out.println("Digite um número: ");
			//num= ler.nextInt();
			
			
		
		//soma=soma+num;
		
		System.out.printf("a soma é: %d",soma);
		
		
	}
	

}