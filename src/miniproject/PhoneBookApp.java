package miniproject;


import java.util.Scanner;

public class PhoneBookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneBookMain pbm = new PhoneBookMain();
		int balance = 0;
		boolean run = true;
		

		while(run) {
			System.out.println("======================================");
			System.out.println("*          전화번호 관리 프로그램          *");	
			System.out.println("======================================");
			System.out.println("1. 명단 2. 등록 3. 삭제 4. 검색 5. 종료");	
			System.out.println("--------------------------------------");
			System.out.print("> 메뉴번호: ");
			int menu = scanner.nextInt();
			int amount = 0;		

			
			switch (menu) {
			case 1: //	명단보기
				pbm.listPhoneBook();
				break;
				
				
			case 2: //	등록
		       pbm.insertPhoneBook();
				break;
				
				
			case 3: //	삭제
				pbm.deletePhoneBook();
				break;
				
				
			case 4: //	검색
				pbm.searchPhoneBook();
				break;
				
				
			case 5:	//	종료
				run = false;
				System.out.println("--------------------------------------");
				System.out.println("*      프로그램을 종료합니다 감사합니다      *");
				System.out.println("--------------------------------------");
				break;
				
				
			default:	// 없는 메뉴
				System.out.println("[다시 입력해 주세요]");
			}
		}
	}
}

