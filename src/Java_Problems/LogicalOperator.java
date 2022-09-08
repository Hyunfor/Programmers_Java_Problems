package Java_Problems;

public class LogicalOperator {
// 논리 연산자
	public boolean isAgeTwenties(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if( 20 <= age  && age < 30) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }    
        return isTwenties;
    }

    public static void main(String[] args) {
    	LogicalOperator exam = new LogicalOperator();
        exam.isAgeTwenties(19);
        exam.isAgeTwenties(25);
    }

}
