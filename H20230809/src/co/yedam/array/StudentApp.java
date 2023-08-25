package co.yedam.array;

import java.util.Scanner;

public class StudentApp {
public static void main(String[] args) {
	Student[] students = new Student[10];
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	int idx = 0;
	
	// 1.등록 2.조회 3.목록
	while(run) {
	System.out.println("--------------------------");
	System.out.println("1.등록  2.조회  3.목록  4.키가 제일 큰 학생 5.종료");
	System.out.println("--------------------------");
	System.out.println("선택하세요>>>");
	
	int menu = Integer.parseInt(scn.nextLine());
	
	switch(menu) {
	case 1: // 이름, 점수 입력.
		Student s1 = new Student();
		 System.out.println("이름을 입력하세요.");
		 s1.name = scn.nextLine();
		 System.out.println("점수를 입력하세요.");
		 s1.score=Integer.parseInt(scn.nextLine());
		 //Double.parseDouble("178.9")
		 System.out.println("키를 입력하세요.");
		 s1.height=Double.parseDouble(scn.nextLine());
		 students[idx]=s1;
		 idx++;
		 break;
	case 2: // 이름을 입력하면 점수를 출력.
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		for(int i=0; i<10; i++) {
			if(students[i] != null) {
				if(students[i].name.equals(name)) {
				System.out.printf("%s의 점수: %d\n",students[i].name, students[i].score);
			}else {
				System.out.println("찾는 이름이 없습니다.");
			}
			}
		}
	case 3: //
		for (int i=0; i<students.length; i++) {
			if(students[i] != null) {
			System.out.printf("이름: %s, 점수: %d",students[i].name,students[i].score);
			}
		}
		break;
	case 4:
		double max = 0;
		String name2 = "";
		for (int i=0; i<students.length; i++) {
			if(students[i] != null && max<students[i].height) {
				max = students[i].height;
				name2 = students[i].name;
			}
		}
		System.out.printf("가장 키가 큰 학생은 "+name2+" 입니다.");
	case 5: // 종료.
		System.out.println("종료합니다.");
		run = false;
	}
	
	}
	System.out.println("end.");
	
}
}
