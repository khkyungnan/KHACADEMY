package com.kh.goodEaxm.game;

//컨트롤러 (Controller)
import java.util.Scanner;

public class GameController {
 private GameModel model;
 private GameView view;

 public GameController(GameModel model, GameView view) {
     this.model = model;
     this.view = view;
 }

 public void runGame() {
     view.displayWelcomeMessage();
     Scanner scanner = new Scanner(System.in);

     while (true) {
         view.displayGuessPrompt();
         int guess = scanner.nextInt();

         if (model.isCorrectGuess(guess)) {
             view.displayCorrectGuess();
             view.displayAttempts(model.getAttempts());
             break;
         } else {
             view.displayIncorrectGuess();
             view.displayAttempts(model.getAttempts());
         }
     }

     view.displayGameOver();
     scanner.close();
 }

 public static void main(String[] args) {
     GameModel model = new GameModel();
     GameView view = new GameView();
     GameController controller = new GameController(model, view);

     controller.runGame();
 }
}
