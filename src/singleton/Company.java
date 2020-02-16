package singleton;

public class Company {

	// 유일하게 생성한 인스턴스 
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	//인스턴스를 외부에서 참조할 수 있도록 get 메서드를 구현 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		// 유일하게 생성한 인스턴스 반환 
		return instance;
	}
}
