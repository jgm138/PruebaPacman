package pacman;

import java.awt.Point;

public class GhostHouseDoorType extends ConstructionBlockType {

	@Override
	public Point nextPositionForGoing(Actor anActor, Point aMovement) {
		if(anActor instanceof Ghost){
			return anActor.position().plus(aMovement);
		}else if(anActor instanceof Pacman){
			return anActor.position();
		}
		return null;
	}
}