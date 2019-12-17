package Example;

public class test {
	public static void main(String[] args) {
        
	     // Manager 객체 생성
	     Manager lee = new Manager();
	     
	     // 변수 설정   
	     lee.name = "하이언";
	     lee.age = 30;
	     lee.jobOfManage="프로젝트 매니저";
	        
	// Overriding된 Manager객체의 print()호출
	      lee.print();
	    }
}
