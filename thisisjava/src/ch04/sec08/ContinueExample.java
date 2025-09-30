package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i=1; i <= 10; i++) {
			if(i%2 != 0) {
				continue ; //2로 나눈 나머지가 0이 아닐 경우
			}
			System.out.println(i+" "); //실행 X
		}
		

	}//출제의 의도를 파악!!

}
