package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oldIntArray = {1, 2, 3}; //길이가 3인 배열
		int[] newIntArray = new int[5]; //길이가 5인 배열을 새로 생성
		
		for (int i = 0; i < oldIntArray.length; i++) //배열 항목 복사
		{
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) //배열 힝목 출력
		{
			System.out.print(newIntArray[i] + ", ");
		}//println() , print() 의 결과가 다름
	}
}
