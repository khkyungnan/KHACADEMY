package com.kh.goodEaxm.game;
//숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도횟수 게임종료

public class GameView {
	private String StartMsg = "숫자 맞추기 게임 시작합니다.";
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println("1에서 100 사이의 숫자를 맞춰보세요!");
	}
	
	//1. 숫자 추측하는 값 입력하기
	public void displayGuessPromt() {
		System.out.println("추측한 숫자를 입력하세요.");
	}
	
	public void displayCorrectGuess() {
		System.out.println("숫자를 맞췄습니다.");
	}
	public void displayInCorrectGuess() {
		System.out.println("틀렸습니다. 다시 시도하세요.");
	}
	
	public void displayAttempts(int abc) {
		System.out.println("시도횟수 : " + abc);
	}
	
	public void displauGameOver() {
		System.out.println("게임종료!");
	}
}






