package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("KH");

		player1.setHealth(-10); //-10ü���� �������ְ�
		player1.VaildHealth(); 
		//-10�� ���Ἲ(���������ڵ尡 ������ ������)���� �����Ѵ�.
		
		player1.setAttackPower(-20);
		player1.VaildAttackPower(); 
		
		player1.displayInfo();
		
		/* GameRun���� player2�� Vaild �����ϱ� */
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		player2.setHealth(80);
		player2.VaildHealth();
		player2.setAttackPower(10);
		player2.VaildAttackPower();
		player2.displayInfo();
		
		System.out.println("attack!!!! ��");
		
		
	}

}
