package co.yedam.lombok;

public class MainExe {
public static void main(String[] args) {
	Student s1 = new Student(101, "고길동", 80);
	s1.setStdNo(101);
	s1.setStdName("고길동");
	s1.setScore(90);
	
	System.out.println(s1.toString());

}
}
