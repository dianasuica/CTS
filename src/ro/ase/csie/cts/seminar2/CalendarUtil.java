package ro.ase.csie.cts.seminar2;

import java.text.DateFormatSymbols;

public class CalendarUtil {
	
	private String[] days = {"Sunday","Monday","Tuesday","Wednesday",
			   "Tursday","Friday","Saturday" };
	
		public String weekdDay(int day) throws IncorectDayException {
			if(day == 1)
				return "Sunday";
			else if (day == 2)
				return "Monday";
			else if (day == 3)
				return "Tuesday";
			else if (day == 4)
				return "Wednesday";
			else if (day == 5)
				return "Thursday";
			else if (day == 6)
				return "Friday";
			else if (day == 7)
				return "Saturday";
			
			throw new IncorectDayException("From 1 to 7 only");
	}
		
		public String weekDay2(int day) throws IncorectDayException {
			switch(day) {
				case 1:
					return "Sunday";
				case 2:
					return "Monday";
				case 3:
					return "Tuesday";
				case 4:
					return "Wednesday";
				case 5:
					return "Thirsday";
				case 6:
					return "Friday";
				case 7:
					return "Saturday";
				default:
					throw new IncorectDayException("From 1 to 7 only");
			}
		}
		
		public String weekDay3(int day) throws IncorectDayException {
			
			if(day > 0 && day <= days.length) {
				return days[day-1];
			}else {
				throw new IncorectDayException("From 1 to 7 only");
			}
			
		}
		
		public String weekDay4(int day) throws IncorectDayException {
			String[] days = new DateFormatSymbols().getWeekdays();
			
			if(day > 0 && day <= days.length) {
				return days[day-1];
			}else {
				throw new IncorectDayException("From 1 to 7 only");
			}
		}

}
