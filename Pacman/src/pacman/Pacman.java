package pacman;

import java.awt.Point;

public class Pacman extends Actor {
	
	Point myPosition = new Point(0, 0);
	@Override
	public Point position() {
		return myPosition;
	}
	
	public void setPosition(Point newPosition){
		myPosition = newPosition;
	}
}

