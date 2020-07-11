package loanapplication.javaproject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method ]stub
		
		int[] ab= {1,499,37873,238,379};//488,37374,37635,141
		int[] abc= {2384,499,37873,234,34};
		ArrayList<Integer>sen= new ArrayList<Integer>();
		
		for(int i=0;i<ab.length;i++)
			
		{
			
			if(ab[i]==abc[i])
			{
			sen.add(ab[i]);
				
			}
		}
		
		Object[] alist=sen.toArray();
		for (Object obj :alist)
		{
			System.out.println(obj);
		}
}
	
	
}
