package loanapplication.javaproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method ]stub
		
		int score[][]= {{1,2,3},{5,10,20},{90,100,300}};
		
		int k=appu(score);
		System.out.println(k);
		
		
		
	
	}

	
public static int appu(int[][] score)

{
	

	int sum=0;
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			
			sum=sum+score[i][j];
	}
	return sum;
	
	
	
}
}
