package sdet_questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		//ISO_Date  format --> 2025-11-20
		
		String str1 = "2025-11-20";
		
		LocalDate date1 = LocalDate.parse(str1, DateTimeFormatter.ISO_DATE);
		
		System.out.println(date1);
		String str2 = "20/11/2025";
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(str2);
		System.out.println(date2);

	}

}
