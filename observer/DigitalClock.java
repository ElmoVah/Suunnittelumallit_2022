package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DigitalClock implements Observer{
	private ClockTimer clockTimer;
	
	public DigitalClock(ClockTimer clockTimer) {
		this.clockTimer = clockTimer;
		this.clockTimer.addObserver(this);
	}

	private void draw(Object arg) {
		int[] times = ((int[])arg);
		String hour = times[0] < 10 ? "0" + times[0] : "" + times[0];
		String minute = times[1] < 10 ? "0" + times[1] : "" + times[1];
		String second = times[2] < 10 ? "0" + times[2] : "" + times[2];
		System.out.println(hour + ":" + minute + ":" + second);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o == clockTimer) {
			draw(arg);
		}	
	}

}
