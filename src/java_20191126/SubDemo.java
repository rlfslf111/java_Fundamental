package java_20191126;
//import java.lang.*; 생략되어있음 
public class SubDemo { //extends Object
	/*public SubDemo{
	 * 	super();
	 * }
	*/
	public static void main(String[] args) {
		Sub s1=new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");
		
		s1.money=10000;
		s1.chicken="교촌 2마리";
		System.out.println(s1.chicken);
	}
}
