package com.kh.practice;

import java.io.File;

public class PracticeCopy {

	public static void main(String[] args) {
		
	}
	public void practice1() {
		String filePath = "C:\\Users\\user1\\Desktop\\";
		String inputFile =filePath+"love.png";
		String outputFile = filePath+"RealLove.jpg";
		
		File currentFile = new File(filePath + inputFile);
		File newFile = new File(filePath + outputFile);
		if(currentFile.renameTo(newFile)) {
			System.out.println("���� �̸� ���� ����");
		} else {
			System.out.println("���� �̸� ���� ����");
		}
	}
	public void practice2() {
		//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� 
		// ����ȭ�鿡�ٰ� ������ ����
		//���� �ȿ� ������ �̹��� �����ϱ�
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		if(!newFolder) {
		String outputFile =newFolder+"\\"+"cute1.jpg";
	}
}
