import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// main + 컨트롤 + 스페이스 = main 메서드 생성
		// 컨트롤 + 쉬프트 + f = 자동으로 들여쓰기
		// 컨트롤 + f11 실행
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		
		String cmd = sc.nextLine();
		
		System.out.println("입려된 명령어 : "  + cmd);
		
		System.out.println("== 프로그램 종료 ==");
		
		sc.close();
	}

}
