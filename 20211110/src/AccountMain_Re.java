import java.util.Scanner;

public class AccountMain_Re {

	public static void main(String[] args) {
		Account_Re accs[] = new Account_Re[100];
		Scanner sc = new Scanner(System.in);
		int arrNum = 0;
		boolean run = true;
		
		do {
			System.out.println("1.계좌등록 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.print("선택 > ");
			String number =sc.nextLine();
			switch(number) {
			case "1" : 
				System.out.println("계좌 등록 페이지입니다. 계좌번호를 입력하세요.");
				System.out.print("계좌번호 : ");
				String accountNum = sc.nextLine();
				System.out.print("예금주 :");
				String owner = sc.nextLine();
				System.out.print("금액 : ");
				int balance = Integer.parseInt(sc.nextLine());
				accs[arrNum] = new Account_Re(accountNum,owner,balance);
				arrNum++;
				System.out.println("계좌 등록이 완료되었습니다.");
				break;
			case "2" : 
				System.out.println("계좌 목록 페이지입니다.");
				System.out.println("계좌번호\t\t계좌주\t\t금액");
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; // 비어있으면 종료해야한다.
					System.out.println(accs[i].accountNum+"\t\t"+accs[i].owner+"\t\t"+accs[i].balance);
				}
				break;
			case "3" : 
				System.out.println("예금 페이지입니다. ");
				System.out.print("계좌번호 : ");
				accountNum = sc.nextLine();
				System.out.print("금액 : ");
//				balance = sc.nextInt();
				balance = Integer.parseInt(sc.nextLine());
				Account_Re acc = null;
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; 
					if(accountNum.equals(accs[i].getAccountNum())) {
						//accs[i].balance+=balance;
						//accs[i].getBalance()+=balance;
						acc=accs[i];
					}
				}
				int result = acc.getBalance()+balance;
				acc.setBalance(result);
				System.out.println("예금이 완료되었습니다.");
				break;
			case "4" : 
				System.out.println("출금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNum = sc.nextLine();
				System.out.print("금액 : ");
//				balance = sc.nextInt();
				balance = Integer.parseInt(sc.nextLine());
				acc = null;
				for(int i=0; i<accs.length; i++) {
					if(accs[i]==null) break; 
					if(accountNum.equals(accs[i].getAccountNum())) {
						//accs[i].balance+=balance;
						//accs[i].getBalance()+=balance;
						acc=accs[i];
					}
				}
				result = acc.getBalance()-balance;
				acc.setBalance(result);                                // acc=accs[i]를 했으니까 내용이 바뀐다.????????????????????????
				System.out.println("출금이 완료되었습니다.");
				break;
			case "5" : 
				System.out.println("프로그램을 종료합니다.");
				run = false; break;
				
			}			
		}while(run);
	
		
	}

}

