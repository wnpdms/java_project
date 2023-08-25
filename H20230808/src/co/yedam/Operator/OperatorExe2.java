package co.yedam.Operator;

import java.util.Scanner;

/*
* 은행 App.
*/

public class OperatorExe2 {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int balance = 0; // 10만원 이상 불가, -금액 불가.
	boolean run = true;
	
	while(run) {
	System.out.println("-----------------------");
	System.out.println("1.예금 2.출금 3.잔고 4.종료");
	System.out.println("-----------------------");
	System.out.println("선택>>>");
	
	int menu = Integer.parseInt(scn.nextLine());
	if (menu == 1) {
		System.out.println("입금액을 입력하세요>>>");
		// 코드 작성.
		int gap = Integer.parseInt(scn.nextLine());
		balance+=gap;
		if(balance>=100000||gap<0) {
			balance-=gap;
			System.out.println("입금 불가");
		}
	} else if (menu == 2) {
		System.out.println("출금액을 입력하세요>>>");
		// 코드 작성.
		int gap = Integer.parseInt(scn.nextLine());
		balance-=gap;
		if(balance<0||gap<0) {
			balance+=gap;
			System.out.println("출금 불가");
		}
	} else if (menu == 3) {
		System.out.println("현재 잔고는 "+balance+"입니다.");
		// 코드 작성.
	} else if (menu == 4) {
		System.out.println("종료");
		// 코드 작성.
		break;
	}
	}
	System.out.println("end of prog.");
}
}
