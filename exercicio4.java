package lacosdecisao15;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double num;
				
		System.out.print("Digite um n�mero: ");
		num = leia.nextFloat();

		if((num%2==0)) 
		{
			System.out.printf("\nO n�mero %.1f � par e sua ra�z quadrada � %.2f",num,Math.sqrt(num));
		} 
		else 
		{
			System.out.println("\nO n�mero "+num+" � �mpar e elevado ao quadrado � "+Math.pow(num, 2));
		}
		

	}

}
