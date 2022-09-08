package Java_Problems;

public class if_exam2 {

	public int conditionTest(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if( value % 4 == 0 ){
            ret = 4;
        }
        // 결과 체크를 위한 코드입니다.
        return ret;
    }
    /*
     * else if 문은 무한정 쓸 수 있습니다. 다만, 
     * else if를 너무 많이 쓰는 코드는 속도가 느리며, 
     * 또 보기에도 좋지 않습니다.
     * */
    //아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[]args){
    	if_exam2 exam = new if_exam2();
        exam.conditionTest(6);
        exam.conditionTest(8);
    }

}
