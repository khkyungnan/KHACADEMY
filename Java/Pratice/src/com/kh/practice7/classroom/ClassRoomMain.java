package com.kh.practice7.classroom;

public class ClassRoomMain {

	public static void main(String[] args) {
/*
	메소드 명 : public void practice8(){}
	1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
	2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
	1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
	<출석부>
	{1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하}
	1분단
	강건강 송성실 if 짝 수 일 때는 인덱스 0부터 시작 홀수일 때는 인덱스 1 
	남나나 윤예의 
	도대담 진재주 
	2분단
	류라라 차천축 
	문미미 피풍표 
	박보배 홍하하 

	
	
	2열 3행 1분단
	강건강(0,0) 남나나(0,1) 2 
	도대담(1,0) 류라라(1,1) 
	문미미(2,0) 박보배(2,1) 
	2열 3행 2분단
	송성실(0,0) (3,0) 윤예의(0,1)(3,1) 
	진재주(1,0) (4,0) 차천축(1,1)(4,1) 
	피풍표(2,0) (5,0) 홍하하(2,1)(5,1)
*/
	//1.학생 이름을 저장하는 문자열 배열 선언하고 초기화
	String[] students= {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
	//2. 각 분단의 행과 열의 개수를 정의 rows 행개수 cols 열개수
	int rows = 3;
	int cols = 2;
	
	//3. 두 개의 2차원 문자열 배열 classRoom1 classRoom2 선언 및 초기화
	//두 분단의 자리 배치를 나타냄
	String[][] classRoom1 = new String[rows][cols];
	String[][] classRoom2 = new String[rows][cols];
	//4. 학생 배열을 반복처리하기 위한 반복문
	//	i 변수는 학생 인덱스
	for (int i = 0; i< students.length; i++) {
		int row = i % rows; //row 변수는 행 인덱스
		int col = i /rows; //col 변수는 열 인덱스
		if (col % 2 ==0) {//현재 열이 짝수 열인지 확인// 짝수 열은 첫 번째 분단에 해당
			classRoom1[row][col/2] = students[i];// col/2 열 인덱스를 반으로 나눈값 배치
		
		} else { //현재 열이 홀수 열인 경우 두 번째 분단에 해당
			classRoom2[row][col/2] = students[i];
		}
	}
	
	//출력 
	System.out.println("1분단");
	printClassRoom(classRoom1);
	System.out.println("2분단");
	printClassRoom(classRoom2);
	}
	//classRoom 출력 메소드 분단 자리 배치를 출력하는 역할
	public static void printClassRoom(String[][] classRoom) {
		// 현재 행을 나타내는 반복문 분단의 행 수 만큼 반복
		for(int row = 0; row<classRoom.length;row++) {
			//현재 열을 나타내는 반복문 분단의 열 수 만큼 반복
			for(int col = 0; col<classRoom[0].length; col++) {
				//현재 위치에 있는 학생의 이름 출력
				System.out.print(classRoom[row][col] + " ");
			}
			//개행문자 출력해서 다음 행으로 넘어감
			System.out.println();
		}
	}

}





