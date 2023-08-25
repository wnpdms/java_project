package co.yedam.friend;

public class CompFriend extends Friend {
	private String comp;
	private String dept;

public CompFriend(String name, String phone, String comp, String dept) {
	super(name, phone);
	this.comp = comp;
	this.dept = dept;
}
	
	public String getComp() {
	return comp;
}

public void setComp(String comp) {
	this.comp = comp;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

	@Override
	public String showInfo() {
		return super.showInfo() + " 회사 " + comp + " 부서는 " + dept;
}
}
