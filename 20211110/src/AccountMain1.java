import java.util.Scanner;

public class AccountMain1 {


	// AccountMain의 반복되는 내용을 함수화 한 것
	// 그래서 변수를 사용하기 위해서 static 을 사용해서 main 함수 밖으로 꺼내준다. 
	
	static Scanner sc = new Scanner(System.in); // import 하고싶으면 (컨트롤 + 쉬프트 + 영문 + o) 하면 자동 import됨 
//	Account acc1 = new Account("1111","이숭무",100);
//	Account acc2 = new Account("2222","이상범",100);
//	Account acc3 = new Account("3333","이장범",100);
	static Account [] accs = new Account[100]; //100개의 계좌를 만듬
	// 배열의 index는 0번부터 시작 
	static int arrayNum=0; // 배열의 현재 번호를 가지기 위한 변수 
	static boolean run = true;
	
	public static void main(String[] args) {
		do{
			System.out.println("1.계좌등록 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.print("선택 > ");  // ln을 지우면 선택 옆에 커서가 오게 된다. 
			String selecNo = sc.nextLine(); // nextline : 문자열
			//int selecNo = sc.nextInt : 정수 
			//sc.nextline(); 을 하나 더 적어줘야한다.
			//why? 안그러면 숫자 받고 "엔터" 를 못가져와서 밑에 계좌 등록하는 곳에서 하나 사라짐 
			//즉 입력장치에 \n이 남아있는 것을 없애주는 역할 
			switch(selecNo) {
			case "1":
				System.out.println("계좌등록 페이지입니다.");
				System.out.print("계좌 번호 : ");
				String accountNo = sc.nextLine();
				System.out.print("예금주 : ");
				String owner = sc.nextLine();
				System.out.print("금액 : ");
				int money = sc.nextInt();
				accs[arrayNum] = new Account(accountNo,owner,money);
				arrayNum++;
				System.out.println("계좌등록이 완료되었습니다.\n");
				break;
			case "2":
				System.out.println("계좌목록 페이지입니다.");
				System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");
				accountPrint();
				
				break;
			case "3":
				System.out.println("예금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.print("예금 금액 : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc=accountFind(accountNo);
				//acc=new Account();
				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				break;
			case "4":
				System.out.println("출금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.print("출금 금액 : ");
				money = Integer.parseInt(sc.nextLine());
				//acc=null;
				//acc=new Account();
				
				acc=accountFind(accountNo);
				
				result = acc.getBalance() - money;
				acc.setBalance(result);
				break;
			
			case "5":
				System.out.println("프로그램을 종료합니다.");
				run = false; break;
				// System.exit(0); (run 아니고 while에 직접 true를 넣는 경우)
		
			}
		
		}while(run);
	}
	public static Account accountFind(String accountNo) { // return은 Account로 전달 
		for(int i=0; i<accs.length; i++) {
			if(accs[i]==null) break;
			else {
				if(accs[i].getAccountNo().equals(accountNo)) {
					// 계좌번호가 일치하는 Account를 가지고 와서 acc에 저장 
					return accs[i];	
					// acc=accs[0], acc=accs[1] ,..., 
					}
			}
		}
		return null; // return 값이 없으면 오류가 나기 때문에 if문에서 else일 경우 리턴 값을 써줘야한다. 
	}
	
	public static void accountPrint() {
		for(int i=0; i< accs.length;i++) {
			if(accs[i]==null) break;
			System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
		}
		
		
	}

}
