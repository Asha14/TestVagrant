package classes;

import org.testng.annotations.BeforeTest;

import Utils.readConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Baseclass {
	
	readConfig r = new readConfig();
 Response resp;
	
	@BeforeTest
	public void uri_details()
	{
		RestAssured.baseURI= r.getURL();
		
		resp = given().when().get(r.request_details());
		
		
	}

}
