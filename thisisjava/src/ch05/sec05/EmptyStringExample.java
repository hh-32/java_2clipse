package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = ""; //빈 문자열도 String 객체로 생성됨
		if(hobby.equals("")) //변수가 빈 문자열을 참조하는지 조사하기 위해 equals() 메소드를 사용함
		{
			System.out.println("hobby 변수가 참조는 String 객체는 빈 문자열");
		}

	}

}
