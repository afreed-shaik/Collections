package com.ojas.collect;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {

	public static int compareDates(Date date1, Date date2) {
		int result = -1;
		if(date1.after(date2)) {
			result = 2;
		}
		else if(date1.before(date2)) {
			result = 1;
		}
		else if(date1.equals(date2)) {
			result = 0;
		}
		return result;
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two dates to compare:");
		Date date1 = sdf.parse(scan.next());
		Date date2 = sdf.parse(scan.next());
		int res = compareDates(date1, date2);
		if(res == -1) {
			System.out.println("Both dates are null");
		}
		else if(res == 0) {
			System.out.println("Both dates are equal");
		}
		else if(res == 1) {
			System.out.println("Date1 is before Date2");
		}
		else if(res == 2) {
			System.out.println("Date1 is after Date2");
		}
	}

}
