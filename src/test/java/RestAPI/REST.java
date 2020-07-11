package RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class REST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	String res=	given().log().all().queryParam("key", "qaclick123").header("header-type","application/json")
		.body(payload.jsonfile()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.extract().response().asString();
		
		System.out.println(res);
		JsonPath js=new JsonPath(res);
		String Place=js.get("place_id");
		String newaddress="70 winter walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("header-type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+Place+"\",\r\n" + 
				"\"address\":\""+newaddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
	String add=	given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", Place).when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	JsonPath js1=new JsonPath(add);
	String place1=js1.get("address");	
	System.out.println(place1);
    
	Assert.assertEquals(place1, newaddress);
	
	}

}
