package Java_Problems;

public class Primitive_TypeCasting {

	public static void main(String[] args) {
		 int intValue = 200;
	     //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.
	        
		 long longValue = intValue;

	     System.out.println(longValue);
	     
	     /*
	      * 묵시적 형 변환
			크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때는 컴파일러에 
			별도의 명령을 하지 않아도 됩니다.
	      * */
	     
	     int x = 50000;
	     // 형 변환이 묵시적으로 이루어집니다.
	     long y = x;


	}

}
