package example.binary;

import java.util.ArrayList;

public class BinaryGap {

	class Solution
	{
		public static int solveThis(int N) {
		String binnaryRepresentation =Integer.toBinaryString(N);
		System.out.println(N+" Binnary= "+binnaryRepresentation);
		
		int longestGap =0;
		ArrayList<Integer> onesList= new ArrayList<Integer>();   // generic arraylist 
		
		for( int i=0; i<binnaryRepresentation.length();i++) {
			if(binnaryRepresentation.charAt(i)=='0') 
				continue;
			
			onesList.add(i);//add the position of index 1 
		}
		
		for(int i=0; i<onesList.size()-1; i++) {
			int indicesDifference= onesList.get(i+1) - onesList.get(i) -1;
			longestGap=Math.max(longestGap, indicesDifference);
		}
		
		return longestGap;
		}
	}
	
	
	
	public static void main(String[] args) {
		int count1 = Solution.solveThis(1041);
		System.out.println("Max 0 count : "+count1);
		
		int count2 = Solution.solveThis(32);
		System.out.println("Max 0 count : "+count2);
	}

}
