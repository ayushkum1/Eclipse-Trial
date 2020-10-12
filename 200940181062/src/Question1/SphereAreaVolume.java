//Q1. Write a java program to find volume and surface area of a sphere using multiple classes?
//Notes :
//     Surface Area of Sphere = 4 * Math.PI * radius* radius
//     Volume of Sphere = 4/3 * Math.PI * radius * radius * radius
//     Use constructor to set radius
//     User Scanner to take user input

package Question1;

public class SphereAreaVolume {

	final double pi = 3.14;
	private double radius;
	
	public SphereAreaVolume(double radius) {
		
		this.radius = radius;
	
	}
	
	public double volume() {
		
		double sa = 0.0;
		
		if(radius == 0.0) {
		
			System.out.println("Entered radius 0");
		
		}

		else {
		
			sa = (4/3) * pi * radius * radius * radius;
		
		}
		
		return sa;
	
	}
	
	public double surfaceArea() {
		
		double sa = 0.0;
		
		if(radius == 0.0) {
		
			System.out.println("Entered radius 0");
		
		}
		
		else {
		
			sa = 4 * pi * radius * radius;
		
		}
		
		return sa;
		
	}
	
}
