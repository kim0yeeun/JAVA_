import java.util.Calendar;

public class Ex_14 {

	public static void main(String[] args) {
		Week today; // 열거형 상수 변수 선언
		today = Week.Monday; // 변수에 열거형 상수값을 대입
		System.out.println(today);
		// 사용 예
		// calendar는 날짜를 사용하기 위한 자료형이다.
		Calendar cal = Calendar.getInstance();
		// 날짜를 사용하기 위해 cal 변수 선언
		// cal이라는 변수를 이용해서 요일을 가져오자.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		// 2 : 월요일 
		switch(week) {
		case 1 : today = Week.Sunday; break;
		case 2 : today = Week.Monday; break;
		case 3 : today = Week.Tuesday; break;
		case 4 : today = Week.Wednesday; break;
		case 5 : today = Week.Thursday; break;
		case 6 : today = Week.Friday; break;
		case 7 : today = Week.Saturday; break;
		}
		System.out.println("Today : "+today);
		if (today==Week.Sunday) {
			System.out.println("놀러가자!");
		}else {
			System.out.println("일합시다..");
		}
	}

}

