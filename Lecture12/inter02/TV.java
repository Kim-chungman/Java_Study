package Java0323.Lecture12.inter02;

public interface TV {

	/*public static final*/ int MAX_VOLUME_SIZE = 50;
	/*public static final*/ int MIN_VOLUME_SIZE = 0;
	
	/*public abstract*/ void powerOn();
	/*public abstract*/ void powerOff();
	/*public abstract*/ void channelUp();
	/*public abstract*/ void channelDown();
	/*public abstract*/ void soundUp();
	/*public abstract*/ void soundDown();
	/*public abstract*/ void mute();
	
	default void copyright() {
		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	}
	
}
