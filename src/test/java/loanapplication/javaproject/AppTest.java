package loanapplication.javaproject;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
     public void addition()
    {
    	int a=90;
    	int b=333;
    	int sum=a+b;
        System.out.println("Total is"+ sum);
    }
    @Test
    public void sum()
   {
   	String  s="street";
  	String  c="street";
       System.out.println(s + c);
   }
    @Test
    public void Fresh()
    {
    	String  s="streetsifiew";
        System.out.println(s.charAt(8));
        System.out.println(s.trim());
    }
    
    @Test
    public void palindrome()
   {
   
   	String text = "madam";
  String t =" ";
   	for(int i=text.length()-1; i>=0;i--)
   	{
   	   t= t + text.charAt(i);
   	
   	}
   	System.out.println(t);
   	
   	if(text==t);
   	
   	{
   		System.out.println("test is passed");
   		
   	}
   	
   		
   }
}
