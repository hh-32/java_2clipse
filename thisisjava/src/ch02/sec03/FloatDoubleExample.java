package ch02.sec03;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var1 = 0.1234567890123456789f; //정밀도 확인
		double var2 = 0.1234567890123456789; //double 타입이 float 타입보다 약 2배 정도의 유효 자릿수를 가진다
		
		System.out.println("var1: "+ var1);
		System.out.println("var2: "+ var2); //10진수 리터럴
		
		double var3 = 3e6;
		float var4 = 3e6f; //컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에
		double var5 = 2e-3;
		
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4); //e 또는 E가 포함된 10의 거듭제곱 리터럴
		System.out.println("var5: "+ var5);

	}

}
