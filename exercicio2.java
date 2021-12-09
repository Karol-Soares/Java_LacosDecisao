//Faça um programa que entre com três números e coloque em ordem crescente.

package lacosdecisao15;

import java.util.*;

public class exercicio2 {

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
		
		if(n1 < n2 && n2 < n3) 
		{
			System.out.printf("\nOrdem numérica crescente: "+n1+", "+n2+", "+n3);
		} 
		else if((n1 < n2 && n3 < n2) && n1 < n3)
		{
			System.out.printf("\nOrdem numérica crescente: "+n1+", "+n3+", "+n2);
		}
		else if(n2 < n1 && n1 < n3) 
		{
			System.out.printf("\nOrdem numérica crescente: "+n2+", "+n1+", "+n3);
		} 
		else if(n2 < n1 && n2 < n3) 
		{
			System.out.printf("\nOrdem numérica crescente: "+n2+", "+n3+", "+n1);
		} 
		else if(n3 < n1 && n1 < n2) 
		{
			System.out.printf("\nOrdem numérica crescente: "+n3+", "+n1+", "+n2);
		} 
		else 
		{
			System.out.printf("\nOrdem numérica crescente: "+n3+", "+n2+", "+n1);
		}
		

	}

}
