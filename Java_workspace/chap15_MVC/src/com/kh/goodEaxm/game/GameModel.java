package com.kh.goodEaxm.game;

//�� (Model)
public class GameModel {
	private int secretNumber;
	private int attempts;

	public GameModel() {
	    secretNumber = (int) (Math.random() * 100) + 1; // 1���� 100 ������ ������ ���� ����
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