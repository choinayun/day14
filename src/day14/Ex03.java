package day14;

class A02 {
	
	public A02(String n) {
		// 3)
		// �θ��� �����ڿ� ���� ������ �Ѵٸ�
		// �ݵ�� �� ���� �����ؾ��Ѵ� 
		System.out.println(n + " : A02 ����");
	}
	
	public void t() {
		System.out.println("�θ�");
	}
}

class A01 extends A02{
	
	public A01() {
		super("��"); // super ��� Ű����� �θ� �����ڿ��� ���� ���� 
		System.out.println("A01 ������ ����");
		
		super.t();
		this.t();
		// 2)
		// ������ �̸��� �޼ҵ尡 ���� ��쿡 ����ϴ� Ű����
		// ������ �������� �ַ� ����� 
		// this �� �ڽ�(�ڱ��ڽ�)�� ��ü�� ����
		// super �� �θ��� ��ü�� ���� 
	}
	
	public void t() {
		System.out.println("�ڽ�");
	}
	
	public A01(String s) {
		super(s);
		
		// 4)
		// �ڽ� �������� �����ε� 
	}
}

public class Ex03 {

	public static void main(String[] args) {
	
		// A01 a = new A01();
		// 1) 
		// �θ��� �����ڰ� ���� ����ǰ� 
		// �� ���� �ڽ��� �����ڰ� ���� 
		
		A01 a = new A01("�޾��ִ� ��");
	
		
		
	}
	
}
