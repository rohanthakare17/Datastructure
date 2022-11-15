package example.binary;

import java.util.ArrayList;

public class BinaryGap2 {

	class Solution
	{
		public static int count(int N) {
		String br=Integer.toBinaryString(N);
		System.out.println("Number : "+N+" Binary: "+br);
		int logestGap=0;
		
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		for(int i=0;i<br.length();i++)
		{
			if(br.charAt(i)=='0')
				continue;
			onesList.add(i);
		}
		
		for(int i=0; i<onesList.size()-1; i++) 
		{
			int diff=onesList.get(i+1)-onesList.get(i)-1;
			logestGap=Math.max(logestGap, diff);
			
		}
		return logestGap;
		}
	}
	
	public static void main(String[] args) {
		
			int cnt1=Solution.count(1041);
			System.out.println("Binary Gap Max Count: "+cnt1);
	}

}
