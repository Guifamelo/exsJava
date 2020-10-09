package Guithub;

import java.util.Scanner;

public class Ex02Ljava {
	public static void  main(String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, d, maior, meio, menor;
		
		System.out.println("Insira valor A: ");
		a = leia.nextInt();
		System.out.println("Insira valor B: ");
		b = leia.nextInt();
		System.out.println("Insira valor C: ");
		c = leia.nextInt();
		
		if(a<b && a<c)
		{
			menor = a;
			
		}
		else if(b<a && b<c)
		{
			menor=b;
		}
		else //if(c<a && c<b)
		{
			menor=c;
		}
    //***************************		
		
		if(a>b && a>c)
		{
			maior = a;
			
		}
		else if(b>a && b>c)
		{
			maior=b;
		}
		else //if(c<a && c<b)
		{
			maior=c;
		}
		//***************************
		
		if(a>b && a<c || a<b && a>c)
		{
			meio = a;
			
		}
		else if(b>a && b<c || b<a && b>c)
		{
			meio=b;
		}
		else //if(c<a && c<b)
		{
			meio=c;
		}
		
		//****************************
		
		
		System.out.printf("O menor valor é %d, o do meio é %d e o maior é %d ", menor, meio, maior);
		
	}
	

}
