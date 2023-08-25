package co.yedam.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {
	Scanner scn = new Scanner(System.in);
	List<Friend> friends = new ArrayList<>();

	public FriendApp() {
		loadFile();
	}
	
	public void start() {
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.종료");
			System.out.println("번호를 선택>>>");
			int menu = scn.nextInt(); // 1 엔터.
			scn.nextLine();
			if (menu == 1) {
				add();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				System.out.println("종료합니다.");
				saveFile();
				run = false;
			}
		}
	} // end of start

	SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

	private void add() {
		String name = printString("이름 입력");
		String phone = printString("연락처 입력");
		String birth = printString("생년월일 입력(95-06-03)");
		try {
			Friend fnd = new Friend(name, phone, sdf.parse(birth));
			friends.add(fnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void list() {
		for (Friend fnd : friends) {
			System.out.println(fnd);
		}
	}

	private void saveFile() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// friends 컬렉션 -> 텍스트 저장.
		try {
			FileWriter fw = new FileWriter("C:/temp/friendList.txt");
			for(Friend fnd : friends) {
				String line = fnd.getName() + " " 
				+ fnd.getPhone() + " " + sdf.format(fnd.getBirth());
				fw.write(line+"\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadFile() {
		File file=new File("src/co/yedam/stream/friendList.java");
		try {
			FileReader fr = new FileReader(file);
			char[] buf = new char[100];
			while(true) {
				int val=fr.read(buf);
				if(val==-1) {
					break;
				}
				for(int i=0; i<val; i++) {
					buf[i];
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private String printString(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();

	}
}
