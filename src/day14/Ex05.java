package day14;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex05 {

	public static void main(String[] args) {
		
		long t = System.currentTimeMillis();
						// 시간을 얻어오는 키워드
		System.out.println(t);
		
		SimpleDateFormat fo = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 ----");
		// 괄호안에 만들 형식 넣어주기 
		// format : 형식 정하는 키워드  
		
		String s = fo.format( t );
		System.out.println( s );
		
		Date date = new Date();
		System.out.println( date );
		
		String r = fo.format( date );
		System.out.println( r );
		
		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// sleep 괄호안에는 1000분의 1의 값이 들어가 있어서 
			// 1000이 들어오면 1초 대기 , 500이 들어오면 0.5초 대기 
			// Thread.sleep() : 대기 시켜주는 기능 
			// 이 기능엔 반드시 예외 처리를 해야한다 
			// try catch : 예외 처리 기능 
			
			System.out.println(i);
		}
	}
}
