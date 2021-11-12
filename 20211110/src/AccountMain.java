import java.util.Scanner;

public class AccountMain {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // import 하고싶으면 (컨트롤 + 쉬프트 + 영문 + o) 하면 자동 import됨 
//		Account acc1 = new Account("1111","이숭무",100);
//		Account acc2 = new Account("2222","이상범",100);
//		Account acc3 = new Account("3333","이장범",100);
		Account [] accs = new Account[100]; //100개의 계좌를 만듬
		// 배열의 index는 0번부터 시작 
		int arrayNum=0; // 배열의 현재 번호를 가지기 위한 변수 
		boolean run = true;
		
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
				int money = Integer.parseInt(sc.nextLine());
				accs[arrayNum] = new Account(accountNo,owner,money);
				arrayNum++;
				System.out.println("계좌등록이 완료되었습니다.\n");
				break;
			case "2":
				System.out.println("계좌목록 페이지입니다.");
				System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");
				for(int i=0; i< accs.length;i++) {
					if(accs[i]==null) break;
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());
				}
				break;
			case "3":
				System.out.println("예금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.print("예금 금액 : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc=null;
				//acc=new Account();
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// 계좌번호가 일치하는 Account를 가지고 와서 acc에 저장 
							acc = accs[i];	
							// acc=accs[0], acc=accs[1] ,..., 
							}
					}
				}
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
				acc=new Account();
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// 계좌번호가 일치하는 Account를 가지고 와서 acc에 저장 
							acc=accs[i];	
							// acc=accs[0], acc=accs[1] ,..., 
							break;
							}
					}
				}
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

}
