package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06 {

	private Date date;
	private SimpleDateFormat simpl;
	
	// 선생님 풀이 
	
	public Ex06() {
		
		simpl = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	}
	
	public void print() {
		String result = null;
		for(int i = 0; i < 10; i++) {
			
			date = new Date();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			result = simpl.format(date);
			System.out.println(result);
			
		}
	}
	
}
