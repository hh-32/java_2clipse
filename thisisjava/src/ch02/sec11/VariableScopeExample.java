package ch02.sec11;

public class VariableScopeExample {
	public static int v2; //블록 밖에서 선언하여 전역변수 설정

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		
		if (v1 > 10) {
			v2 = v1 - 10; //변수 초기화 설정
			
		}
		int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 떄문에 컴파일 에러가 생김

		System.out.println(v3); //코드 점검 및 확인용
	}

}
