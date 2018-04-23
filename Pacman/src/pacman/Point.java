package pacman;

public class Point {

	private int x;
	private int y;
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean equals (Object anObject){
		if(anObject==null) return false;
		return (anObject instanceof Point) && equalsPoint((Point) anObject);
	}
	
	public boolean equalsPoint (Point aPoint) {
		return x==aPoint.x() && y==aPoint.y();
	}
	
	public int x() {
		return x;
	}
	
	public int y(){
		return y;
	}
	
	public Point plus(Point aPoint){
		return new Point (x+aPoint.x(),y+aPoint.y());
	}
}