package extra;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public static void main(String[] args) {
		Houses house = new Houses();
		house.start();

	}

	void start() {

		rob.setX(20);
		rob.setY(580);
		String small = "small";
		String medium = "medium";
		String large = "large";
		String red = "red";
		String green = "green";
		String blue = "blue";
		String purple = "purple";
		String teal = "teal";
		
		drawSquare(small, green);
		drawSquare(medium, red);
		drawSquare(small, teal);
		drawSquare(large, purple);
		drawSquare(medium, red);
		drawSquare(small, blue);
		drawSquare(large, purple);
		drawSquare(medium, teal);
		drawSquare(large, green);
		
		
		
	}
	

	void drawPointyRoof() {
		rob.turn(60);
		rob.move(30);
		rob.turn(60);
		rob.move(30);
		rob.turn(60);
	}
	void drawFlatRoof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
	}
	void drawSquare(String size, String color) {
		
		chooseColor(color);
		int height = 0;
		if (size.equals("small")) {
			height = 60;
		}
		if (size.equals("medium")) {
			height = 120;
		}
		if (size.equals("large")) {
			height = 250;
		}
		rob.penDown();
		rob.setSpeed(100);
		rob.move(height);
		
		rob.move(height);
		rob.turn(270);
		rob.setPenColor(0,150,0);
		rob.move(20);
		rob.turn(270);
	}
void chooseColor(String color) {

	if (color.equals("red")) {
		 rob.setPenColor(255,0,0);
	}
	if (color.equals("green")) {
		 rob.setPenColor(0,255,0);
	}
	if (color.equals("blue")) {
		 rob.setPenColor(0,0,245);
	}
	if (color.equals("purple")) {
		 rob.setPenColor(150,0,150);
	}
	if (color.equals("teal")) {
		 rob.setPenColor(0, 175, 200);
	}


}
}
