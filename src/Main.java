
public class Main {

	public static void main(String[] args) {
		//Find the average area using a 
		//method that returns a value
		Rectangle r = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(5, 6);
		Rectangle r3 = new Rectangle(7, 8);

		int area1 = r.getArea();
		int area2 = r2.getArea();
		int area3 = r3.getArea();

		int avg = (area1 + area2  + area3) / 3;
		
		System.out.println("Average area = " + avg);
		
		//Demonstrate using an overloaded method
		Rectangle r4 = new Rectangle(3, 4);
		Rectangle r5 = new Rectangle(5);
		
		System.out.println("2 param constructor area = " + r4.getArea());
		System.out.println("1 param constructor area = " + r5.getArea());
		

	}

}
