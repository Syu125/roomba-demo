package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(800,800);
		sleep(2000);
		driveDirect(0,190);
		sleep(1600);
		driveDirect(1000,1000);
		sleep(2300);
		driveDirect(190,0);
		sleep(1700);
		driveDirect(800,800);
		
	}

	public void loop() {
	
	}
}
