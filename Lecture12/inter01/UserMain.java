package Java0323.Lecture12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumeUp();
		sam.volumeDown();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		LGTV lg = new LGTV();
//		lg.powerOn();
		lg.turnOn();
//		lg.volumeUp();
		lg.soundUp();
//		lg.volumeDown();
		lg.soundDown();
		lg.channelDown();
		lg.channelUp();
//		lg.powerOff();
		lg.turnOff();

	}

}
