package pacoteProjetoTeste01;

import java.lang.SuppressWarnings;
import java.util.*;

public class Ex01Ljava {
	public static void main(String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		int a, b, c,maior=0;
		
		System.out.println("Escreva o numero A: ");
		a= leia.nextInt();
		System.out.println("Escreva o numero B: ");
		b= leia.nextInt();
		System.out.println("Escreva o numero C: ");
		c= leia.nextInt();
		
		
		if(a>b && a>c)
		{
			maior=a;
					
		}
		else if(b>a && b>c)
		{
			maior=b;
			
		}
		else if(c>a && c>b)
		{
			maior=c;
		}
		
		
		
		
		System.out.printf("O maior número foi: %d",maior);
		
		
	}

}
