package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		
		System.out.printf("상품의 가격: %d원 \n", value);
		System.out.printf("상품의 가격: %6d원 \n", value);
		System.out.printf("상품의 가격: %-6d원 \n", value);
		System.out.printf("상품의 가격: %06d원 \n", value);
		//System.out.println: 기본기능_값을 출력하고 줄 바꿈(\n)까지 자동으로 해줌 +문자열로 자동 타입 변환&출력
		//System.out.printf: 기본기능_서식(format) 지정 출력 +자동 줄 바꿈 안됨
		
		//System.out.println(num);
		//System.out.printf("%d\n", num);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String name = "최하현";
		String job = "도적";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
