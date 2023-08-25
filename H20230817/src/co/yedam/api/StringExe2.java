package co.yedam.api;

public class StringExe2 {
public static void main(String[] args) {
	
	String file = "C:/Dev/temp/flower.jpg";
	StringUtils.getFileName(file);
	String ssn = "9504051234567";
	StringUtils.checkGender(ssn);
	char sex = ssn.charAt(7);
	switch (sex) {
	case '1':
	case '3':
		System.out.println("남자 입니다.");
		break;
		
	case '2':
	case '4':
		System.out.println("여자 입니다.");
		break;
	}
	
}
}
