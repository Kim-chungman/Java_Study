package Java0323.Lecture12.inter02;

public class SamsungTV implements TV{

	private String modeName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
		modeName = "삼성TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
		muteToggle = false;
		currentVolumeSize = volumeSize; 
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다.");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다.");
		
	}

	@Override
	public void channelUp() {
		channelNo++;
		if(channelNo == 100) {
			channelNo = 1;
		}
		System.out.println("채널을 올립니다.");
		info();
	}

	@Override
	public void channelDown() {
		channelNo--;
		if(channelNo == 0) {
			channelNo = 100;
		}
		System.out.println("채널을 내립니다.");
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("볼륨을 올립니다.");
		if(muteToggle) {
			volumeSize = currentVolumeSize;
			muteToggle = false;
		}
		if(volumeSize < TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨을 내립니다.");
		if(volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		info();
	}

	@Override
	public void mute() {
		if(muteToggle==true) {					// muteToggle이라는 문자는 참인데 muteToggle은 거짓 값을 가지고있다.
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		} else {
			System.out.println("음소거 중...");
			volumeSize = TV.MIN_VOLUME_SIZE;
		}
		muteToggle = !muteToggle;
//		System.out.println(muteToggle);
		
//		volumeSize = TV.MIN_VOLUME_SIZE;
		
		info();
	}
	
	private void info() {			// 내부정보로만 돌리는 핵심기술일때 private 설정가능
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
