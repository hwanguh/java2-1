package Test.methord;

public class TestMethord1 {
	static void printhead(char c, int num) {
		for(int i=0; i<num; i++) {
			System.out.print(c);
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		printhead('☆',20);
		System.out.println("사용자 정의 메소드를 만들었습니다.");
		printhead('♡',30);
		System.out.println("사용자 정의 메소드를 호출하겠습니다.");
		printhead('♧',20);
	}

}
