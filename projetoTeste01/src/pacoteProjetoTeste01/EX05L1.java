package pacoteProjetoTeste01;

import java.util.Scanner;

public class EX05L1 {
	public static void main(String args[])
	{
		Scanner ler= new Scanner (System.in);
		
		float a, b, c, n1, n2, n3, notafinal;
						
		System.out.println("Insira nota A");
		a= ler.nextFloat();
		System.out.println("Insira nota B");
		b= ler.nextFloat();
		System.out.println("Insira nota C");
		c= ler.nextFloat();
		
		n1=a*2;
		n2=b*3;
		n3=c*5;
		
		notafinal=(n1+n2+n3)/3;
		
		System.out.printf("Nota Final: %.2f, pq N1 foi %.2f N2 %.2f e N3 %.2f",notafinal,n1,n2,n3);
	
	}
	

}
