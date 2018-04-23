package pacman;

import java.awt.Point;

public class SpaceType extends ConstructionBlockType {
	@Override
	public Point nextPositionForGoing(Actor anActor, Point aMovement) {
		if(anActor instanceof Ghost){
			return aMovement;
		}else if(anActor instanceof Pacman){			
			int x = aMovement.x();
			int y = aMovement.y();
			return new Point(x*2, y*2);
		}
		return null;
	}

}