package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Week 열거 타입 변수 선언
			Week today = null;
			
			//Calendar 열기
			Calendar cal = Calendar.getInstance();
			
			//오늘의 요일 얻기(1~7)
			int week = cal.get(Calendar.DAY_OF_WEEK);
			
			//숫자를 열거 상수로 변환해서 변수에 대입
			switch(week)
			{
				case 1: today = Week.SUNDAY;	break; 
			}//? 오타 확인해라...ㅎㅇㅌ
			

	}

}
