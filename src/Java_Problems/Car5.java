package Java_Problems;

public class Car5 {
   String name;
   int number;
   
   Car5(String name, int number){
	   this.name = name;
	   this.number = number;
   }
   
   public Car5() {
	   this("이름 없음", 0);
   }
   public Car5(String name) {
	   this(name, 0);
   }
   
}