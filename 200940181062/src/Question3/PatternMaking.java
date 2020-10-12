//Q3. Write a java program to print the following patterns  -
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6 
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1

package Question3;

import java.util.Scanner;

public class PatternMaking {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the length of the array : ");
		
		int length = scan.nextInt();
		
		int[] patternArray = new int[length];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i < patternArray.length; i++) {
		
			patternArray[i] = scan.nextInt();
		
		}
		
		//check for length, reduce the length after every successful loop cycle
		while(length > 0) {
		
			for(int i = 0; i < length; i++) {
			
				System.out.print(patternArray[i] + " ");
			
			}
			
			System.out.println();//after printing one array the next array should be in next line, so a blank line
			
			length--; //reduce the size by 1 and then use this to print array upto that length
		}
		
		scan.close();
	}
	
}
