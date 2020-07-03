package eccezioni4;

import java.util.Scanner;

public class UsaVettore
{
	public static void main(String[] args)
	{
		Scanner console= new Scanner(System.in);
		int index, elemento;
		boolean b= true;
		while(b)
		{
			System.out.println("Inserire l'indice dell'elemento da stampare");
			index= console.nextInt();
			try
			{
				elemento= Vettore.getElemento(index);
				System.out.println("elemento di indice " +index+ " = "
						+elemento);
				b= false; //consente di uscire dal ciclo
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ERRORE: INDICE NON VALIDO");
			}
		}
		System.out.println("FINE ELABORAZIONE");
		console.close();
	}
}
