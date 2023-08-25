package co.yedam.stream;

import java.util.Date;

public class Friend {
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", birth=" + birth + "]";
	}
	private String name;
	private String phone;
	private Date birth; // 1998-08-05
	
	
	public Friend(String name, String phone, Date birth) {
		super();
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
	
	
}
