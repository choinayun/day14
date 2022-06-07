package day14;

class C01{
	protected String n;
	// 상속받은 자식들은 사용가능한 
	// 범위 : public > protected > private 
}

class C02 extends C01{
	 public void test() {
		 n = "안녕하세요";
		 // 부모가 가지고 있는 변수를 가져다 쓸 수 있다
		 print();
	 }
	 public void print() {
		 System.out.println(n);
	 }
}

public class Ex04 {

	public static void main(String[] args) {
		C02 c = new C02();
		c.test();
	}
}
