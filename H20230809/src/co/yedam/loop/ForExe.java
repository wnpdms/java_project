package co.yedam.loop;

public class ForExe {
public static void main(String[] args) {
	int sum = 0;
	sum = sum + 1;
	sum = sum + 2;
	sum = sum + 3;
	sum = sum + 4;
	sum = sum + 5;
	
	sum = 0;
	for (int i=1; i<=5; i++) {
		sum = sum + i;
	}
	System.out.println(sum);
	
	
	//
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	
	
	//
	int sum2 = 0;
	
	for(int i=1; i<=100; i++) {
		sum2 += i;
	}
	System.out.println("1~100의 합은 : " + sum2 + " 입니다.");
	
	
	//
	// 160p. 2번 문제.
	
	int sum3 = 0;
	for(int i=1; i<=100; i++) {
		if(i%3==0) {
			sum3 += i;
		}
	}
	System.out.println("3의 배수의 합은 : " + sum3 + " 입니다.");
	
	
	// 5 번 문제
	for(int i=1; i<=4; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("--------");	
	for(int i=1; i<=4; i++) {
		for(int j=1; j<4; j++) {
			if(i+j<5)
			System.out.print(" ");
			else
			System.out.println("*");
		}
		System.out.println();
	}
	System.out.println("end");
	
 }
}
