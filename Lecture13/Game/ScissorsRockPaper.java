package Game;

public class ScissorsRockPaper extends ConsoleGame implements Game {

	private final static int SCISSOR = 1;
	private final static int ROCK = 2;
	private final static int PAPER = 3;
	private int me;
	private int you;
	private static int draw;
	private static int totalGame;
	
	ScissorsRockPaper(){
		
	}
	
	ScissorsRockPaper(int win, int lose, int totalGame){
		this.win = win;
		this.lose = lose;
		this.totalGame = totalGame;
	}
	
	@Override
	public int startGame(int you) {
		me = super.random(3);
		System.out.println("1.가위 2.바위 3.보 중 하나를 선택해주세요.");
		you = sc.nextInt();
		sc.nextLine();
		this.you = you;
		if(you > 3 || you < 1) {
			System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			startGame(you);
		}
		
		if(me > you) {
			if(me==3 && you==1) {
				System.out.println("You win");
				win++;
				return 1;
			} else {
				System.out.println("You lose");
				lose++;
				return 0;
			}
		} else if(me == you) {
			System.out.println("비겼습니다.");
			draw++;
			return 0;
		} else {
			if(me==1 && you==3) {
				System.out.println("You lose");
				lose++;
				return 0;
			} else {
				System.out.println("You win");
				win++;
				return 1;
			}
		}
		
	}
	
	public int getDraw() {
		return draw;
	}
	
	@Override
	public void gameResult() {
		System.out.println("당신의 게임전적은 " + totalGame + "게임 " + win + "승 " + draw + "무 " + lose + "패입니다.");
	}

}

