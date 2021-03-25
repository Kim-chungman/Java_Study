package Java0325.Lecture14.Homework;

import java.util.Calendar;

public class CalendarUtil {

	
	public void showDayByYear(int year){
		
		for(int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}
	
	public void showDayByMonth(int year, int month) {
// 		해당하는 달의 1일이 몇요일인지? 해당하는 달의 마지막날은 며칠인지?
		Calendar c = Calendar.getInstance();
		
		c.set(year, month-1, 1);	// 해당월의 1일이 몇 요일인지 알려면 date를 1로 설정
		
		// month/1의 요일?
		int startday = c.get(Calendar.DAY_OF_WEEK);
		// month/마지막날 며칠까지 있어?
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("\t\t   << " + year + "년" + month + "월 >>");
		showDay(startday, lastday);
	}
	
	private void showDay(int startday, int lastday) {
		System.out.println("----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------------------");
		int cnt = 0;
		for(int i = 0; i < startday-1; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0) {
				System.out.println();
			}
		}
		if(cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
	}
}
