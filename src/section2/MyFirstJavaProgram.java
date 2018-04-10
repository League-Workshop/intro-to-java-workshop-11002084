package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Steve=new Robot();
		Steve.moveTo(100,500);
		Steve.setRandomPenColor();
		Steve.setPenWidth(5);
		Steve.penDown();
		Steve.setSpeed(200);
		for(int i=0; i<100; i++) {
		Steve.move(500);
		Steve.turn(90);
		}
		
	
		
		
	}
}
