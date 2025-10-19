package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = null; //주소값이 없는 상태에서 intArray[0]을 실행해서 NullPointer 예외 발생
//		intArray[0] = 10; //NullPointerException
		
		String str = null; //얘도 null인데 length() 호출해서 오류 발생함
//		System.out.println("총 문자 수: " + str.length() ); //NullPointerException

	}

}
