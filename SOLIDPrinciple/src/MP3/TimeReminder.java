	package MP3;
	
	public class TimeReminder {
		TimeProvider tProv; // TimeProvider 인터페이스형 변수 tProv. 
		
		public void setTimeProvider(TimeProvider tprov) {
			this.tProv = tprov; // 테스트 스텁이나 실제 시간을 제공하는 인스턴스를 주입.( fake or real 상태 주입)
		}
		
		public void reminder() {
			
			int hour = tProv.getTime();
			if(hour >= 22) {
				
			}
		}
	}
