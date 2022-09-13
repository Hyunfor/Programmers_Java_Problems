package Java_Problems;

public class ForExam2 {

	public static void main(String[] args) {
		int total = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){  // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.  
                continue; // 홀수일 경우 total = total + i; 문장이 실행되지 않으므로, 결과적으로 짝수만 더해준다. 
            }
            total = total + i;
        }
        System.out.println(total);

        }

}

