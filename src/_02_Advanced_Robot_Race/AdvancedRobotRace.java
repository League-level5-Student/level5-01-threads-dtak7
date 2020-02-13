package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	static boolean isDone = false;
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot(150 + i * 150, 700);
		}
		
		Thread r1 = new Thread(() -> {
			while (!isDone) {
				Random rand = new Random();
				for (int i = 0; i < 5; i++) {
					robots[0].move(rand.nextInt(150000 + 1));
					int y = robots[0].getY();
					if (y <= 0) {
						System.out.println("yay41");
						isDone=true;
					}
				}
			}
		});
		Thread r2 = new Thread(() -> {
			while (!isDone) {
				Random rand = new Random();
				for (int i = 0; i < 5; i++) {
					robots[1].move(rand.nextInt(150000 + 1));
					int y = robots[1].getY();
					if (y <= 0) {
						System.out.println("yay42");
						isDone=true;
					}
				}
			}
		});
		Thread r3 = new Thread(() -> {
			while (!isDone) {
				Random rand = new Random();
				for (int i = 0; i < 5; i++) {
					robots[2].move(rand.nextInt(150000 + 1));
					int y = robots[2].getY();
					if (y <= 0) {
						System.out.println("yay43");
						isDone=true;
					}
				}
			}
		});
		Thread r4 = new Thread(() -> {
			while (!isDone) {
				Random rand = new Random();
				for (int i = 0; i < 5; i++) {
					robots[3].move(rand.nextInt(150000 + 1));
					int y = robots[3].getY();
					if (y <= 0) {
						System.out.println("yay44");
						isDone=true;
					}
				}
			}
		});
		Thread r5 = new Thread(() -> {
			
			while (!isDone) {
				Random rand = new Random();
				for (int i = 0; i < 5; i++) {
					robots[4].move(rand.nextInt(1500 + 1));
					int y = robots[4].getY();
					if (y <= 0) {
						System.out.println("yay45");
						isDone=true;
					}
				}
			}
		});
		
		r2.start();
		r1.start();
		r3.start();
		r4.start();
		r5.start();
	}
}
