package org.tseting1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITesting3 {

	public static void main(String[] args) {

		Response response = RestAssured.given().when().get("https://reqres.in/api/users?page=2");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

		Response post = RestAssured.given().body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}\r\n" + 
				"").when().post("https://reqres.in/api/login");

		int statusCode2 = post.getStatusCode();
		System.out.println(statusCode2);
 
		String asPrettyString2 = post.getBody().asPrettyString();
		System.out.println(asPrettyString2);
}
}

