package loanapplication.javaproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	1 2    3
	//	5 10   20
	//	90 100 300

		
		int score[][]= {{1,2,3},{5,10,20},{90,100,300}};
		int max =score[2][2];
		
		
		for(int i=0;i<3;i++)
		
		{
			for(int j=0;j<3;j++)
			{
			   if(score[i][j]>max)
			   {
			      max=score[i][j];
			
		//System.out.println(min);
			}	
	           // System.out.println(score[i][j]);
			}
		}
		
		System.out.println(max);
		
		
		Date newd = new Date();
		SimpleDateFormat dd= new SimpleDateFormat("M/d/yyyy");
	   System.out.println( dd.format(newd));
		
		System.out.println(newd.toString());
	}

}
