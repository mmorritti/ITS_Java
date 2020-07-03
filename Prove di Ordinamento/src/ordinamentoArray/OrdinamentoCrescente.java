package ordinamentoArray;

import java.util.Arrays;

public class OrdinamentoCrescente {
	public static void ordinamentoFatture(int [] array) {
	    for(int i = 0; i < array.length-1; i++) {
	        int minimo = i; 
	        for(int j = i+1; j < array.length; j++) {
	            if(array[minimo]>array[j]) 
	                minimo = j;
	        }
	        if(minimo!=i) { 
	            int temp = array[minimo];
	            array[minimo]= array[i];
	            array[i] = temp;
	        }
	    }
	}
}
	


