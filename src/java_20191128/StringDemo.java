package java_20191128;

public class StringDemo {
	 public static void main(String[] args) {
		String str = "abcdefg";
		for(int i = 0; i<str.length(); i++){
			System.out.print(str.charAt(i)+" ");
		}
		str=str.concat("abcd"); //str+"abcd"
		System.out.println(str);
		
		String fileName="abc.zip";
		if(fileName.endsWith("zip")){
			System.out.println("zip파일입니다.");
		}else if(fileName.endsWith("ppt")){
			System.out.println("PPT파일입니다.");
		}
		
		String uri = "artist/index.jsp";
		if(uri.startsWith("artist")){
			System.out.println("작가 페이지 입니다.");
		}else if(uri.startsWith("exhibition")){
			System.out.println("전시 페이지 입니다.");
		}
		
		//대소문자를 상관하지 않고 비교해주는 equalsIgnoreCase
		System.out.println("abc".equalsIgnoreCase("aBC"));
		
		
		//getBytes로 변환하면 글자가 몇 바이트인지를 나타내준다.
		String s1 = "a";
		String s2 = "수";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		
		//indexOf 입력한 문자가 몇번째에 위치해 있는지를 나타낸다.
		String str2 = "111111-1111118";
		System.out.println(str2.indexOf("-"));
		
		//lastIndexOf 입력한 문자가 마지막으로 나타난게 어디에 위치해 있는지를 나타낸다.
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));
		
		//substring 입력한 숫자는 배열 위치로 어디서 부터 어디까지를 출력하는지를 나타낸다.
		String str1 = "111111-1111118";
		String first=str1.substring(0,6);
		String first1=str1.substring(0,str1.indexOf("-")); //str1.indexOf("-")=6
		System.out.println(first);
		System.out.println(first1);
		String second = str1.substring(7);
		String second2 = str1.substring(str1.indexOf("-")+1);
		System.out.println(second);
		System.out.println(second2);
		
		//replaceAll을 통해서 문자를 대체한다.
		String content = "abc\nabc\nabc\nabc";
		System.out.println(content); //.toString 생략
		content = content.replaceAll("\n", "<br>");
		System.out.println(content);
		
		//trim()을 통해서 공백을 제거한다.
		s1="123";
		s2="123 ";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.trim().equals(s2.trim()));
		
		//valueOf를 통해서 String값을 바꿔준다.
		//primitive data type을 String으로 바꿔준다.
		s1=String.valueOf(100);
		System.out.println(s1);
		
		//split 은 분리하는 거
		String phone = "010-6024-1703";
		String[] temp=phone.split("-");
		for(int i = 0; i<temp.length; i++){
			System.out.print(temp[i]+" ");
		}
		for (String string : temp) {
			System.out.println(string);
		}
		
		//format
		str = String.format("%3$,d %2$,d %,d", 1000000,20000000,3000000);
		String stra = String.format("%3$,10d %2$,10d %,10d", 1000000,20000000,3000000);
		String strb = String.format("%3$,10.2f %2$,10.2f %,10.2f", 100.234,20000.456,3000.789);
		System.out.println(str);
		System.out.println(stra);
		System.out.println(strb);
		
		System.out.printf("%d%n",100);
		System.out.format("%d%n",100);
		
		
	 }
}
