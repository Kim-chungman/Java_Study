package Game;

public class Dice extends ConsoleGame implements Game {

	private int me;
	private int you;
	
	@Override
	public int startGame(int you) {
		
		me = super.random(6);
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요.(1~6값 중 하나) : ");
		you = sc.nextInt();
		sc.nextLine();
		if(you > 6 || you < 1) {
			System.out.println("다시 입력해주세요.");
			startGame(you);
			return 0;
		} else if(me != you) {
			System.out.println("You lose");
			System.out.println("정답은 " + me + "입니다.");
			lose++;
			return 0;
		} else {
			System.out.println("You win");
			win++;
			return 1;
		}
		
	}

}