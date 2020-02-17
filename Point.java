import java.lang.Math;
public class Point {
// Declare two private  variable for private class
	private double x, y;
	// default constructor with value 0;
	public Point(){
		this.x=0;
		this.y=0;
		
	}
	// constructor with two parameters
	public Point(double a, double b)
	{
		this.x=a;
		this.y=b;
	}
	// Accessor for private variables x, y
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	//Muator for private variables x,y
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	// to string method 

	public String toString() {
		String st="Points are:";
		return st + "("+ this.x +"  ,"  +this.y+ ")";
	}
	// method equals that accept point compare points and return boolean value
	public boolean equals(Point a)
	{ 	// check and  compare two points using if statement
		if (this.x==a.x && this.y==a.y)// if the conditions are true return true
		{
			return true;
		}
		else// if the conditions are fail return false.
		{
			return false;
		}
		
	}
	// create method distance to  calculate distance between two points.
	public double Distance(Point P)
	{
		//declare double variable d and calculate the distance  between two points.
		double d=Math.sqrt(Math.pow((this.x-P.x),2)+Math.pow((this.y-P.y),2));
		//return value of d
		return d;
	}
	
}
