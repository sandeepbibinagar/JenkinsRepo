package testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestWebService {
	Response res;
	
	@Test
	public void testRequest(){
		
	 res= RestAssured.get("https://reqres.in/api/users/2");
	int code=res.getStatusCode();
	System.out.println("Status code expected is 200  : " +code);

	}

	
	//@Test
	public void testBody(){
	res =RestAssured.get("https://reqres.in/api/users/2");
	String data= res.asString();
	System.out.println("MVN Changes test .... : " +data);
	
	}
}
