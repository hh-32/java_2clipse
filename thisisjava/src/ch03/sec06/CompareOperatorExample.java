package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		System.out.println("result3: "+ result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //65 < 66
		
		System.out.println("result4: "+ result4);
		
		float num5 = 0.1f;
		double num6 = 1.0;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		
		System.out.println("result6: "+ result6);
		System.out.println("result7: "+ result7);
		
		String str1 = "자바";
		String str2 = "Java";

	}

}
