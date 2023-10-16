package com.kh.goodEaxm.game;

//모델 (Model)
public class GameModel {
	private int secretNumber;
	private int attempts;

	public GameModel() {
	    secretNumber = (int) (Math.random() * 100) + 1; // 1에서 100 사이의 무작위 숫자 생성
	    attempts = 0;
	}

	public int getSecretNumber() {
	    return secretNumber;
	}

	public int getAttempts() {
	    return attempts;
	}

	public void incrementAttempts() {
	    attempts++;
	}

	public boolean isCorrectGuess(int guess) {
	    incrementAttempts();
	    return guess == secretNumber;
	}
}