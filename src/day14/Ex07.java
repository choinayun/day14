package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� ó�� : ���α׷����� �������� ��Ȳ�� ó���ϴ� �� 
//			 ����) ���α׷��� �����Ű�� �ʴ´� 
// ���� ���� : throw
// ���� ���� : throws
// ���� ó�� : try, catch 

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		
		System.out.println("�� �Է�");
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
			// ������ �߻� �� ������ �ִ� �� 
			// try �� catch ���̿� �ۼ� 
			/*
		} catch (ArithmeticException e) {
			// ��ȣ �ȿ� �������� ������ ����
			// ������ �߻� �� catch �̵� 
			// System.out.println("0�� �Է��ϸ� �ȵ˴ϴ�");
			e.printStackTrace(); 
			// � ������ �߻��ߴ��� 
		} catch (InputMismatchException e) {
			// ���ο� ������ �� ��� 
			// catch â�� ���� ��ȣ�� ���� ���� ���� 
			System.err.println("���� �Է��� �ȵ˴ϴ�");
			// err : ���������� ��� 
		*/
		}	catch(Exception e) {
				e.printStackTrace();
		}
		System.out.println(result);
	}
}
