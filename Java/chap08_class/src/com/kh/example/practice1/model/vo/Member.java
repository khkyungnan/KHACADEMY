package com.kh.example.practice1.model.vo;

public class Member {
/*
1.�������
- memberId : String
- memberPwd : String
- memberName : String
- age : int
- gender : char
- phone : String
- email : String
2. ������
+ Member()
3. ��� �޼ҵ�
+ changeName(name:String):void
+ printName():void
 * */
	/* 1.������� */
	String memberId;
	String memberPwd;
	String memberName;
	int    age;
	char   gender;
	String phone; //int String ������ 
	String email;
	/* 2. ������ + Member() */
	public Member() {
	}
	/*
	public Member(char gender) {
		this.gender = gender;
	}
	*/
	/*
	 3. ��� �޼ҵ�
		+ changeName(name:String):void
		+ printName():void
	 * */
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	// printName():void
	public void printName() {
		System.out.println("�̸� : " + memberName);
	}
	
}





