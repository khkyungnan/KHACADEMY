public class AnimalMain {
	public class Dog {
		//인스턴스 변수
		String name; //강아지의 이름
		int age;	// 강아지의 나이
		
		//생성자 메서드
		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
			//name = "0";
			//age = 0;
		}
		
		//출력 메서드
		public void printInfo() {
			System.out.println("강아지이름 : "+ name);
			System.out.println("강아지나이 : " + age);
		}
		
	}


	public static void main(String[] args) {
		//Dog 클래스의 객체(=인스턴스객체) 생성
		Dog myDog = new Dog("멍멍이", 3);
		Dog yourDog = new Dog("왈왈이",2);
			
		myDog.printInfo();
		yourDog.printInfo();

	}

}
