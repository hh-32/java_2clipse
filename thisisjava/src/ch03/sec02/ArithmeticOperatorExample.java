package ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5; //사용X..?
		long v4 = 10L;
		
		//P.5_자동 타입 변환_byte < short&char < int < long < float < double
		
		int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동 변환 후 연산
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4; //모든 피연산자는 long 타입으로 자동 변환 후 연산
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2; //double 타입으로 강제 변환 후 연산
		System.out.println("result3: " + result3);
		
		//자동 타입 변환 vs 강제 타입 변환 => 데이터 손실 가능성과 표현 범위의 차이 때문에
		//result3에서 v1과 v2는 int 타입으로, 결과가 자동적으로 int 타입으로 반환됨.
		//따라서 강제 형변환으로 double로 승격 (정수 나눗셈을 피하기 위해..?)
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);		

	}

}
