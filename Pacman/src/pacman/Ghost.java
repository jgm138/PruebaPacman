package pacman;

import java.awt.Point;

public class Ghost extends Actor {

		Point myPosition = new Point(0, 0);
		@Override
		public Point position() {
			//throw new RuntimeException ("Implement!");
			return myPosition;
		}
		
		public void setPosition(Point newPosition){
			myPosition = newPosition;
		}

	}

