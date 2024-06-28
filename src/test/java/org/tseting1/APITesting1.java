package org.tseting1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class APITesting1 {
	
public static void main(String[] args) throws IOException, ParseException {
	FileReader fr = new FileReader("src\\test\\resources\\ReqresGet.json");	
	JSONParser jp = new JSONParser();
	Object parse = jp.parse(fr);
	JSONObject jo = (JSONObject)parse;
	String s = jo.get("job").toString();
	System.out.println(s);
}
}
