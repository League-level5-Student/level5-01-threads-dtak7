package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blu = new Robot(300, 300);
		Robot ylw = new Robot(360, 350);
		Robot blk = new Robot(420, 300);
		Robot grn = new Robot(480,350);
		Robot red = new Robot(540,300);
		Thread r1 = new Thread(() -> {
			blu.hide();
			blu.penDown();
			blu.setPenColor(Color.blue);
			blu.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				blu.turn(1);
				blu.move(10);
			}
			blu.setX(-10);
		});
		Thread r2 = new Thread(() -> {
			blk.hide();
			blk.penDown();
			blk.setPenColor(Color.black);
			blk.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				blk.turn(1);
				blk.move(10);
			}
			blk.setX(-10);
		});
		Thread r3 = new Thread (()->{ylw.hide();
		ylw.penDown();
		ylw.setPenColor(Color.yellow);
		ylw.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			ylw.turn(1);
			ylw.move(10);
		}
		ylw.setX(-10);}); 
		Thread r4 = new Thread(()->{grn.hide();
		grn.penDown();
		grn.setPenColor(Color.green);
		grn.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			grn.turn(1);
			grn.move(10);
		}
		grn.setX(-10);});
		Thread r5 = new Thread(()->{red.hide();
		red.penDown();
		red.setPenColor(Color.red);
		red.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			red.turn(1);
			red.move(10);
		}
		red.setX(-10);}); 
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}
