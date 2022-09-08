package Java_Problems;

public class Primitive_TypeCasting {

	public static void main(String[] args) {
		 long longValue = 20;
	     //이 아래줄에 int형 변수 intValue를 선언하고 
		 //longValue에 들어있는 값을 담아보세요.
	        
		 int intValue = (int) longValue;
	        
	     System.out.println(intValue);
	     
	     /*
	      * 명시적 형변환
	      * 크기가 더 큰 타입을 작은 타입으로 바꿀 때는 명시적으로 변환해주어야 한다.
	      * */
	     
	     long x = 50000;

	     // 묵시적 형 변환을 시도하면 오류가 발생합니다.
	     int y = x;
	     // 다음과 같이 명시적으로 형 변환 해주세요.
	     int y = (int) x;
	        

	}

}
