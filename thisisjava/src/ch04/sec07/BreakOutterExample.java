package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception{
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
					for(char lower = 'a'; lower <= 'z'; lower++) {
						System.out.println(upper + "-" + lower);
				
						if(lower == 'g') {
							break Outter; //바깥쪽 for문에 붙인 Outter 라벨을 종료
						}
					}
			}
		
		System.out.println("프로그램 실행 종료");

	}

}
