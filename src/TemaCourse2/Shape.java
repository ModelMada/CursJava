package TemaCourse2;

public class Shape {
//	private int length;
//	private int width;
//	private double radius;
	
	public Shape (int length) {
		System.out.println("The area of square is: "+ calculateSquareArea(length));
	}
	
	public Shape (int length, int width) {
		System.out.println("The area of the rectangle is: " + calculateRectagleArea(length, width));
	}
	
	public Shape (double radius) {
		System.out.println("The area of the circle is: "+ radius*radius*Math.PI);
	}
	
	public int calculateSquareArea(int length) {
		return length * length;
	}
	
	public int calculateRectagleArea(int length, int width) {
		return length*width;
	}
}
