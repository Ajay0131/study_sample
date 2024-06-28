package org.utube;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {
	
//@Test
//	public void getAllEmployees() {
//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification requestSpecification = RestAssured.given();
//		Response response = requestSpecification.request(Method.GET,"/api/unknown/2");
//		System.out.println(response.asPrettyString());
//		System.out.println(response.getStatusLine());		 
//	}
//@Test
//public void CreateAnEmployee() {
//	RestAssured.baseURI="https://reqres.in";
//	RequestSpecification requestSpecification = RestAssured.given().body("\r\n" + 
//			"{\r\n" + 
//			"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
//			"    \"password\": \"pistol\"\r\n" + 
//			"}").header("Content-Type","application/json");
//	Response response = requestSpecification.request(Method.POST,"/api/unknown/2");
//	System.out.println(response.asPrettyString());
//	System.out.println(response.getStatusLine());		 
//
//}
@Test
public void UpdateAnEmployee() {
	RestAssured.baseURI="https://reqres.in/api/unknown/2";
	RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
			"    \"password\": \"raji\"\r\n" + 
			"}\r\n" + "");
	Response response = requestSpecification.request(Method.PUT);
	System.out.println(response.asPrettyString());
	System.out.println(response.getStatusLine());		 
}
}











