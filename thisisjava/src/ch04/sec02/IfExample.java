package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
//		int score = 90; //90점 이상: A
//		int score = 85;
		
		if (score >= 90)
		{
			System.out.println("점수가 90점 이상입니다");
			System.out.println("등급은 A 입니다");
		}
		
		if (score < 90)
			System.out.println("점수가 90점 미만입니다");
			System.out.println("등급은 B 입니다"); //{}의 생략으로 if문과는 상관없는 실행문이 돼버림
			
//		else
//		{
//			System.out.println("점수가 90점 미만입니다");
//			System.out.println("등급은 B 입니다"); //전공책 p.114~115
//		}

	}

}
