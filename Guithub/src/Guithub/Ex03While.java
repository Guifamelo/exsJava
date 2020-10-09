package Guithub;

import java.util.Scanner;

public class Ex03While {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int menosde=0, maisde=0,idade,x,y;
		
		System.out.println("Insira idade: ");
		idade= ler.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("Insira idade: ");
			idade= ler.nextInt();
			if(idade<21)
			{
				menosde++;
			}
			else if(idade>50)
			{
				maisde++;
			}
			else
			{
				
			}
		}
		
		System.out.printf("Qtde menor de 21: %d |Qtde maior de 50: %d",menosde,maisde);
		
	
	
	}
	
}
