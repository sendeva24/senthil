package RestAPI;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class auth2 {
	
	@Test
	public void newauthor() throws IOException {
		
		
		RestAssured.baseURI="http://216.10.245.166";
		String au=given().log().all().header("Content-Type","application/json").
		body(ap("C:\\Users\\sende\\Desktop\\book.json"))
		.when().post("/Library/Addbook.php").then().log().all().assertThat()
		.statusCode(200).extract().response().asString()	;
			
		JsonPath JS4= new JsonPath(au);
		JS4.get("ID");
		System.out.println(JS4.get("ID"));
		System.out.println(JS4.get("ID"));
		System.out.println(JS4.get("ID"));
		System.out.println(JS4.get("ID"));
	}

	
	public static String ap(String p) throws IOException{
		
		
	    return new String (Files.readAllBytes(Paths.get(p)));
		
		
	}
}
