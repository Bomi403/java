package dateex;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		//System.out.println(today.getTime()); // Date 
		//System.out.println(today.getTime().toLocaleString());
		//today.set(Calendar.HOUR_OF_DAY, 22);
		System.out.println(toDate(today));
		System.out.println(toTime(today));
		System.out.println(toYoil(today));
		
		int zoneOffset = today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000);
		System.out.println(zoneOffset);
		
		// add
		//today.add(Calendar.HOUR_OF_DAY, 9);
		today.set(2020, 8, 28);
		System.out.println(toDate(today));
		System.out.println(toTime(today));
	}
	
	public static String toDate(Calendar date) {
		
		return date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH)   + 1) + "-" + date.get(Calendar.DATE);
	}
	
	public static String toTime(Calendar date) {
		// 0 ~ 12 Calendar.HOUR - 0~11, Calendar.HOUR_OF_DAY -> 0 ~ 23
		String amPm = (date.get(Calendar.AM_PM) == 0)?"오전":"오후";
		
		return date.get(Calendar.HOUR) + ":" + date.get(Calendar.MINUTE) + ":" + date.get(Calendar.SECOND) + "(" + amPm +")";
	}
	
	public static String toYoil(Calendar date) {
		// 1 ~ 7, 일(1), 월(2), 화(3), 수(4),..... 토(7)
		String[] yoils = {"", "일", "월", "화", "수", "목", "금", "토"};
		int yoil = date.get(Calendar.DAY_OF_WEEK);
		return yoils[yoil];
	}
}
