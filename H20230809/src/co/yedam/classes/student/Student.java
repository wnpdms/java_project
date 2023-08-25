package co.yedam.classes.student;

public class Student {
	// 필드.
	private int stdNo; // 0
	String stdNm; // null
	int score;

	// 생성자. : 필드의 값 초기화.
	Student() {
		// 기본 생성자.
	}

	Student(int stdNo, String stdNm, int score) {
		// 기본 생성자.
		this.stdNo = stdNo;
		this.stdNm = stdNm;
		this.score = score;
	}

	// 메소드.
	void stdInfo() {
		System.out.println("학번 : " + stdNo + ", 학생이름 : " + stdNm + ", 점수 : " + score);

	}

	void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	void setStdNm(String stdNm) {
		this.stdNm = stdNm;
	}

	void setScore(int score) {
		if (score < 0) {
			this.score = 0;
		} else {
			this.score = score;
		}
		// getter
	}

	public int getStdNo() {
		return stdNo;
	}

	public String getStdNm() {
		return stdNm;
	}

	public int getScore() {
		return score;
	}
}
