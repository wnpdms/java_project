package co.yedam.array;

public class Friend {
	String name;
	String phone;
	Gender gender;
	
	// 메소드.
	void showInfo(){
		System.out.printf("이름:%s, 연락처:%s, 성별:%s\n",
				name, phone,
				gender == Gender.MEN ? "남" : "여");
	}
	void briefInfo() {
		System.out.printf("이름:%s, 연락처:%s\n",
				name, phone);
	}

}
