package co.yedam.array;

public class ArrayExe1 {
public static void main(String[] args) {
	// 배열 선언.
	int[] intAry = null;
	intAry = new int[10];
	intAry = new int[] {12, 25, 67, 23};
	
	int[] intAry2 = {55, 47, 90};
	
	System.out.println(intAry[0]);
	intAry[0] = 22;
	// intAry = 50; 데이터 타입이 달라서 안됨.
	intAry = intAry2;
	
	int sum = 0;
	sum += intAry[0];
	sum += intAry[1];
	sum += intAry[2];
	sum += intAry[3];
	
	for (int i=0; i<4; i++) {
		sum += intAry[i];
	}
	
}
}
