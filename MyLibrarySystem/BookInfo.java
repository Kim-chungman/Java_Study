package MyLibrarySystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/**
 * 책의 기능을 구현하는 클래스
 * @author 충만
 *
 */
public class BookInfo extends BookData implements Book {

	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Map<String, BookData> map = new HashMap<>();
	DecimalFormat df = new DecimalFormat("000");
	private Calendar now = Calendar.getInstance();
	
	/**
	 * borrow - 도서 대출
	 * 1. 도서 코드 입력 : 도서 코드는 고유의 식별자 역할 -> 모르겠을 때 bookSearch() 호출
	 * 2. boolean형의 isRental()이 true면 대출중 또는 int형의 getStock()이 0이면 대출 불가
	 * 3. Calendar를 활용해 대출기간 출력(7일), SimpleDateFormat 활용 - 수업시간 예제 및 달력 과제 참고
	 * 4. 대출완료
	 */
	@Override
	public void borrow() {
		System.out.println("1.도서대출 2.도서연장신청");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1 :
			try {
				System.out.println("대출하기 원하는 코드번호 : ");
				String code = br.readLine();
				BookData db = map.get(code);
			
				if(map.get(code) == null) {
					System.out.println("코드번호를 모르시나요? 1. 네 모르겠어요 2. 다시 시도할게요 3. 이전 메뉴");
					int select = sc.nextInt();
					sc.nextLine();
					switch(select) {
					case 1 :
						bookSearch();
						borrow();
						break;
					case 2 :
						borrow();
						break;
					case 3 :
						System.out.println("이전 메뉴로 돌아갑니다.");
						return;
					default :
						System.out.println("잘못 입력하셨습니다. 다시 선택하세요.");
						return;	
					}
				}
			
				if(db.isRental() && db.getStock() == 0) {
					System.out.println("이미 대여중입니다.");
					return;
				}
				System.out.println("몇 권 빌리시나요?");
				int bookNum = sc.nextInt();
				sc.nextLine();
				if(bookNum > db.getStock()) {
					System.out.println("재고보다 많이 빌릴 수 없습니다.");
					System.out.println("다시 시도해주세요...");
					borrow();
				} else {
					db.setStock(db.getStock()-bookNum);
					System.out.println("번호\t책제목\t책장르\t저자명\t재고");
					System.out.println("========================================================================");
					System.out.print(code + "\t");
					System.out.print(db.getName() + "\t");
					System.out.print(db.getGenre() + "\t");
					System.out.print(db.getAuthor() + "\t");
					System.out.print(db.getStock() + "\n");
					System.out.println("대여완료!");
				
					String pattern = "yyyy년 M월 d일";
					SimpleDateFormat sdf = new SimpleDateFormat(pattern);
					String data = sdf.format(new Date());
					System.out.println("대여시간 : " + data);
					int lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
					if(now.get(Calendar.DAY_OF_MONTH)+7 <= lastday) {
						System.out.println("반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+1) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7) + "일");
					} else {
						System.out.println("반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+2) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7-lastday) + "일");
					}
				
					db.setRental(true);
					System.out.println();
				}
			
			/*
			 * 처음에 했던 방법 : 책 이름으로 대출
			 * 문제점 : 책 이름으로 빌렸을 때 동일한 이름의 책이라면 저자명이 달라도 다 빌려야한다..
			System.out.println("빌릴 책 이름을 입력하세요 : ");
			String bname = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String num = it.next();
				BookData db = map.get(num);
				
				if(db.getName().startsWith(bname)) {
					if(db.isRental() && db.getStock() == 0) {
						System.out.println("이미 대여중입니다.");
						break;
					}
					System.out.println("몇 권 빌리시나요?");
					int bookNum = sc.nextInt();
					sc.nextLine();
					if(bookNum > db.getStock()) {
						System.out.println("재고보다 많이 빌릴 수 없습니다.");
						System.out.println("다시 시도해주세요...");
						borrow();
					}else {
						db.setStock(db.getStock()-bookNum);
						System.out.println("번호\t책이름\t책장르\t재고수");
						System.out.println("=============================");
						System.out.print(num + "\t");
						System.out.print(db.getName() + "\t");
						System.out.print(db.getGenre() + "\t");
						System.out.print(db.getStock() + "\n");
						System.out.println("대여완료!");
						
						String pattern = "yyyy년 M월 d일";
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						String data = sdf.format(new Date());
						System.out.println("대여시간 : " + data);
						int lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
						if(now.get(Calendar.DAY_OF_MONTH)+7 <= lastday) {
							System.out.println("반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+1) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7) + "일");
						} else {
							System.out.println("반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+2) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7-lastday) + "일");
						}
						
						db.setRental(true);
						System.out.println();
					}
				}
			}
			*/
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			break;
		case 2 :
			try {
				System.out.println("연장 원하는 코드번호 : ");
				String code = br.readLine();
				BookData db = map.get(code);
				
				if(db.isRental()==false) {
					System.out.println("대출중이 아닙니다.");
					return;
				}
				
				System.out.println("번호\t책제목\t책장르\t저자명\t재고");
				System.out.println("========================================================================");
				System.out.print(code + "\t");
				System.out.print(db.getName() + "\t");
				System.out.print(db.getGenre() + "\t");
				System.out.print(db.getAuthor() + "\t");
				System.out.print(db.getStock() + "\n");
				
				System.out.print("입력하신 정보가 맞나요?(y/n) : ");
				String ans = sc.nextLine();
				if(ans.equals("y")||ans.equals("Y")) {
					String pattern = "yyyy년 M월 d일";
					SimpleDateFormat sdf = new SimpleDateFormat(pattern);
					String data = sdf.format(new Date());
					System.out.println("대여시간 : " + data);
					int lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
					if(now.get(Calendar.DAY_OF_MONTH)+7 <= lastday) {
						System.out.println("연장 후 반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+1) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7) + "일");
					} else {
						System.out.println("연장 후 반납시간 : " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+2) + "월 " + (now.get(Calendar.DAY_OF_MONTH)+7-lastday) + "일");
					}
				} else if(ans.equals("n")||ans.equals("N")) {
					System.out.println("취소되었습니다.");
				} else {
					System.out.println("y또는n만 입력해주세요.");
					System.out.println("다시 시도해주세요.");
					borrow();
				}
				
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			break;
		default :
			return;
		}
	}

	/**
	 * returnBook - 반납
	 * 1. 반납할 책 코드입력(고유의 식별자 역할) -> 모를경우 bookSearch()로 이동
	 * 2-1. 대출목록 : user가 빌린 도서내역 출력
	 * 2-2. 반납시 : isRental()을 false, setStock()+빌린재고수 만큼 재고변경 
	 */
	@Override
	public void returnBook() {
		System.out.println("1. 대출목록 2. 반납");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1 :
			Iterator<String> it = map.keySet().iterator(); 
			int count = 0;
			System.out.println("코드번호\t장르\t책제목\t저자명\t재고");
			System.out.println("========================================================================");
			while(it.hasNext()) {
				String key = it.next();
				BookData db = map.get(key);
				if(db.isRental()==true) {
					System.out.print(key + "\t");
					System.out.print(db.getGenre() + "\t");
					System.out.print(db.getName() + "\t");
					System.out.print(db.getAuthor() + "\t");
					System.out.print(db.getStock() + "\n");
					count++;
				}
			}
			if(count == 0) {
				System.out.println("검색된 책이 없습니다.");
				return;
			}
			System.out.println();
			System.out.println("총 " + count + "건의 책이 검색되었습니다.");
			System.out.println();
			break;
		case 2 :
			try {
				System.out.println("반납할 책 코드번호 : ");
				String code = br.readLine();
				
				if(map.get(code) == null) {
					System.out.println("코드번호를 모르시나요? 1. 네 모르겠어요 2. 다시 시도할게요");
					int select = sc.nextInt();
					sc.nextLine();
					switch(select) {
					case 1 :
						bookSearch();
						returnBook();
						break;
					case 2 :
						returnBook();
						break;
					default :
						return;	
					}
				}
			
				BookData db = map.get(code);
				if(!db.isRental()) {
					System.out.println("대여중이 아닙니다.");
				} else if (db.isRental()) {
					System.out.print("빌리셨던 권 수를 입력해주세요 : ");
					int bookNum = sc.nextInt();
					sc.nextLine();
					System.out.println("정상적으로 반납 되었습니다.");
					db.setStock(db.getStock()+bookNum);
					db.setRental(false);
				}
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");	
		}
	}

	/**
	 * bookSearch - 도서 검색
	 * 1. 책 제목으로 찾기 2. 저자명으로 찾기 3. 장르로 찾기
	 * 1. 책 제목 검색 - map의 출력 방식 중 hasNext 활용 - 수업시간 예제 참고
	 * 2. 저자명 검색 - 방식 동일
	 * 3. 장르 검색 - 방식 동일
	 */
	@Override
	public void bookSearch() {
		Iterator<String> it = map.keySet().iterator(); 
		int count = 0;
		
		System.out.println("1. 책 제목으로 찾기 2. 저자명으로 찾기 3. 장르로 찾기 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1 :
			try {
				System.out.print("검색할 책 이름 : ");
				String searchName = br.readLine();
				System.out.println("코드번호\t장르\t책제목\t저자명\t재고");
				System.out.println("========================================================================");
				while(it.hasNext()) {
					String key = it.next();
					BookData db = map.get(key);
					if(db.getName().indexOf(searchName)>-1) {
						System.out.print(key + "\t");
						System.out.print(db.getGenre() + "\t");
						System.out.print(db.getName() + "\t");
						System.out.print(db.getAuthor() + "\t");
						System.out.print(db.getStock() + "\n");
						count++;
					}
				}
				if(count == 0) {
					System.out.println("검색된 책이 없습니다.");
					return;
				}
				System.out.println();
				System.out.println("총 " + count + "건의 책이 검색되었습니다.");
				System.out.println();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;
		case 2 :
			try {
				System.out.print("검색할 저자명 : ");
				String searchName = br.readLine();
				System.out.println("코드번호\t장르\t책제목\t저자명\t재고");
				System.out.println("========================================================================");
				while(it.hasNext()) {
					String key = it.next();
					BookData db = map.get(key);
					if(db.getAuthor().indexOf(searchName)>-1) {
						System.out.print(key + "\t");
						System.out.print(db.getGenre() + "\t");
						System.out.print(db.getName() + "\t");
						System.out.print(db.getAuthor() + "\t");
						System.out.print(db.getStock() + "\n");
						count++;
					}
				}
				if(count == 0) {
					System.out.println("검색된 책이 없습니다.");
					return;
				}
				System.out.println();
				System.out.println("총 " + count + "건의 책이 검색되었습니다.");
				System.out.println();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;
		case 3 :
			try {
				System.out.print("검색할 장르 : ");
				String searchName = br.readLine();
				System.out.println("코드번호\t장르\t책제목\t저자명\t재고");
				System.out.println("========================================================================");
				while(it.hasNext()) {
					String key = it.next();
					BookData db = map.get(key);
					if(db.getGenre().indexOf(searchName)>-1) {
						System.out.print(key + "\t");
						System.out.print(db.getGenre() + "\t");
						System.out.print(db.getName() + "\t");
						System.out.print(db.getAuthor() + "\t");
						System.out.print(db.getStock() + "\n");
						count++;
					}
				}
				if(count == 0) {
					System.out.println("검색된 책이 없습니다.");
					return;
				}
				System.out.println();
				System.out.println("총 " + count + "건의 책이 검색되었습니다.");
				System.out.println();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			break;
		}
	}

	/**
	 * printBookList - 도서 리스트
	 * 1. hasNext()를 활용한 도서 리스트 전체 출력
	 * 2. 대출여부 
	 * 2-1. 대출중 : isRental()이 true고 getStock()이 0
	 * 2-2. 재고존재 : isRental()이 true이나 getStock()이 1권 이상
	 * 2-3. 대출가능 : isRental()이 false
	 */
	@Override
	public void printBookList() {
		System.out.println("코드번호\t장르\t책제목\t저자명\t재고\t대출여부");
		System.out.println("================================================================================");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			BookData value = map.get(key);
			String rental ="";
			if(value.isRental()==true && value.getStock()==0) {
				rental = "대여중";
			} else if(value.isRental()==true && value.getStock()!=0){
				rental = "재고존재";
			} else if(value.isRental()==false) {
				rental = "대여가능";
			}
			System.out.print(key + "\t" + value.getGenre() + "\t" + value.getName() + "\t" +  value.getAuthor() + "\t" + value.getStock() + "\t" + rental + "\n");
		}		
	}

	/**
	 * bookInfoChange - 도서 정보 수정
	 * 1. 코드로 수정하고싶은 책 입력
	 * 2. 1. 책이름 수정 2. 저자명 수정 3. 장르 수정 4. 재고수정 - 코드번호는 수정 불가!
	 * 3. bookData의 setter 활용
	 */
	@Override
	public void bookInfoChange() {
		System.out.println("\n<책 정보 수정>");
		try {
			System.out.println("수정하기 원하는 코드번호 : ");
			String name = br.readLine();
			
			BookData db = map.get(name);
			
			System.out.println("1. 책이름 수정 2. 저자명 수정 3. 장르 수정 4. 재고수정");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 :
				System.out.println("수정할 책 이름 : ");
				db.setName(br.readLine());
				break;
			case 2 :
				System.out.println("수정할 저자명 : ");
				db.setAuthor(br.readLine());
				break;
			case 3 :
				System.out.println("수정할 장르명 : ");
				db.setGenre(br.readLine());
				break;
			case 4 :
				System.out.println("재고수정 : ");
				int stock2 = sc.nextInt();
				sc.nextLine();
				db.setStock(stock2);
				break;
			}
			System.out.println("수정완료!");
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println();
	}

	/**
	 * bookAdd - 도서 등록(manager)
	 * 1. 고유코드 입력(제약 : 중복확인) - primary key
	 * 2. 책이름, 저자, 장르, 재고 차례대로 입력 - setter 활용
	 * 3. map.put(code,db)으로 책 등록
	 */
	@Override
	public void bookAdd() {
		System.out.println("\n <책 등록>");
		
		try {
			String code;
			BookData db = new BookData();
			
			System.out.print("코드입력 : ");
			code = br.readLine();
			
			if(map.containsKey(code)) {
				System.out.println("등록된 책 입니다.\n");
				return;
			}
			System.out.print("책 이름 : ");
			db.setName(br.readLine());
			
			System.out.print("책 저자 : ");
			db.setAuthor(br.readLine());
			
			System.out.print("책 장르 : ");
			db.setGenre(br.readLine());
			
			System.out.print("재고 수 : ");
			db.setStock(sc.nextInt());
			sc.nextLine();
			
			System.out.println("코드번호\t장르\t책제목\t저자명\t재고");
			System.out.println("========================================================================");
			System.out.println(code + "\t" + db.getGenre() + "\t" + db.getName() + "\t" + db.getAuthor() + "\t" + db.getStock());
			
			System.out.print("입력하신 정보가 맞나요?(y/n) : ");
			String ans = sc.nextLine();
			if(ans.equals("y")||ans.equals("Y")) {
				map.put(code, db);
				System.out.println("책이 정상적으로 등록되었습니다.");
			} else if(ans.equals("n")||ans.equals("N")) {
				System.out.println("취소되었습니다.");
			} else {
				System.out.println("y또는n만 입력해주세요.");
				System.out.println("책 정보를 다시 입력해주세요.");
				bookAdd();
			}
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

	/**
	 * bookDelete - 도서 삭제(manager)
	 * 1. 고유코드 입력
	 * 2. 책정보 확인
	 * 3. map.remove(key)로 도서 삭제
	 */
	@Override
	public void bookDelete() {
		System.out.println("<책 삭제>");
		
		try {
			System.out.print("삭제하기 원하는 코드번호 : ");
			String key = br.readLine();
			BookData value = map.get(key);
			System.out.println("코드번호\t장르\t책제목\t저자명\t재고\t대출여부");
			System.out.println("================================================================================");
			String rental ="";
			if(value.isRental()==true && value.getStock()==0) {
				rental = "대여중";
			} else if(value.isRental()==true && value.getStock()!=0){
				rental = "재고존재";
			} else if(value.isRental()==false) {
				rental = "대여가능";
			}
			System.out.print(key + "\t" + value.getGenre() + "\t" + value.getName() + "\t" +  value.getAuthor() + "\t" + value.getStock() + "\t" + rental + "\n");
			
			System.out.print("정말 삭제하시겠습니까?(y/n) : ");
			String ans = sc.nextLine();
			if(ans.equals("y") || ans.equals("Y")) {
				map.remove(key);
				System.out.println("처리완료!");
			} else if (ans.equals("n") || ans.equals("N")) {
				System.out.println("취소되었습니다.");
			} else {
				System.out.println("잘못 누르셨습니다. 이전 메뉴로 돌아갑니다.");
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		/*
		 * 책 이름으로 삭제할 경우 문제점 : 동일한 이름의 책 이름이 존재할 경우 앞코드의 책이 삭제됨.
		 * 							  경우에 따라 뒷코드의 책을 삭제하고 싶을 수 있다.
		*/
	}

	/**
	 * open - 도서관 개방시간
	 * Calendar 활용
	 * 개방유무 : boolean 활용
	 * 월~금 08:00~23:00
	 * 토,일 휴무
	 */
	@Override
	public boolean open() {
		boolean bool = true;
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("============================");
		System.out.println("<도서관 이용시간>");
		System.out.println("월~금 08:00 ~ 22:00");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);	// 일(1)~토(7)
		int hours = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("현재 시간은 " + year + "년 " + month + "월 " 
					+ date + "일(" + dayArr[day] + ")" + hours + "시 " + minute + "분 입니다.");
		if(hours >= 11 || dayArr[day].equals("토") || dayArr[day].equals("일")) {
			System.out.println("도서관 이용시간은 월~금 08:00~23:00시 입니다.");
			System.out.println("11:00~13:00는 점심시간 입니다.");
			bool = false;
		}
		return bool;
	}

	/**
	 * close - 도서관 휴무안내
	 */
	@Override
	public void close() {
		System.out.println("도서관 개방시간에 찾아와주세요.");
	}

}
