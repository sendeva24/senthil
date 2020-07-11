package RestAPI;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class auth {
	
	@Test(dataProvider="books")
	public void newauthor(String isbn, String aisle) {
		
		
		RestAssured.baseURI="http://216.10.245.166";
		String au=given().log().all().header("Content-Type","application/json").
		body(payload.Author(isbn,aisle))
		.when().post("/Library/Addbook.php").then().log().all().assertThat()
		.statusCode(200).extract().response().asString()	;
			
		JsonPath JS4= new JsonPath(au);
		JS4.get("ID");
		System.out.println(JS4.get("ID"));
	}

	@DataProvider
	public Object[][] books() {
		
		Object[][] data= new Object[3][2];
		data[0][0]="first";
		data[0][1]="pass1";
		data[1][0]="second";
		data[1][1]="pass2";
		data[2][0]="three";
	    data[2][1]="pass3";
	    return data;
		
		
	}
}
