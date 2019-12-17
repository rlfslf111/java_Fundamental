package java_20191126.Abstract_Shape;

public class ShapeDemo {
	
	public static void run(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없다.
		//Shape s = new Shape();
		Shape s1 = new Rectangle();
		s1.draw();
		Shape s2 = new Triangle();
		s2.draw();
		
		System.out.println();
		
		run(new Rectangle());
		run(new Triangle());
		run(new Circle());
		
	}
}
