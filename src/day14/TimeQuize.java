package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// �� Ǯ�� 

class Time {
	
	private Date date;
	private SimpleDateFormat simpl;
	
	public void timefunc() {
		
		simpl = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��") ;
		
		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Date date = new Date();
			String s = simpl.format(date);
			System.out.println(s);
		
		}
	}
}	

class func {
	
	public void welfunc() {
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("======== ȯ �� ========");
		System.out.println("1. �� ��");
		System.out.println("2. off");
		System.out.println("�Է� >>>");
		num = input.nextInt();
		
		if(num == 1) {
			
		}else if(num == 2) {
			System.exit(1);
		}
		
	}
}

public class TimeQuize {
	
	public static void main(String[] args) {
		
		Time t = new Time();
		t.timefunc();
		
		func f = new func();
		f.welfunc();
	
	}
}


