package com.kh.example.practice1.run;
//import com.kh.example.practice1.model.vo.Member;
import com.kh.example.practice1.model.vo.Member;

public class Run {
/*
 ����� �޼ҵ�� �⺻ �����ڸ� ���� Member type��
��ü�� �����ϰ� changeName()�� �̿��� �� ���� ��
printName()�� �̿��� ��
 * */
	public static void main(String[] args) {
		// 1. Member ��ü�� ����
		/*
		 ���࿡ char ���� �ְ� ������ '' �� �־������ ex) '��' '��'
		 * Member member = new Member('��');*/
		Member member = new Member();
		//member.memberId();
		// 2. changeName() �� ����
		member.changeName("������");
		// 3. printName()�� �̿��� ���
		member.printName();

	}

}
