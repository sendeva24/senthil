package RestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class Summ {
	
	@Test
	public void Sumcop(){
		
		int sum=0;
		JsonPath js=new JsonPath(payload.CoursePrice());
		//count of course
		int cou=js.getInt("courses.size()");
		 for(int i=0;i<cou;i++)
	        {
			 
				int pri=js.getInt("courses.price["+i+"]");
				int cop=js.getInt("courses.copies["+i+"]");
				int amtt=pri*cop;
				System.out.println(amtt);
				sum=sum+amtt;
		}
		 System.out.println(sum);
		 
		 int amttt=js.getInt("dashboard.purchaseAmount");
		 Assert.assertEquals(sum,amttt);
		 
	}
}
