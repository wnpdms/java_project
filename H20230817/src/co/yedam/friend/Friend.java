package co.yedam.friend;

public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;

	}

	// getter/setter

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public String showInfo() {
		return "이름은 "+name+" 연락처는 "+phone+" 입니다.";
	}
	
}
