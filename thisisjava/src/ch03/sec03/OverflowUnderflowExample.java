package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		for(int i = 0; i<5; i++) {		//{}를 5번 반복 실행 //반복문+증가 연산자 사용
			var1++;						//++ 연산은 var1의 값을 1 증가시킨다 +선 연산 후 증가
			
			System.out.println("var1: " + var1);
		} //byte: -128~127 범위까지만 표현 가능 //따라서 최댓값 127을 넘어가면 오버플로우 발생으로 최솟값으로 넘어감
		
		System.out.println("---------------------------");
		
		byte var2 = -125;
		for(int i = 0; i<5; i++) {
			var2--;
			
			System.out.println("var2: " + var2);
		}//최솟값 -128을 넘어가면 언더플로우 발생으로 최댓값으로 넘어감!

	}

}
