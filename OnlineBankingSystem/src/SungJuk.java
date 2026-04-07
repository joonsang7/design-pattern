public class SungJuk {
	
	//학생 정보 속성 
	private String userId;
	
	//과목 속성 
	private int java;
	private int db;
	private int security;
	
	// 점수 합계 및 평균 속성 
	private int total;
	private float avg;
	
	
	//성적 등록 메소드 
	public boolean add(String userId, int java, int db, int security) {
		// 해당하는 id의 학생이 존재한다면, 성적을 등록한다.
		Student student = new Student(userId);
		if(student.checkUser(userId) == true ) {
			this.java = java;
			this.db = db;
			this.security = security;
			System.out.println("성적 등록 성공.");
			return true; 
		}else {
			System.out.println("성적 등록 실패. 학생 정보가 없습니다");
			return false;
		}
	}

	
	// 성적 반환 메소드 
	public String getDegree(String userId) {
		total = java + db + security;
		avg = total/3;
		
		if(avg >= 90) {return "A";
		}else if (avg >= 80) {
			return "B";
		}else if (avg >= 70){
			return "C";
		}else {
			return "D";
		}
	}

}



