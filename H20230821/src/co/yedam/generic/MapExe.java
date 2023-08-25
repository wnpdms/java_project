package co.yedam.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class User{
	private String id;
	private String pw;
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

// 논리동등객체
@Override
public int hashCode() {
	return this.id.hashCode();
}

@Override
public boolean equals(Object obj) {
	User target = (User) obj;
	
	return this.id.equals(target.id)
			&& this.pw.equals(target.pw);
}
}

public class MapExe {
	public static void main(String[] args) {
		// Map : 키 & 값
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("김길동", 85);
		map.put("고길동", 90);
		
		Integer val = map.get("홍길동");
		System.out.println(val);
		
		List<User> users = new ArrayList<>();
		users.add(new User("user1","1234"));
		
		Map<String, String> userMap = new HashMap<>();
		userMap.put("user2","1111");
		userMap.put("user3","2222");
		userMap.put("user4","3333");
		
		if(userMap.containsKey("user2")) {
			System.out.println(userMap.get("user2"));
		}
		
		// key 반환.
		Set<String> keyset = userMap.keySet();
		for(String key : keyset) {
			String value = userMap.get(key);
			System.out.printf("Key: %s, val: %s", key, value);
		}
		
		// map
		Map<User, String> umap = new HashMap<>();
		umap.put(new User("user1", "1111"), "홍길동");
		umap.put(new User("user2", "2222"), "박길동");
		umap.put(new User("user3", "3333"), "고길동");
		
		String name = umap.get(new User("user1", "1111"));
		System.out.println("name: "+name);
	}
}
