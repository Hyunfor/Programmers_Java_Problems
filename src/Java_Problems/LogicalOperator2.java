package Java_Problems;

public class LogicalOperator2 {
// 논리 연산자
	 public boolean isAgeDiscountable(int age) {
	        boolean isDiscount = false;
	        // 아래 빈칸을 채워 코드를 완성하세요.
	        if( age <= 19 || age >= 60) {
	            isDiscount = true;
	        }
	        else {
	            isDiscount = false;
	        }
	        return isDiscount;
	    }

	    public static void main(String[]args) {
	    	LogicalOperator2 exam = new LogicalOperator2();
	        exam.isAgeDiscountable(15);
	        exam.isAgeDiscountable(27);
	    }

}
