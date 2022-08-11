package observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int speed = 1;
		int ticks = 100;
		
		ClockTimer clockTimer = new ClockTimer();
		DigitalClock digitalClock = new DigitalClock(clockTimer);

		int i = 0;
		while(i < ticks) {
			clockTimer.tick();
			Thread.sleep(1000 / speed);
		}
	}

}
