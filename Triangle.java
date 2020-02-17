
public class Triangle {
// declare three Point private variable;
	public Point A, B, C;
	//Default constructor 
	public Triangle()
	{
		this.A=new Point();
		this.B=new Point();
		this.C= new Point();
	}
	// Constructor with three parameters from Point class
	public Triangle (Point x, Point y, Point z)
	{
		this.A=x;
		this.B=y;
		this.C=z;
	}
	// Accessor and Mutator for Triangle
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	// Method toString for Triangle
	public String toString(){
		String st="Triangle with points:";
		return st+" {"+"("+this.A+")"+","+"("+this.B+")"+"("+this.C+")"+"}";
		
	}
	// Method perimeter to calculater of the triangle
	public double Perimeter (){
		double d= this.A.Distance(this.B)+this.B.Distance(this.C)+this.C.Distance(A);
		return d;
	}
	// Method equals to check if the two trangles are same are not
	public boolean equals(Triangle N)
	{ 
			//if the three points of two traingles are same this will return true value else return false
		if(this.A==N.A&&this.B==N.B&&this.C==N.C)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
