package pacoteProjetoTeste01;

import java.util.Scanner;

public class Ex03Ljava {
	public static void main(String args[])
	{
		Scanner leia = new Scanner (System.in);
		
		int idade;
		System.out.println("Insira idade: ");
		idade = leia.nextInt();
		
		if(idade>9 && idade<15)
		{
			System.out.println("Categoria Infantil!");
		}
		else if(idade>14 && idade<18)
		{
			System.out.println("Categoria Juvenil!");
		}	
		else if(idade>17 && idade<26)
		{	
			System.out.println("Categoria adulto!");
		}	
		else
		{
			System.out.println("Idade inválida!");
		}
		
	}

}
