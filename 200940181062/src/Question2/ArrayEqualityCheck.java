//Q2. Write a java program to check the equality of two integer arrays.
//Notes :
//     Create two integer array by taking input from user (using Scanner)
//     Check if both array contains same values

package Question2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualityCheck {

	public static void main(String[] args) {
		
		int len1, len2;
		
		boolean matched = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the first Array : ");
		
		len1 = scan.nextInt();
		
		System.out.println("Enter the length of the second Array : ");
		
		len2 = scan.nextInt();
		
		//checking if lengths of the arrays are same or not, if not same stop execution
		//else proceed with checking if the elements match or not
		if(len1 != len2) {
			
			System.out.println("Arrays are not equal");
			
			System.exit(0);
		
		}
		
		else {

			//instead of using len1 and len2 we can use one variable as both will be same since we are in else part
			
			System.out.println("Enter the elements of the first Array : ");
			
			int[] arr1 = new int[len1];
			
			//defined a function which inputs all the elements
			//len1 will be the length of the array
			//arr1 is the initialized array
			//scan is Scanner object which will be used to  scan the elements from user
			arr1 = enterElements(len1, arr1, scan); 
			
			
			System.out.println("Enter the elements of the second Array : ");
			
			int[] arr2 = new int[len1];
			
			//defined a function which inputs all the elements
			//len2 will be the length of the array
			//arr2 is the initialized array
			//scan is Scanner object which will be used to  scan the elements from user
			arr2 = enterElements(len2, arr2, scan);
			
			//sort both the arrays, so we can check if the elements present at same index 
			//are of the same value or not
			
			// example : [1,2,3] and [3,2,1] will be sorted to [1,2,3]
			// also : [1,2,3] and [6,5,4] will be sorted to [1,2,3] and [4,5,6]
			
			Arrays.sort(arr1);
			
			Arrays.sort(arr2);
			
			for(int i = 0; i < len1; i++) {
				
				if(arr1[i]==arr2[i]) {
				
					matched = true;
				
				}
				
				else {
				
					matched = false;
				
				}
			}
			
			if(matched == true) {
			
				System.out.println("Arrays are equal");
			
			}
			else {
			
				System.out.println("Arrays do not match");
			
			}
		
			System.exit(0);
		
		}
		
		scan.close();
	
	}

	public static int[] enterElements(int len, int[] array, Scanner scan) {
		
		for(int i = 0; i < len; i++) {
	
			array[i] = scan.nextInt();
		
		}
		
		return array;
	
	}
	
}
