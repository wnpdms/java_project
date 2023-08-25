package co.yedam.loop;

public class WhileExe {
public static void main(String[] args) {
	
	boolean run = true;
	while(run) {
		int tmp = (int)(Math.random()*100);
		if(tmp>90) {
			//break;
			run = false;
		}
		System.out.println(tmp);
	}
	System.out.println("end");
	
	
	// 161p. 3번 문제.
	boolean ju = true;
	while(ju) {
	int sum = (int)(Math.random()*6)+1;
	int sum2 = (int)(Math.random()*6)+1;
	System.out.printf("("+sum,sum2+")");
	
}
}
}
