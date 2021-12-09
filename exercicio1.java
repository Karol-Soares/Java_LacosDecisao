package lacosdecisao15;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO maior número é: "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior número é: "+n2);
		}
		else 
		{
			System.out.printf("O terceiro número digitado, "+n3+", é o maior!");
		}
		

	}

}
