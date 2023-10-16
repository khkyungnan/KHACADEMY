package com.kh.gettersetter;

public class PlayerCharacter {
	private String name;   		//ĳ�����̸�
	private   int  health; 		//ü��
	private   int  attackPower; //�����Ŀ�
/*
	public PlayerCharacter(String name, int health, int attackPower) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}
*/
	/*
	 getter
	 	������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	 	���������ʹ� ������
	 * */
	/*
	public PlayerCharacter() {
		
	}
	*/
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	/*
	 setter
	 �ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
	 �޼ҵ�� �Ű���(=�Ű�����)�� �����ؼ� ������ ���� �����ͷ� ������ �� ����
	 * */
	
	public void setName(String name) {
		this.name = name;
	}
//setter���� �����Ѵ� ��⸦ �ϴ���
	public void setHealth(int health) {
		// ���࿡ ü���� 0�̶�� ���̰� ü���� 1�̻� �̸� �츮��
		if(health >= 1 ) { // ü���� 1 �̻��� ���
			this.health = health;
		} else { // ü���� 0 ���϶�� ü���� ǥ���� ��ġ�� ����.
			System.out.println("ü���� �����ϴ�...");
		}
		
	}
	
	//0 �̸��� ���� �־ 0������ ���� ��µ��� ����
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� Ŭ ���
		if(attackPower  >= 1) {
			this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("power�� �������մϴ�.");
		}
		
	}
	
	//ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + name);
		System.out.println("ü�� ���� : " + health);
		System.out.println("���� �Ŀ� : " + attackPower);
	}
	
	//ĳ���� �����ϴ� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("["+name+"]�� �����ؼ� [" + getName()+"] ���� " + attackPower+" �������� ����ϴ�!");
		System.out.println("�����߽��ϴ�.");
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
}



