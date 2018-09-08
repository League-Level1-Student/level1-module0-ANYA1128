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

		drawSquare(small);
		drawSquare(medium);
		drawSquare(small);
		drawSquare(large);
		drawSquare(medium);
		drawSquare(small);
		drawSquare(large);
		drawSquare(medium);
		drawSquare(large);

	}

	void drawSquare(String size) {
		int height = 0;
		if (size.equals("small")) {
			height = 60;
		}
		rob.penDown();
		rob.setSpeed(100);
		rob.move(height);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(height);
		rob.turn(270);
		rob.move(20);
		rob.turn(270);
	}

}
