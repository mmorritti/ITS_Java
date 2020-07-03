package ecccezioni2;

public class Vettore
{
	static int[] a = {0,1,2,3,4,5,6,7,8,9};
	public static int getElemento(int index)
	{
		final int ERRORE= -1;
		if(index>=0 && index<=9)
		{
			return a[index];
		}
		else
		{
			return ERRORE;
		}
	}
}
