package loanapplication.javaproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method ]stub
		
		int[] ab= {1,499,37873,238,379};//488,37374,37635,141
		int sup=0;
		
		for(int i=0;i<ab.length-1;i++)
			
		{
			
			if(ab[i+1]-ab[i]>sup)
				
			{
				sup=ab[i+1]-ab[i];
			
			}
			
		}
		
		System.out.println(sup);
	
}
}
