package com.bit.hostel.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static Date stringToDate(String dateString) {
		System.out.println(dateString);
		try{			
			 return new SimpleDateFormat("yyyy-MM-dd").parse(dateString); 
		}catch(Exception ex){
			return new Date();
		}
	}

}
