package entities;

public class rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
		
	public double diag() {
		return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
		}
	}
