package loanapplication.javaproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method ]stub
		
		int[] ab= {1,499,37873,238,379};//488,37374,37635,141
		
	
		int s =senmethod(ab);
		int mul=newm(10,20);
		
		System.out.println(s);
		System.out.println(mul);
		
		
			
		
		
	
	}

	
public static int newm(int i, int j) {
		// TODO Auto-generated method stub
	
	int su = 0;
	for(int k=0;k<j;k++)
	
		su=su+i;
		return su;
	}


public static int senmethod(int[] ab)

{
	

	int sum=0;
	
	for(int i=0;i<ab.length;i++)
	{
		
		sum=sum+ab[i];
	}
	return sum;
	

			
}
}
