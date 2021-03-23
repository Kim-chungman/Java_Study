package Java0323.Lecture12.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.powerOff();
		tv.copyright();
		
		System.out.println("=========================");
		
		/*
		TV tv = new LGTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		*/
	}

}
