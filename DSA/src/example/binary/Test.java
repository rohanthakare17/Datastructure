package example.binary;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int score[]=new int [11];
		//int score[]= {10,88,90,0,56,};
		score[0]=90;
		score[1]=89;
		score[2]=0;
		score[3]=10;
		score[4]=89;
		
		
		for(int i=0; i<score.length;i++) {
			System.out.println("Score : "+score[i]);
		}
		
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		
		scoreList.add(90);
		scoreList.add(89);
		scoreList.add(0);
		scoreList.add(10);
		scoreList.add(89);
		
		for(int i=0; i<scoreList.size();i++)
		{
			
		}
	}

}
