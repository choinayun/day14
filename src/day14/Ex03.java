package day14;

class A02 {
	
	public A02(String n) {
		// 3)
		// 부모의 생성자에 값을 갖고자 한다면
		// 반드시 그 값을 전달해야한다 
		System.out.println(n + " : A02 실행");
	}
	
	public void t() {
		System.out.println("부모");
	}
}

class A01 extends A02{
	
	public A01() {
		super("값"); // super 라는 키워드로 부모 생성자에게 값을 전달 
		System.out.println("A01 생성자 실행");
		
		super.t();
		this.t();
		// 2)
		// 동일한 이름의 메소드가 있을 경우에 사용하는 키워드
		// 가독성 때문에라도 주로 사용함 
		// this 는 자식(자기자신)의 객체를 뜻함
		// super 는 부모의 객체를 뜻함 
	}
	
	public void t() {
		System.out.println("자식");
	}
	
	public A01(String s) {
		super(s);
		
		// 4)
		// 자식 생성자의 오버로딩 
	}
}

public class Ex03 {

	public static void main(String[] args) {
	
		// A01 a = new A01();
		// 1) 
		// 부모의 생성자가 먼저 실행되고 
		// 그 다음 자식의 생성자가 실행 
		
		A01 a = new A01("받아주는 값");
	
		
		
	}
	
}
