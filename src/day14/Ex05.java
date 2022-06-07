package day14;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex05 {

	public static void main(String[] args) {
		
		long t = System.currentTimeMillis();
						// �ð��� ������ Ű����
		System.out.println(t);
		
		SimpleDateFormat fo = 
				new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� ----");
		// ��ȣ�ȿ� ���� ���� �־��ֱ� 
		// format : ���� ���ϴ� Ű����  
		
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
			// sleep ��ȣ�ȿ��� 1000���� 1�� ���� �� �־ 
			// 1000�� ������ 1�� ��� , 500�� ������ 0.5�� ��� 
			// Thread.sleep() : ��� �����ִ� ��� 
			// �� ��ɿ� �ݵ�� ���� ó���� �ؾ��Ѵ� 
			// try catch : ���� ó�� ��� 
			
			System.out.println(i);
		}
	}
}
