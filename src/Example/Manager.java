package Example;

public class Manager extends Employee{
	String jobOfManage;
	   
    // print() 메소드 오버라이딩
    public void print(){
        System.out.println("사원의 이름은 "+name + "이고, 나이는" + age + "입니다.");
        System.out.println("관리자 "+name+"은 "+jobOfManage+" 담당입니다.");
    }
}
