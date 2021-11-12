
public class Ex_02 {

	public static void main(String[] args) {
		int[] i = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		Account[] accs = new Account[3];
		accs[0] = new Account("1111","이숭무",100);
		accs[1] = new Account("2222","이승범",100);
		accs[2] = new Account();
		//accs[0] 은 스트링도, 인트도 아닌 Account 라는 클래스이므로 다시 new 해서 선언해줘야한다. 
	}

}
