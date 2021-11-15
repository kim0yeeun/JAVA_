package multi_implements;

public interface RemoteControl {
	// »ó¼ö
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
