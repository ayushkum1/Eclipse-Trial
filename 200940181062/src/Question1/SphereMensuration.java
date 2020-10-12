package Question1;

import java.util.Scanner;

public class SphereMensuration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the Sphere : ");
		
		double radius = scan.nextDouble();
		
		SphereAreaVolume sphereAreaVolume = new SphereAreaVolume(radius);
		
		System.out.println("The Volume of the Sphere is : " + sphereAreaVolume.volume());
		
		System.out.println("The Surface Area of the of the Sphere is: " + sphereAreaVolume.surfaceArea());
		
		scan.close();
	}


}
