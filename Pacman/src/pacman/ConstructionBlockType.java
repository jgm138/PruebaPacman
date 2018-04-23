package pacman;

import java.awt.Point;

public abstract class ConstructionBlockType {
	
	public abstract Point nextPositionForGoing (Actor anActor,Point aMovement);
}
