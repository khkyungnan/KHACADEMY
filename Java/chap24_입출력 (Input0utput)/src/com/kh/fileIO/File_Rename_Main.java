package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile =mainPath+"cute.png";
		String newFile = mainPath+"cute222.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//���� �̸� �����ϱ�
//		���࿡ ������ �ִٸ�!
		if (currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ����!");
		} else {
			System.out.println("���� �̸� ���� ���� �Ф�");
		}
				
	}

}
