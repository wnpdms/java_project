package co.yedam.friend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FriendApp {
	// 추가, 수정, 삭제, 목록:
	Map<String, String> userList = new HashMap<>();
	List<Friend> friends = new ArrayList<Friend>();
	Scanner scn = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");

	// 생성자
	public FriendApp() {
		userList.put("user1", "1234");
		userList.put("user2", "5678");
		userList.put("user3", "9087");
	}

	private boolean userCheck() {

		System.out.println("id>> ");
		String id = scn.nextLine();
		System.out.println("pw>> ");
		String pw = scn.nextLine();

		if (userList.containsKey(id)) { // id체크
			if (userList.get(id).equals(pw)) { // pw체크
				return true;
			}
		}
		return false;
	}

	public void start() {
		boolean run = true;

		while (true) {
			if (userCheck()) {
				break;
			}
			System.out.println("로그인 실패...");
		}
		
		int menu = -1;
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록");
			System.out.println("선택하세요>>>");

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
			} finally {
				scn.nextLine();
			}

			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				edit();
				break;
			case 3:
				del();
				break;
			case 4:
				list();
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

	private String PrintString(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();
	}

	private void add() {
		// 이름, 연락처, 생년월일, 입력.
		// Friend 인스턴스를 생성.
		// friends 컬렉션에 추가.
		Friend friend = null;
		String name = PrintString("이름입력");
		String phone = PrintString("연락처입력");
		Date birthday = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String birth = PrintString("생일입력");
			try {
				birthday = sdf.parse(birth);
				break;
			} catch (ParseException e) {
				continue;
			}
		}
		friend = new Friend(name, phone, birthday);
		friends.add(friend);
	}

	private void edit() {
		String name = PrintString("이름");
		String phone = PrintString("연락처");
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.get(i).setPhone(phone);
				break;
			}
		}

	}

	private void del() {
		String name = PrintString("이름");
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i); // friends[i] = null;
				break;
			}
		}
	}

	private void list() {
		for (Friend fnd : friends) {
			System.out.println(fnd);
		}
	}

	private String printString(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();
	}

}
