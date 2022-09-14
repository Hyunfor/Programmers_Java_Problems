package Java_Problems;

public class StaticExam {

	public static void main(String[] args) {
		Car3 taxi = new Car3();
        Car3 suv = new Car3();
        
        taxi.wheelCount = 10;
        suv.wheelCount = 4; // static은 값을 공유함. 그러므로 4
        
        System.out.println("taxi의 바퀴수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴수:"+ suv.wheelCount);

	}

}
