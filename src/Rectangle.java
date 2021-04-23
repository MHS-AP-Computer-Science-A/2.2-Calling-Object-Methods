
public class Rectangle {
	//Instance Variables
	//This is what all Rectangle Objects will have
	int length;
	int width;
	
	//Methods
	//This is what all Rectangle Objects will do
	
	//Constructor to initialize instance variables
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}
	
	//Overloaded Constructor method
	public Rectangle (int side) {
	  length = side;
	  width = side;
	}
	
	//Computes and returns the area
	public int getArea() {
	  return length * width;
	}
		
	//Displays the area
	public void printArea() {
	  System.out.println("Area = " + length * width);
	}


}
