package com.kh.goodEaxm.game;


//뷰 (View)
public class GameView {
	/*
	 String welcomeMsg = "숫자 맞추기 게임을 시작합니다!";
String welcomeGuideMsg = "1에서 100 사이의 숫자를 맞춰보세요.";
	 * */
 public void displayWelcomeMessage() {
     System.out.println("숫자 맞추기 게임을 시작합니다!");
     System.out.println("1에서 100 사이의 숫자를 맞춰보세요.");
 }

 public void displayGuessPrompt() {
     System.out.print("추측한 숫자를 입력하세요: ");
 }

 public void displayCorrectGuess() {
     System.out.println("축하합니다! 숫자를 맞췄습니다!");
 }

 public void displayIncorrectGuess() {
     System.out.println("틀렸습니다. 다시 시도하세요.");
 }

 public void displayAttempts(int attempts) {
     System.out.println("시도 횟수: " + attempts);
 }

 public void displayGameOver() {
     System.out.println("게임 종료!");
 }
}
