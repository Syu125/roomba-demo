package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		
		driveDirect(800,800);
		sleep(1500);
		driveDirect(0,180);
		sleep(1450);
		driveDirect(800,800);
		sleep(1400);
		driveDirect(180,0);
		sleep(1350);
		driveDirect(800,800);
		sleep(1500);
		driveDirect(0,180);
		sleep(1400);
		driveDirect(800,800);
		sleep(1000);
		driveDirect(180,0);
		sleep(1400);
		driveDirect(800,800);
		
		
	
	}

	public void loop() {
		
	}
}
