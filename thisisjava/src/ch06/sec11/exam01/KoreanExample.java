package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 시 주민등록번화, 이름 전달
		Korean k1 = new Korean("051112-12345667", "최하현");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 필드는 값을 변경할 수 없음
//		k1.nation = "USA"; //에러 발생으로 주석 처리
		
		//비 final 필드는 값 변경 가능!
		k1.name = "김하현";
		System.out.println(k1.name); //값 변경 결과 출력

	}

}
