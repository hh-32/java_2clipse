package Eclipse_Assignment_Team.sec0924;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString;
		boolean run = true;
		int total = 0;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택>> ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금할 금액을 입력하세요> ");
				
				inputString = scanner.nextLine();
				System.out.println("예금액: "+ inputString);
				int mon = Integer.parseInt(inputString);
				
				total += mon;				
				//예금액 +total
			} else if(strNum.equals("2")) {
				System.out.println("출금할 금액을 입력하세요> ");
				
				inputString = scanner.nextLine();
				System.out.println("출금액: "+ inputString);
				
				int mon = Integer.parseInt(inputString);
				
				total -= mon;				
				//츨금액 -total
			} else if(strNum.equals("3")) {
				System.out.println("잔고> "+ total);
				
				//total 출력
			} else if(strNum.equals("4")) {
				run = false;				
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
