package br.com.fiap.pokemon.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Helpers {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Calendar StringToCalendar(String s){
		Calendar cal = null;
		try{
			cal = Calendar.getInstance();
		    cal.setTime(sdf.parse(s));// all done
		    
		}catch(Exception e){
			e.printStackTrace();
		}
		
	    return cal;
	}
	
	public static String CalendarToString(Calendar d){
		
	    return sdf.format(d.getTime());
	    
	}
	
	
}
