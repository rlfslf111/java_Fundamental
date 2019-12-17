package java_20191128;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		
		//HashSet은 data(객체)의 중복을 허용하지 않고, 순서가 없음.
		HashSet set = new HashSet();
		while(true){
			int random = (int)(Math.random()*45)+1;
			set.add(random);
			if(set.size()==6) break;
		}
		Iterator i = set.iterator();
		while(i.hasNext()){ //hasNext() : HashSet에 출력할 객체가 존재하는지 판단하는 메서드
			int temp = (Integer)i.next(); //next() 해당 객체를 가져온다.
			System.out.print(temp + "\t");
		}
	}
}
