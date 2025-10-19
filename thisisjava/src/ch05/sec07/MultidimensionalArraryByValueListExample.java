package ch05.sec07;

public class MultidimensionalArraryByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두번째 반의 학생 수): " + scores[1].length);
		
		//첫번째 반의 세번째 학생의 점수 읽기
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		//두번째 반의 두번째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i = 0; i < score[0]; i++)
		{
			class1Sum += scores[0][1];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		
	}//H: 이거 쓸 때 ㅈㄴ 졸렸음.. 오타있는지 봐라

}
