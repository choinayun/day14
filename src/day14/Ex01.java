package day14;

// �̱��� 
class DBconnect{
	
	private static DBconnect db; 
	private static int cnt = 0;
	private DBconnect() { cnt++; } // �����ڿ� private ��ü ���� �Ұ�
	public int getCnt() { return cnt;}
	public void controllDB() {
		System.out.println("db���");
	}
	public static DBconnect getInstance() {
		// �ڷ��� ��ġ 
		// ��ü ���鶧 getInstance �� ȣ���ؼ� ����� 
		
		// �̱����� ����ϸ� �� ���� ��ü�� ���� ��� 
		
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
		System.out.println(db01.getCnt() + "���� ���� �Ǿ����ϴ�");
		
		
		
	}
}
