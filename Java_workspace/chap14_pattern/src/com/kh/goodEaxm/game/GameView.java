package com.kh.goodEaxm.game;
//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������

public class GameView {
	private String StartMsg = "���� ���߱� ���� �����մϴ�.";
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println("1���� 100 ������ ���ڸ� ���纸����!");
	}
	
	//1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPromt() {
		System.out.println("������ ���ڸ� �Է��ϼ���.");
	}
	
	public void displayCorrectGuess() {
		System.out.println("���ڸ� ������ϴ�.");
	}
	public void displayInCorrectGuess() {
		System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
	}
	
	public void displayAttempts(int abc) {
		System.out.println("�õ�Ƚ�� : " + abc);
	}
	
	public void displauGameOver() {
		System.out.println("��������!");
	}
}






