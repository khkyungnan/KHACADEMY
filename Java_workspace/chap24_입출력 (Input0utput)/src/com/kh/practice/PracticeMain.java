package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	
	public void practice1() { //��μ����ؼ� ���� �����
		try {
			//C://Users//user1//Desktop//
			FileWriter w = new FileWriter("(����߰�)FileName.txt");
			//���� ����
			//���� �ݱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
		//���� �ȿ� ���� �ۼ��ϱ�
		
		// File.separtor 
		// window : \
		// Linux or MacOs : /
		
		
		final String folderPath = "C:\\Users\\user1\\Desktop\\new_folders";//���ϴ� ��� ����
		String wpath = folderPath + "\\.git";
		File f = new File(wpath);
		// exists �̹� �����ϴ��� Ȯ��
		if(!f.exists()) {
			f.mkdir();
			System.out.println("Initialized empty Git repository in " +folderPath+"\\.git");
			
		} else {
			System.out.println("Reinitialized existing Git repository in C:/Users/user1/Desktop/new_folders/.git/");
		}
		
		FileWriter w;
		try {
			w = new FileWriter(wpath+"\\newTxt.txt");
			w.write("���ο� ������ ������ �Է��մϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
