package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

// 예외 처리 : 프로그램에서 예외적인 상황을 처리하는 것 
//			 단점) 프로그램을 종료시키지 않는다 
// 강제 예외 : throw
// 예외 전가 : throws
// 예외 처리 : try, catch 

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		
		System.out.println("수 입력");
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
			// 문제가 발생 될 소지가 있는 걸 
			// try 와 catch 사이에 작성 
			/*
		} catch (ArithmeticException e) {
			// 괄호 안에 오류상의 문구를 복사
			// 문제가 발생 시 catch 이동 
			// System.out.println("0을 입력하면 안됩니다");
			e.printStackTrace(); 
			// 어떤 문제가 발생했는지 
		} catch (InputMismatchException e) {
			// 새로운 오류가 뜰 경우 
			// catch 창을 만들어서 괄호에 오류 문구 복사 
			System.err.println("문자 입력은 안됩니다");
			// err : 빨간색으로 출력 
		*/
		}	catch(Exception e) {
				e.printStackTrace();
		}
		System.out.println(result);
	}
}
