package day14;

// 싱글톤 
class DBconnect{
	
	private static DBconnect db; 
	private static int cnt = 0;
	private DBconnect() { cnt++; } // 생성자에 private 객체 생성 불가
	public int getCnt() { return cnt;}
	public void controllDB() {
		System.out.println("db사용");
	}
	public static DBconnect getInstance() {
		// 자료형 일치 
		// 객체 만들때 getInstance 를 호출해서 만들기 
		
		// 싱글톤을 사용하면 한 개의 객체만 만들어서 사용 
		
		if(db == null)
			db = new DBconnect();
		return db;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		DBconnect db01 = new DBconnect();
		DBconnect db02 = new DBconnect();
		DBconnect db03 = new DBconnect();
		DBconnect db04 = new DBconnect();
		DBconnect db05 = new DBconnect();
		DBconnect db06 = new DBconnect();
		DBconnect db07 = new DBconnect();
		*/
		DBconnect db01 = DBconnect.getInstance();
		DBconnect db02 = DBconnect.getInstance();
		DBconnect db03 = DBconnect.getInstance();
		DBconnect db04 = DBconnect.getInstance();
		System.out.println(db01);
		System.out.println(db02);
		System.out.println(db03);
		System.out.println(db04);
		
		// db01.controllDB();
		System.out.println(db01.getCnt() + "명이 연결 되었습니다");
		
		
		
	}
}
