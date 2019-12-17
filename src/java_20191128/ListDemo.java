package java_20191128;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, data(객체)의 중복을 허용한다.
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"terra",2500));
		list.add(new Product(2,"sinla",1000));
		list.add(new Product(3,"seoul",3000));
		
		for (int i = 0; i < list.size(); i++) {
			Product temp = list.get(i);
			System.out.println(temp);
		}
		
		System.out.println();
		
		//모두 삭제 => list.remove(int index)를 사용해서 삭제 가능.
		for(int i=0; i<list.size();){
			list.remove(i);
		}
		
		
		//enhanced for loop로도 출력가능(제너릭=<>으로 성언한 경우만 가능)
		for (Product temp : list) {
			System.out.println(temp);
		}
	}
}


class Product{
	int number;
	String name;
	double price;
	Product(int number,String name,double price){
		this.number=number;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}