/*Program-. Create a class to compute area of square, rectangle and triangle (use method overloading concept) */

import java.util.Scanner;
class Area
{
	float side1;
	float side2;
	double area;
	
	void Calculate(float s)
	{
		area = s*s;
	}
	
	void Calculate(float s1, float s2)
	{
		area = s1*s2;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect the option to calculate area::\n");
		System.out.println("\t 1.Square  \n\t 2.Rectangle  \n\t 3.Triangle");
		System.out.print("\n Enter you choice:: ");
		int choice = sc.nextInt();
		System.out.print("\n");
		
		switch (choice)
		{
			case 1: {
						Area sq = new Area();
						System.out.println("Enter the dimension of square::");
						System.out.print("Enter side: ");
						sq.side1 = sc.nextFloat();
						sq.side2 = sq.side1;
						sq.Calculate(sq.side1);
						System.out.println("\n The area of square is:: " + sq.area + " units");
					}
					break;
			case 2: {
						Area rec = new Area();
						System.out.println("Enter the dimension of rectangle::");
						System.out.print("Enter Length: ");
						rec.side1 = sc.nextFloat();
						System.out.print("Enter Breadth: ");
						rec.side2 = sc.nextFloat();
						rec.Calculate(rec.side1, rec.side2);
						System.out.println("\n The area of rectangle is:: " + rec.area + " units");
					}
					break;
			case 3: {
						Area tri = new Area();
						System.out.println("Enter the dimension of triangle::");
						System.out.print("Enter Height: ");
						tri.side1 = sc.nextFloat();
						System.out.print("Enter Base: ");
						tri.side2 = sc.nextFloat();
						tri.Calculate(tri.side1, tri.side2);
						tri.area = 0.5*(tri.area);
						System.out.println("\n The area of triangle is:: " + tri.area + " units");
					}
					break;
			default: {
						System.out.print("Wrong choice!! ");	
					}	
					break;
		}
	}
}
