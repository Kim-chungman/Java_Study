package kr.ac.kopo.lecture1;
import java.util.Random;

public class LottoUtil {

	
		// TODO Auto-generated method stub

		// 내용부

		// 멤버변수
		int lottoNum;
				
		// 메소드
		/**
		 * 오늘의 로또확률을 출력해주는 메소드
		 */
		
		public void todayLotto() {
					
			Random r = new Random();
			System.out.println("오늘의 로또 확률 : " + r.nextInt(101) + "%입니다.");
			}	
				
		/**
		 * return은 추출된 로또번호
		 */
		public int getNum() {
			java.util.Random r = new java.util.Random();
			System.out.println("오늘의 로또 확률 : " + r.nextInt(101) + "%입니다.");
			return lottoNum;
			}
		
		
	}


