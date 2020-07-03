package eccezioni3;

import java.util.Scanner;

public class UsaVettore
{
	public static void main(String[] args)
	{
		Scanner console= new Scanner(System.in);
		int index, elemento;
		System.out.println("Inserire l'indice dell'elemento da stampare");
		index= console.nextInt();
		try
		{
			elemento= Vettore.getElemento(index);
			System.out.println("elemento di indice " +index+ " = " +elemento);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ERRORE: INDICE NON VALIDO");
		}
		
		System.out.println("FINE ELABORAZIONE");
		console.close();
	}
}