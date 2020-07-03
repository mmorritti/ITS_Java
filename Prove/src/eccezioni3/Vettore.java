package eccezioni3;

public class Vettore 
{
	static int[] a= {0,1,2,3,4,5,6,7,8,9};
	public static int getElemento(int index)throws ArrayIndexOutOfBoundsException
	{
		return a[index];
	}
}

