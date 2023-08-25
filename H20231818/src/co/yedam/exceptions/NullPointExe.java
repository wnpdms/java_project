package co.yedam.exceptions;

// 예외 : 프로그램이 정상적으로 종료시점까지 진행.

public class NullPointExe {
	public static void main(String[] args) {
		String msg = null;
		msg = "hello";

		try {
			int val = Integer.parseInt(msg);
			System.out.println("결과는 "+val);
			System.out.println(msg.toString());
		} catch (NullPointerException e) {
			System.out.println("msg 값이 null을 참조합니다.");
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException e1) {
			System.out.println("msg 값을 숫자로 변환할 수 없습니다.");
		} finally {
		System.out.println("예외의 발생과는 상관없이 실행할 코드 작성.");
	}
		System.out.println("end of prog.");
	}
}
