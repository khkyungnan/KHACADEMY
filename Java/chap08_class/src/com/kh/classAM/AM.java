package com.kh.classAM;

public class AM {
	private final int c = 1;
	protected int pNum2 = 20;
	int pNum3 = 30; 
	// ���� �����ڸ� ������� ������ �ڵ����� default ������ �����
	private int pNum4 = 40;
	
	//ȣ��޼ҵ� �ۼ��ؼ� ���� ȣ���ϱ�
	public void publicMethod() {
		System.out.println("� Ŭ���������� ������ ���� / public Method() ȣ���");
	}
	
	protected void protectedMethod() {
		System.out.println("���� ��Ű�� �������� ���� ���� / protected Method() ȣ���");
	}
	
	void defaultMethod() { 
	//default �� �տ� ���������ڸ� �ۼ������� ������ �⺻���� ������ ��
		System.out.println("���� ��Ű�� �������� ���� default Method() ȣ���");
	}
	
	private void privateMethod() {
		System.out.println("private Method() ȣ���");
	}
}




