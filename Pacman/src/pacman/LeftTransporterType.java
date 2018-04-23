package pacman;

import java.awt.Point;

public class LeftTransporterType extends ConstructionBlockType{
	Point nextPosition = new Point(10,4);
	@Override
	public Point nextPositionForGoing(Actor anActor, Point aMovement) {
		if(anActor instanceof Pacman){			
			return nextPosition;
		}else if(anActor instanceof Ghost){
			return anActor.position();
		}
		return null;		
	}

}