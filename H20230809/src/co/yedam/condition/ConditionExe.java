package co.yedam.condition;

public class ConditionExe {
public static void main(String[] args) {
	// 임의의 수 1,2,3 이 나오는 case문
	int num = (int)(Math.random()*3)+1;
	
	if(num==1) {
		System.out.println("가위");
	}else if(num==2) {
		System.out.println("바위");
	}else if(num==3) {
		System.out.println("보");
	}
	
	switch(num) {
	case 1:
		System.out.println("가위");
		break;
	case 2:
		System.out.println("바위");
		break;
	case 3:
		System.out.println("보");
		break;
	}
	
	System.out.println("어떤 혜택을 원하세요?");
	char grade = (char)((Math.random()*5)+65);
	switch(grade) {
	case 65 : System.out.println("VVIP 혜택을 받으실 수 있습니다."); break;
	case 66 : System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
	case 67 : System.out.println("우수 회원 혜택을 받으실 수 있습니다."); break;
	case 68 : System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
	default : System.out.println("혜택이 없습니다.");
	}
	System.out.println("감사합니다");
	
}
}
