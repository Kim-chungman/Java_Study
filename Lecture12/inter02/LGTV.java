package Java0323.Lecture12.inter02;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LGTV 구매완료...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV전원 OFF");
		
	}

	@Override
	public void channelUp() {
		System.out.println("Channel Up...");
		
	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down...");
		
	}

	@Override
	public void mute() {
		System.out.println("MUTE");
		
	}

}
