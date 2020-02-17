
public class TesterTriangle {
//main
	public static void main(String []args)
	{
		// Declare object for class Point and triangle;
		Point one;		
		//Default constructor of Point
		one=new Point();
		//Display default constructor
		System.out.println("Defalut Point One:\t"+one.toString());
		//set value for point one
		one.setX(4.3);
		one.setY(3.89);
		//Display new Point one;
		System.out.println("One Point with new values:\t"+one.toString());
		//Point construct which have two parameters
		Point two=new Point(6.1,7.5);
		// Display point two
		System.out.println(two.toString());
		//Assign new Point three 
		Point three=new Point(2.8,3.3);
		//Display point three
		System.out.println(three.toString());
		//Assign new Point four
		Point Four=new Point(5.5,7.1);
		//Display Point four
		System.out.println(Four.toString());
		//Check distance form point two to three and display
		System.out.println("The distance between points are:" +two.Distance(three));
		// check if the two points are same of not
		if(two.equals(Four)==true)		{
			System.out.println("The points are same");
		}
		else		{
			System.out.println("The points are not same");
		}
		//New points for triangle two
		Point Five=new Point(4,3.5);
		Point Six=new Point(6.5, 4.3);
		Point Seven= new Point (3.4,5.6);
		
		
		
		//Declare Triangle nOne;
		Triangle nOne;
		nOne=new Triangle();
		//display default Triangle
		System.out.println("Defalut Triangle:\t"+nOne.toString());
		
		//set points for Triangle nOne;
		nOne.setA(two);
		nOne.setB(three);
		nOne.setC(Four);
		//display triangle nOne using toString method;
		System.out.println(nOne.toString());
		
		//assign new Triangle with three parameters
		Triangle nTwo;
		nTwo=new Triangle(Five,Six,Seven);
		//display triangle nTwo using toString method;
		System.out.println(nTwo.toString());
		 
		
		//Perimeter of Triangle nOne;
		System.out.println("The perimeter of Traingle One are:"+ nOne.Perimeter());
		System.out.println("The perimeter of Traingle Two are:"+ nTwo.Perimeter());
		
		//compare triangle one and two using equals method from Triangle
		if(nOne.equals(nTwo)==true){
			System.out.println("The Traingles are Same:");
		}
		else		{
			System.out.println("The Traingles are not Same:");
		}
		
	}
}
