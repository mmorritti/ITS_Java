package classi;

import java.text.SimpleDateFormat;
import java.util.*;


public class Datario {

	public static void main(String[] args) {
		
		Date oggi = new Date();
		String data = oggi.getDate()+"/"+oggi.getMonth()+1+"/"+oggi.getYear();
		System.out.println(oggi);
		System.out.println(data);
		
		GregorianCalendar ca1 = new GregorianCalendar ();
		System.out.println(ca1);
		
		String d =ca1.get(Calendar.DAY_OF_MONTH)+"/"+
						(ca1.get(Calendar.MONTH)+1)+"/"+
						(ca1.get(Calendar.YEAR));
		
		String ora = ca1.get(Calendar.HOUR_OF_DAY)+":"+
					ca1.get(Calendar.MINUTE)+":"+
					ca1.get(Calendar.SECOND);
		
		GregorianCalendar dataNascita = new GregorianCalendar (1985,3,23, 15,45,45);
		dataNascita.setLenient(false);
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(dataNascita.getTime()));
		
						
						
	}

}
