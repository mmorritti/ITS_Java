package ecccezioni2;

import java.util.Scanner;

class UsaVettore
{
	public static void main(String [] args)
	{
		Scanner console= new Scanner(System.in);
		int index, elemento;
		System.out.println("Inserire l'indice dell'elemento da stampare");
		index= console.nextInt();
		elemento= Vettore.getElemento(index);
		if(elemento!=-1)
		{
			System.out.println("elemento di indice " +index+ " = " +elemento);
			System.out.println("FINE ELABORAZIONE");
		}
		else
		{
			System.out.println("ERRORE: INDICE NON VALIDO");
		}
		console.close();
	}
}
