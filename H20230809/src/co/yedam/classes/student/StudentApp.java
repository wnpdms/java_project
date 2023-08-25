package co.yedam.classes.student;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		Student s1 = new Student();
		s1.setStdNo(100);
		s1.setStdNm("홍길동");
		s1.setScore(70);
		students[0] = s1;

		students[1] = new Student(101, "김길동", 80);
		students[2] = new Student(102, "고길동", 85);
		students[3] = new Student(103, "최길동", 90);

		String searchName = "김길동";

		for (int i = 0; i < 10; i++) {
			if (students[i] != null && students[i].getStdNm().equals(searchName)) {
				System.out.println(students[i].getStdNo() + students[i].getScore());
			}
		}
	}
}
