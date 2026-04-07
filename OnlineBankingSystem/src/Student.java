public class Student {
	public String userId;
	
	public Student(String userId) {
		this.userId = userId;
	}
	
	// 학생 객체. User가 존재하면 return true, 없으면 false
	public boolean checkUser(String userId) {
		if (this.userId == userId) {
			return true;
		} else {
			return false;
		}
	}
}


