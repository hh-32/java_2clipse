package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			
			if (num == 6) {
				break; //무작위로 1~6의 정수를 출력, 6이 나오면 종료
			}
		}
		System.out.println("프로그램 종료");

	}

}
