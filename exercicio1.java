package lacosdecisao15;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("\nDigite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO maior n�mero �: "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior n�mero �: "+n2);
		}
		else 
		{
			System.out.printf("O terceiro n�mero digitado, "+n3+", � o maior!");
		}
		

	}

}
