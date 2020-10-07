package pacoteProjetoTeste01;

import java.util.Scanner;
public class Ex04L1 {
	public static void main(String args[])
	{
		Scanner leia= new Scanner (System.in);
		
		
		float a, r, s, d, c, b;
		
		System.out.printf("Digite A:");
		a= leia.nextFloat();
		
		System.out.printf("Digite B:");
		b= leia.nextFloat();
		
		System.out.printf("Digite C:");
		c= leia.nextFloat();
		
		r = (a+b)*(a+b);
		s= (b+c)*(b+c);
		d=(r+s)/2;

		System.out.printf("O valor de D é: " +d);
		
		
	}

}
