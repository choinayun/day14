package day14;

class Calc{
	public void display() {
		System.out.println("���� ����");
	}
}

//  ��� 
// extends �Ἥ ����ϴ� class �ڽ�Ŭ���� 
// �θ�Ŭ���� Calc , �ڽ�Ŭ���� Computer 
class Computer extends Calc{
	public void print() {
		System.out.println("���� ��ǻ��");
	}
}


public class Ex02 {
	
	public static void main(String[] args) {
		
		Computer calc = new Computer();
		calc.display();
		calc.print();
		
		
	}

}
