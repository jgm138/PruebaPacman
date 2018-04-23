package pacman;


import java.awt.Point;

import junit.framework.TestCase;

public class TestPacman extends TestCase {

	protected Actor Pacman;
	protected Actor blueGhost;
	protected ConstructionBlockType WallType;
	protected ConstructionBlockType SpaceType;
	protected ConstructionBlockType LeftTransporterType;
	protected ConstructionBlockType GhostHouseDoorType;
	
	protected Point left;
	protected Point right;
	protected Point up;
	protected Point down;
	
	//Se deben instanciar las clases, para acceder a los metodos que implementa cada una 
	
	
	public void setUp() {
		left = new Point(-1,0);
		right = new Point (1,0);
		up = new Point(0,1);
		down = new Point(0,-1);	
		
		Pacman = new Pacman();
		WallType = new WallType();
		blueGhost = new Ghost();
		SpaceType = new SpaceType();
		LeftTransporterType = new LeftTransporterType();
		GhostHouseDoorType=new GhostHouseDoorType();
		
	}
	
//Usando assertEquals me permite realizar la comparacion entre dos objetos.  En este caso se emplea para evaluar las posiciones en el juego de los objetos
	public void testGhostCanNotGoIntoAWall(){
		assertEquals(
				blueGhost.position(),
				WallType.nextPositionForGoing(blueGhost,left));
		
		assertEquals(
				blueGhost.position(),
				WallType.nextPositionForGoing(blueGhost,right));
		
		assertEquals(
				blueGhost.position(),
				WallType.nextPositionForGoing(blueGhost,up));
		
		assertEquals(
				blueGhost.position(),
				WallType.nextPositionForGoing(blueGhost,down));
				
	}

	public void testPacmanCanNotGoIntoAWall(){
		assertEquals(
				Pacman.position(),
				WallType.nextPositionForGoing(Pacman,left));

		assertEquals(
				Pacman.position(),
				WallType.nextPositionForGoing(Pacman,right));
		
		assertEquals(
				Pacman.position(),
				WallType.nextPositionForGoing(Pacman,up));
		
		assertEquals(
				Pacman.position(),
				WallType.nextPositionForGoing(Pacman,down));
	}

	public void testPacmanMovesIntoSpacesVeryFast(){
		assertEquals(
				Pacman.position().plus(new Point(-2,0)),
				SpaceType.nextPositionForGoing(Pacman,left));

		assertEquals(
				Pacman.position().plus(new Point(2,0)),
				SpaceType.nextPositionForGoing(Pacman,right));
		
		assertEquals(
				Pacman.position().plus(new Point(0,2)),
				SpaceType.nextPositionForGoing(Pacman,up));
		
		assertEquals(
				Pacman.position().plus(new Point(0,-2)),
				SpaceType.nextPositionForGoing(Pacman,down));

	}

	public void testGhostMovesIntoSpacesSlowly(){
		assertEquals(
				blueGhost.position().plus(new Point(-1,0)),
				SpaceType.nextPositionForGoing(blueGhost,left));

		assertEquals(
				blueGhost.position().plus(new Point(1,0)),
				SpaceType.nextPositionForGoing(blueGhost,right));
		
		assertEquals(
				blueGhost.position().plus(new Point(0,1)),
				SpaceType.nextPositionForGoing(blueGhost,up));
		
		assertEquals(
				blueGhost.position().plus(new Point(0,-1)),
				SpaceType.nextPositionForGoing(blueGhost,down));
	}

	public void testGhostCanEnterHisHouse(){
		assertEquals(
				blueGhost.position().plus(new Point(-1,0)),
				GhostHouseDoorType.nextPositionForGoing(blueGhost,left));

		assertEquals(
				blueGhost.position().plus(new Point(1,0)),
				GhostHouseDoorType.nextPositionForGoing(blueGhost,right));
		
		assertEquals(
				blueGhost.position().plus(new Point(0,1)),
				GhostHouseDoorType.nextPositionForGoing(blueGhost,up));
		
		assertEquals(
				blueGhost.position().plus(new Point(0,-1)),
				GhostHouseDoorType.nextPositionForGoing(blueGhost,down));
	}

	public void testPacmanCanNotEnterGhostHouse(){
		assertEquals(
				Pacman.position(),
				GhostHouseDoorType.nextPositionForGoing(Pacman,left));

		assertEquals(
				Pacman.position(),
				GhostHouseDoorType.nextPositionForGoing(Pacman,right));
		
		assertEquals(
				Pacman.position(),
				GhostHouseDoorType.nextPositionForGoing(Pacman,up));
		
		assertEquals(
				Pacman.position(),
				GhostHouseDoorType.nextPositionForGoing(Pacman,down));
	}

	public void testTransporterMovesPacmanToNewPosition(){
		assertEquals(
				new Point(10,4),
				LeftTransporterType.nextPositionForGoing(Pacman,left));

		assertEquals(
				new Point(10,4),
				LeftTransporterType.nextPositionForGoing(Pacman,right));
	}

	public void testGhostCanNotGoIntoTransporter(){
		assertEquals(
				blueGhost.position(),
				LeftTransporterType.nextPositionForGoing(blueGhost,left));

		assertEquals(
				blueGhost.position(),
				LeftTransporterType.nextPositionForGoing(blueGhost,right));
	}

}