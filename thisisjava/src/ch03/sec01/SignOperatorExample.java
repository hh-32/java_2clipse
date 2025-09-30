package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		x = -x; //100
		
		System.out.println("x: " +x);
		
		byte b = 100;
		int y = -b; //정수타입 연산의 결과는 int 타입
		
		System.out.println("y: "+ y);

	}

}
