package pacman;

public class WallType extends ConstructionBlockType{	
	
	@Override
	public Point nextPositionForGoing(Actor anActor, Point aMovement) {
		if(anActor instanceof Actor){
			return anActor.position();
		}
		return null;
	}

}