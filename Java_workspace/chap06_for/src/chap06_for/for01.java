package chap06_for;

public class for01 {

	public static void main(String[] args) {
		/*
		 for���� ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� �����
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 for (�ʱ�ȭ; ���ǽ�; ������) {
		  	//���ǽ��� ���� ��� �ݺ������� ������ �ڵ�
		 }
		 �ʱ�ȭ : �ݺ����� ���۵� �� �� ���� ����Ǵ� �κ�����,
		 		�ݺ� ������ �ʱ�ȭ �ϴ� ������ �Ѵ�.
		 ���ǽ�  : �ݺ����� ����� ������ �˻��ϴ� �κ����� 
		 		 ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 ������  : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����,
		 		  �ݺ� �ڵ� ��� ���� �� ����
		 
		 * */
		//	  �ʱ� i ��;  ����  ;  ������(������ ���Ҹ� �ִ� ��)
		/*
		for (int i = 1; i <= 2; i++  ) {
			System.out.println(i);//���� i<=5 ���� ��쿡 ����Ǵ� ����
		}
		

		
		for (int i = 2; i <= 7; i++) {
			System.out.println("i : " + i);
		}
		//				7 >=5    =8 - 1
		for (int i = 10; i >=5; i--) {
			System.out.println("i - �� : " + i);
		}
				int sum = 0;
		for(int i = 1; i<=10; i++) {
			//��
			sum  += i;
			System.out.println("1���� 10������ �� : " + sum);
		}
		
		// sum �� ���� 1~5������ ������ ����ϱ�
		int sum1 = 0;
		for(int i = 1; i<=5; i++) {
			//��
			sum1  += i;
			System.out.println("1���� 5������ �� : " + sum1);
		}
		int sum2 = 10;	//9	//10 -1
		for(int i = 5; i >= 2; i--) {
			sum2 -= 9;
			System.out.println("sum2 - : " + 5);
		}
		*/
		int mul = 1;
		for(int i = 1; i <= 9; i++) {//1��° for���� ��������
			for(int kk=1; kk<=9; kk++) {
				System.out.println(kk);
			}
			mul = 5 * i;
			System.out.println("������ : "+ mul);
		}
	}
}







