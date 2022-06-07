package day14;

class Calc{
	public void display() {
		System.out.println("나는 계산기");
	}
}

//  상속 
// extends 써서 사용하는 class 자식클래스 
// 부모클래스 Calc , 자식클래스 Computer 
class Computer extends Calc{
	public void print() {
		System.out.println("나는 컴퓨터");
	}
}


public class Ex02 {
	
	public static void main(String[] args) {
		
		Computer calc = new Computer();
		calc.display();
		calc.print();
		
		
	}

}
