package RestAPI;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class interview1 {

	@Test
	public void city() throws IOException {

		// Testcase1-Positive-Test case to assert the correct status response code for name attribute .Also to retrieve the countryname name
          String nam="Estonia";
		RestAssured.baseURI = "https://restcountries.eu";

		String city = given().log().all().header("header-type", "application/json").when()
				.get("rest/v2/capital/tallinn").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

		JsonPath js2 = new JsonPath(city);
		String country = js2.getString("name");
		System.out.println(country);
		//Assert.assertEquals(country, nam);

	}

	@Test
	public void city1() throws IOException {
		// Testcase2-Negative-Test case to assert the  status code by providing invalid status code while assertion

		RestAssured.baseURI = "https://restcountries.eu";
		// Testcas1-Positive-Test case to assert the correct status code

		String city = given().log().all().header("header-type", "application/json").when()
				.get("rest/v2/capital/tallinn").then().log().all().assertThat().statusCode(209).extract().response()
				.asString();

		JsonPath js2 = new JsonPath(city);
		String cityname = js2.getString("name");
		System.out.println(cityname);

	}
	@Test
	public void city2() throws IOException {
		// Testcase3-Negative-Test case to assert the  invalid base URI

		RestAssured.baseURI = "https://restcountrs.eu";
		

		String city = given().log().all().header("header-type", "application/json").when()
				.get("rest/v2/capital/tallinn").then().log().all().assertThat().statusCode(209).extract().response()
				.asString();

		//JsonPath js2 = new JsonPath(city);
		//String cityname = js2.getString("name");
		//System.out.println(cityname);

	}
	@Test
	public void city3() throws IOException {
		// Testcase4-Negative-Test case to assert invalid resource -404

		RestAssured.baseURI = "https://restcountries.eu";
		

		String city = given().log().all().header("header-type", "application/json").when()
				.get("rest/v2/capit").then().log().all().assertThat().statusCode(404).extract().response()
				.asString();

		//JsonPath js2 = new JsonPath(city);
		//String cityname = js2.getString("name");
		//System.out.println(cityname);

}
	
	@Test
	public void city4() throws IOException {
		// Testcase5-To verify the calling code.

		//RestAssured.baseURI = "https://restcountries.eu";
		

		JsonPath js=new JsonPath(payload.capital());
		int ccode=js.getInt("callingCodes[0]");
		
         
}
	@Test
	public void city5() throws IOException {
		// Testcase6-To print the capital city

		//RestAssured.baseURI = "https://restcountries.eu";
		

		JsonPath js=new JsonPath(payload.capital());
		String capital=js.getString("capital");
		System.out.println(capital);
         
}
	
	@Test
	public void city6() throws IOException {
		// Testcase7-To print the region

		//RestAssured.baseURI = "https://restcountries.eu";
		

		JsonPath js=new JsonPath(payload.capital());
		String reg=js.getString("region");
		System.out.println(reg);
         
}
	
	@Test
	public void city7() throws IOException {
		// Testcase8-To print the population

		//RestAssured.baseURI = "https://restcountries.eu";
		

		JsonPath js=new JsonPath(payload.capital());
		String pop=js.getString("population");
		System.out.println(pop);
         
}
	@Test
	public void city8() throws IOException {
		// Testcase9-To print the timezone

		//RestAssured.baseURI = "https://restcountries.eu";
		

		JsonPath js=new JsonPath(payload.capital());
		String tzone=js.getString("timezones[0]");
		System.out.println(tzone);
         
}
	@Test
	public void city9() throws IOException {
		// Testcase10-To print the currencies

		//RestAssured.baseURI = "https://restcountries.eu";//
		

		JsonPath js=new JsonPath(payload.capital());
		String cur=js.getString("currencies[0]");
		String cur1=js.getString("currencies[1]");
		String cur2=js.getString("currencies[2]");
		System.out.println(cur);
		System.out.println(cur1);
		System.out.println(cur2);
         
}
}
