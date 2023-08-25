package co.yedam.interfaces;

public class Example01 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5]; // intAry[0]
		
		System.out.println(intAry[0][2]);
//		for(int n=1; n<=25; n++) {
//		}
		int no=1;
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				intAry[r][c] = no++;
			}
		}
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				System.out.printf("%3d",intAry[r][c]);
			}
			System.out.println();
		}
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		
		
	}
}
