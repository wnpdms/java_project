package co.yedam.classes.friend;

import java.util.Calendar;

public class CalenderExe {
public static void main(String[] args) {
	
	Calendar cal = Calendar.getInstance();
//	cal.set(year, month - 1, 1);
//	
//	cal.set(2023,2,3);
//	System.out.println(Calendar.YEAR);
//	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//	System.out.println(cal.getActualMaximum(Calendar.DATE));
	
	CalendarApp app = new CalendarApp();
	app.showCalendar(2023, 5);
	

	
	String[] days = {"Sun","Mon","Tue","Thr","Wed","Fri","Sat"};
	
	for(int i=0; i<days.length; i++){
		System.out.printf("%4s",days[i]);
	}
	System.out.printf("\n");
	
	int space = cal.get(Calendar.DAY_OF_WEEK)-1;
	for(int i=0; i<space; i++) {
		System.out.printf("%4s"," ");
	
	
}
}
}
