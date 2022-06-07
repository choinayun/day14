package day14;

class D01 {
	public void test() throws InterruptedException {
		Thread.sleep(0);
	}
}

class D02 extends D01 {
	public void test2() throws InterruptedException {
		test();
	}
}

public class Ex08 {

	public static void main(String[] args)
				throws InterruptedException {
				// 예외전가                                    
		D02 d = new D02();
		d.test2();
		
		try {
			System.out.println(10/2);
		}catch (Exception e) {
			System.out.println("catch 실행");
		}finally {
			System.out.println("finally 실행");
			// 예외가 발생하던 발생하지 않던
			// finally 는 무조건 실행 된다 
		}
		System.out.println("다음 문장들 실행");
		
				
		
	
	}
}
