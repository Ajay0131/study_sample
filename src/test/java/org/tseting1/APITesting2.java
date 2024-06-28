package org.tseting1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APITesting2 {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fr = new FileReader("C:\\Users\\karthickrajan\\eclipse-workspace\\APITesting\\src\\test\\resources\\Sample.json");	
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(fr);

		// Typecast object to JSON Object
		JSONObject jo = (JSONObject)parse;
		Object o1 = jo.get("interest");
		
		
		// in interest --> we have array
		JSONArray arr = (JSONArray)o1;
		Object o2= arr.get(1);

		JSONObject jo2 = (JSONObject)o2;
		String s1 = jo2.get("favorite hero").toString();
		String s2 = jo2.get("favorite herion").toString();
		String s3 = jo2.get("favorite show").toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
}
}
