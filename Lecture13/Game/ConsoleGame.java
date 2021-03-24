package Game;

import java.util.Random;
import java.util.Scanner;

public abstract class ConsoleGame implements Game{

	protected static int win;
	protected static int lose;
	protected static int totalGame;
	Scanner sc = new Scanner(System.in);
	
	ConsoleGame(){
		
	}
	
	ConsoleGame(int win, int lose, int totalGame){
		this.win = win;
		this.lose = lose;
		this.totalGame = totalGame;
	}
	
	public int getWin() {
		return win;
	}
	
	public int getLose() {
		return lose;
	}
	
	public int getTotalGame(int totalGame) {
		this.totalGame = totalGame;
		return totalGame;
	}
	
	public int setWin() {
		return this.win++;
	}
	
	public int setLose() {
		return this.lose++;
	}
	
	public int setTotalGame() {
		return this.totalGame++;
	}
	
	public void select() {
		ConsoleGame game = null;
		System.out.println("게임을 선택해주세요.");
		System.out.print("A. 가위바위보 \n" + "B. 주사위 값 맞추기 \n" + "C. 종료 \n");
		String gameNo = sc.nextLine();
		
		switch(gameNo) {
			case "A" :
			case "a" :
				game = new ScissorsRockPaper(win, lose, totalGame);
				game.startGame(totalGame++);
				select();
				break;
			case "B" :
			case "b" :
				game = new Dice();
				game.startGame(totalGame++);
				select();
				break;
			case "C" :
			case "c" :
				game = new ScissorsRockPaper(win, lose, totalGame);
				game.gameResult();
				break;
			default : 
				System.out.println("다시 입력하세요.");
				select();
				break;
		}
	}
	
	public int random(int num) {
		Random r = new Random();
		int random = r.nextInt(num)+1;
		return random;
	}
	
	public void gameResult() {
		ConsoleGame game = new ScissorsRockPaper(win, lose, totalGame);
		System.out.println("당신의 게임전적은 " + totalGame + "게임 " + win + "승 " + lose + "패입니다.");
	}
	
}
