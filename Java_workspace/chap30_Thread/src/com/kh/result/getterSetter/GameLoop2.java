package com.kh.result.getterSetter;

public class GameLoop2 implements Runnable {
	 private static boolean isGameOver = false;
	 
	 public void endGame() {
		 this.isGameOver = true;
	 }
	@Override
   public void run() {
       //boolean isGameOver = false;
       while (!isGameOver) {
           // ���� ���� ����
           int randomValue = new java.util.Random().nextInt(10); // ������ ���� ����
           System.out.println("������ ����: " + randomValue);

           // ���� ���� ���� �ð�
           try {
               Thread.sleep(1000); // 1�� ���
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           
           /*
            try {
	            System.in.read();
	            //isGameOver = true;
	            gameLoop.setGameOver(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
            * */
       }
       System.out.println("���� ����");
   }
}