package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain rm = new ReplaceMain();
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replace5();
		rm.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World�� Java�� ��ü
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello world";
		// o�� �����ִ� ���ڿ��� x�� �����ϱ�
		String reString = originName.replace("o", "x");
		System.out.println(reString);
	}
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// fox -> cat
		String reString = originString.replace("fox", "cat");
		System.out.println(reString);
		
	}
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// ��� ���� �����ϱ�
		String reStr = originString.replace(" ", "");
		System.out.println(reStr);
		String reAllStr = originString.replaceAll("\\s", "");
		System.out.println(reAllStr);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace ��� replaceAll �� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� Java�� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", "");
		System.out.println(reAllstr);
	}
}
