package java_20191125;

public class MemberDemo {
	public static void main(String[] args) {
		Member m=new Member();
		m.setName("문재인");
		m.setZipcode("12390");
		m.setAddress1("seoul");
		m.setAddress2("bluehouse");
		m.setEmail("president@bluehouse.go.kr");
		m.setSsn("123123-1231231");
		m.setAge(60);
		m.setHeight(180.4);
		m.setPassword("123456789");
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddress1());
		System.out.println(m.getAddress2());
		System.out.println(m.getEmail());
		System.out.println(m.getSsn());
		System.out.println(m.getAge());
		System.out.println(m.getHeight());
		System.out.println(m.getPassword());
	}
}
