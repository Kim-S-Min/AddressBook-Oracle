package miniproject;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
	
	
	
	//	명단
	public static void listPhoneBook() {
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		List<PhoneBookVo> list = dao.getList();
		Iterator<PhoneBookVo> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVo vo = it.next();
			System.out.printf("%d, %s, %s, %s%n", vo.getId(), vo.getName(), vo.getHp(), vo.getTel());
		}
	}
	
	
	// 등록
	public static void insertPhoneBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("휴대전화: ");
		String hp = scanner.next();
		System.out.print("집전화: ");
		String tel = scanner.next();
		
		PhoneBookVo vo = new PhoneBookVo(name, hp, tel);
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		boolean success = dao.insert(vo);
		
		System.out.println("[등록" + (success ? "되었습니다.]": "되지않았습니다.]"));
		scanner.close();
	}
	
	
	//	삭제
	public static void deletePhoneBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호: ");
		long phone_bookId = scanner.nextLong();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		boolean success = dao.delete(phone_bookId);
		
		System.out.println("[삭제" + (success ? "되었습니다.]": "되지않았습니다.]"));
		scanner.close();
	}
	
	
	//	검색
	public static void searchPhoneBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String keyword = scanner.next();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		List<PhoneBookVo> list = dao.search(keyword);
		
		Iterator<PhoneBookVo> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVo vo = it.next();
			System.out.println(vo);
		}
		scanner.close();
	}	
}