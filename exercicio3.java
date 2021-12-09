package lacosdecisao15;

import java.util.*;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("\nCategoria Infantil");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria Juvenil");
		}
		else
		{
			System.out.println("\nCategoria Adulto");
		}

	}

}
