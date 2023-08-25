package co.yedam.friend;

public class FriendExe {
	public static void main(String[] args) {
	// name, phone
	// 배열선언[5], 인스턴스 3명
	// name = "홍길동";
	Friend[] friends = new Friend[5];
//	friends[0] = new Friend("문재은","000");
//	friends[1] = new Friend("고길동","111");
//	friends[2] = new Friend("홍길동","222");

	for(int i=0; i<friends.length; i++) {
		if(friends[i]==null) {
			friends[i] = new Friend("고길동","000");
			break;
		}
	}
	
	
	String name = "고길동";
	String phone = "000";
	for(int i=0; i<friends.length; i++) {
		if(friends[i]!=null&&friends[i].getName().equals(name)) {
			System.out.println(friends[i].showInfo());
		}
	}
	
	
			
}
}
