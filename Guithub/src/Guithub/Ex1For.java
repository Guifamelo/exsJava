package Guithub;

import java.util.Scanner;

public class Ex1For {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		System.out.println("O os números de 1000 a 1999 que divididos por 11 obtemos resto = 5 são: ");
		int x=0,a;
		
		
		for (x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				System.out.println(x);
				
			}
		}
		

	
	}
}
