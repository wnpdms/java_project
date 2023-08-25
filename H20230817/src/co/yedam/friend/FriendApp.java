package co.yedam.friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendApp {
	// 배열 > 컬렉션 > 파일 > DB
	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	// 컨트롤
	public void start() {
		boolean run = true;
		int menu = -1;
		while (run) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("선택하세요>>>");
			try {
				menu = scn.nextInt(); // 3 엔터
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 다시 선택하세요.");
				continue;
			} finally {
				scn.nextLine();
			}

			switch (menu) {
			case 1:
				addFriend();
				break;
			case 2:
				search();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}

		}
	}

	//
	private String printString(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();
	}

	// 등록
	private void addFriend() {
		int subMenu = -1;
		while(true) {
		System.out.println("1.학교 2.회사 3.기타");
		System.out.println("선택하세요>>>");
		try {
		subMenu = scn.nextInt();
		}catch(InputMismatchException e) {
		System.out.println("1 2 3 중에 선택하세요.");
		
		}finally {
			scn.nextLine();
		}
		
		
		
		
		Friend friend = null;
		String name = printString("이름 입력");
		String phone = printString("연락처 입력");
		
		if(subMenu==1) {
			String univ = printString("학교 입력");
			String major = printString("전공 입력");
			
			friend = new UnivFriend(name, phone, univ, major);			
		}else if(subMenu==2) {
			String comp = printString("회사 입력");
			String dept = printString("부서 입력");
			friend = new CompFriend(name, phone, comp, dept);
		}else {
			friend = new Friend(name, phone);
		}
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i]==null) {
				friends[i] = friend;
				break;
			}
		}
		}
	}
	// 조회 : 이름 입력 - 해당 이름 정보만 조회
	// 이름을 넣지않고 엔터 -> 전체 목록 조회

	private void search() {
		String name = printString("이름 입력>>> ");
		if (name != "") {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && friends[i].getName().equals(name)) {
					System.out.println(friends[i].showInfo());
				}
			}
		} else {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null) {
					System.out.println(friends[i].showInfo());

				}
			}
		}
	}

	// 수정 : 연락처수정.
	private void modify() {
		String name = printString("이름 입력>>> ");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (name.equals(friends[i].getName())) {
					String phone = printString("연락처 수정");
					friends[i].setPhone(phone);
					break;

				}
			}
		}
	}

	// 삭제 :
	private void remove() {

	}
}
