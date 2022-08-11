package observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockTimer extends Observable{
	private int hour;
	private int minute;
	private int second;
	
	public ClockTimer() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	void tick() {
		second++;
		
		if (second == 60) {
			second = 0;
			minute++;
		}
		
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		
		setChanged();
		notifyObservers(new int[] {hour, minute, second});
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	
}
