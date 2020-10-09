package Guithub;

import java.util.Scanner;

public class Ex2For {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int num, x=0, conti=0, contp=0; 
		
		for(x=0;x<10;x++)
		{
			
		
			
		System.out.println("Digite um valor: ");
		num = ler.nextInt();
		
			if(num%2==1)
			{
				conti++;
			}
			else
			{
				contp++;
			}
		}	
		
		System.out.printf("Qtde de pares: %d | Qtde de ímpares: %d ",contp,conti);
	}

}
