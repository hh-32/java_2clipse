package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		x++; //선 연산 후 증가
		++x; //선 증가 후 연산
		System.out.println("x= " +x); //10-> 10_11 -> 12_12 ->12
		
		System.out.println("---------------------------------------------");
		
		y--; //증가, 감소 연산자 사용
		--y;
		System.out.println("y= " +y); //10 -> 10_9 -> 8_8 ->8
		System.out.println("---------------------------------------------");
		
		z = x++;
		System.out.println("z= " +z); //선 연산 ->12
		System.out.println("x= " +x); //후 증가 ->13
		
		System.out.println("---------------------------------------------");
		
		z = ++x;
		System.out.println("z= " +z); //14
		System.out.println("x= " +x); //14
		
		System.out.println("----------------------------------------------");
		
		z = ++x + y++; //x:선 증가 y: 후 증가
		System.out.println("z= " +z); //15 + 8
		System.out.println("x= " +x); //15
		System.out.println("y= " +y); //9
 
	}

}
