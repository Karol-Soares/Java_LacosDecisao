package lacosdecisao15;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double num;
				
		System.out.print("Digite um número: ");
		num = leia.nextFloat();

		if((num%2==0)) 
		{
			System.out.printf("\nO número %.1f é par e sua raíz quadrada é %.2f",num,Math.sqrt(num));
		} 
		else 
		{
			System.out.println("\nO número "+num+" é ímpar e elevado ao quadrado é "+Math.pow(num, 2));
		}
		

	}

}
