package com.kh.goodEaxm.game;


//�� (View)
public class GameView {
	/*
	 String welcomeMsg = "���� ���߱� ������ �����մϴ�!";
String welcomeGuideMsg = "1���� 100 ������ ���ڸ� ���纸����.";
	 * */
 public void displayWelcomeMessage() {
     System.out.println("���� ���߱� ������ �����մϴ�!");
     System.out.println("1���� 100 ������ ���ڸ� ���纸����.");
 }

 public void displayGuessPrompt() {
     System.out.print("������ ���ڸ� �Է��ϼ���: ");
 }

 public void displayCorrectGuess() {
     System.out.println("�����մϴ�! ���ڸ� ������ϴ�!");
 }

 public void displayIncorrectGuess() {
     System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
 }

 public void displayAttempts(int attempts) {
     System.out.println("�õ� Ƚ��: " + attempts);
 }

 public void displayGameOver() {
     System.out.println("���� ����!");
 }
}
