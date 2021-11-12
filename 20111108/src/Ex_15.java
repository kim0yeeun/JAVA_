
public class Ex_15 {

	public static void main(String[] args) {
		Week_1 today = Week_1.토요일; 
		System.out.println(today);		// 열거형상수
		String name = today.name();		// 열거형 상수를 문자열로 변환 
		System.out.println(name);		// 문자열
		
		// 열거형 상수가 갖고 있는 정수값을 가지고 오기 
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week_1 day1 = Week_1.목요일;
		Week_1 day2 = Week_1.화요일;
		
		int result = day1.compareTo(day2); // 화요일 -> 목요일 +2
		System.out.println(result); // 2일 지났습니다. 
		result = day2.compareTo(day1); // 목요일 -> 화요일 -2 
		System.out.println(result); // 2일 전입니다. 

		// 문자열을 열거형으로 변환
		String day = "수요일";
		Week_1 weekDay = Week_1.valueOf(day);
		System.out.println(weekDay); //열거형출력
		
		System.out.println("=====");
		
		// 열거형에 있는 모든 상수를 가져오기
		Week_1 day3 = Week_1.금요일;
		// 열거형변수에는 열거형 상수 하나만 저장된다.
		// 다 담고싶다면? 배열에 넣자
		Week_1 [] days = Week_1.values(); // 모든 값을 갖고오겠다.
		// 열거형 상수를 배열로 반환해준다. 
		for(Week_1 w : days) {
			System.out.println(w);
		}
	
	}

}
