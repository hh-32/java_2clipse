package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		int y=5;
		
		System.out.println("x: "+ x + ", y: "+ y);
		
		int temp=x;
		x=y;
		y=temp; //빈 공간과 변수 x, y 총 3자리를 통해 숫자 바꾸기
		
		System.out.println("x: " + x + ", y: " + y); //P: class로 변경할 수 있는 방법 공부하기

	}

}
