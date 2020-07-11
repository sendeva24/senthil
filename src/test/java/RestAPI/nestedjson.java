package RestAPI;

import files.payload;
import io.restassured.path.json.JsonPath;

public class nestedjson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js=new JsonPath(payload.CoursePrice());
		//count of course
		int cou=js.getInt("courses.size()");
		System.out.println(cou);
		
		//print purchase amount
		
		int amt=js.getInt("dashboard.purchaseAmount");
		System.out.println(amt);
		
		//print title of first course
		
        String s=  js.get("courses.title[0]");
        System.out.println(s);
        
        //print course and price
        
        for(int i=0;i<cou;i++)
        {
        	String co=js.get("courses.title["+i+"]");
        	int pri=js.getInt("courses.price["+i+"]");
        	System.out.println(co);
        	System.out.println(pri);
        
        }
        
        //print number of coursed by RPA
        
        for(int i=0;i<cou;i++)
        {
        	String co=js.get("courses.title["+i+"]");
       
        	if(co.equalsIgnoreCase("RPA"))
        	{
        		int cop=js.getInt("courses.copies["+i+"]");
        		System.out.println(cop);
        	}
        }
        

}
}
