package example.rotationOfArray;

import java.util.Arrays;
/*Pass source array and the rotation Index as K
 * step 1 : declare the targetArray as per the length of source array
 * step 2 : iterate through the source array from 0 to length
 * step 3 : determine the rotatedIndex as per the formula
 * 				rotatedIndex =(i+k) % sourceArray.length;
 * 			SA										TA
 * 			i=0		rotatedIndex = ( 0 + 3 ) % 5; = 3
 * 			i=1		rotatedIndex = ( 1 + 3 ) % 5; = 4
 * 			i=2		rotatedIndex = ( 2 + 3 ) % 5; = 0
 * 			i=3		rotatedIndex = ( 3 + 3 ) % 5; = 1
 * 			i=4		rotatedIndex = ( 4 + 3 ) % 5; = 2
 * 
 */

public class RotationOfArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int sourceArray[]=new int[] {1,2,3,4,5};
		
		System.out.println("Origanal Array: "+Arrays.toString(sourceArray));//This is sort cut to print a Array
		
//		//int arr[]={1,2,3,4,5} its also work/ possible way to write a array
//		int targetArray[] = new int[sourceArray.length]; //only way to give size
//		int k=3;
//		for(int i=0; i<sourceArray.length;i++) {
//			
//			int rotatedIndex =(i+k)%sourceArray.length;
//			targetArray[rotatedIndex]=sourceArray[i];
//			
//		}
		int k=3;
		System.out.println("\nRotated the origanal array "+k+" times\n");
		int targetArray[]=RotationTest.solution(sourceArray, k);
		System.out.println("Rotated Array: "+Arrays.toString(targetArray));
		
	}
}
		
class RotationTest
{
			public static int[] solution(int sourceArray[], int k) //int[] is use to return the array
			{
				int targetArray[] = new int[sourceArray.length]; //only way to give size
				
				for(int i=0; i<sourceArray.length;i++) 
				{
					int rotatedIndex =(i+k)%sourceArray.length;
					targetArray[rotatedIndex]=sourceArray[i];
				}
				return targetArray;
			}
		
}


