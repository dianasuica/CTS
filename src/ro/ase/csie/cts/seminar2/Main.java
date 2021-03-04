package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
        CalendarUtil cu = new CalendarUtil();
		
		try {
			System.out.println(cu.weekdDay(4));
			System.out.println(cu.weekDay2(3));
			System.out.println(cu.weekDay3(3));
			System.out.println(cu.weekDay4(7));
		} catch (IncorectDayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
