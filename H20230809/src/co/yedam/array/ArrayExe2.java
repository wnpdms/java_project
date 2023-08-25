package co.yedam.array;

public class ArrayExe2 {
public static void main(String[] args) {
	
	int num1, num2, num3;
	num1 = 56;
	num2 = 72;
	num3 = 67;
	int max = 0;
	// 큰 값 :
	if(num1>num2) {
		if(num1>num3) {
			max = num1;
		}else {
			max = num3;
		}
	}else {
		if(num2>num3) {
			max = num2;
		} else {
			max = num3;
		}
		
	}
	System.out.println(max);
	
	max = 0;
	int[] intAry = {num1, num2, num3};
	for (int i=0; i<intAry.length; i++) {
		if(max < intAry[i]) {
			max = intAry[i];
		}
	}
	System.out.println(max);
	
	
	
	
	int[] ary = new int[5];
	// 1 ~ 100 사이의 임의의 값
	// 5개 합, 평균
	// avg = 223/5
	double avg = 0;
	int sum = 0;
	for (int i=0; i<5; i++) {
		ary[i] = (int)(Math.random()*100)+1;
		sum += ary[i];
		
	}
}
}
