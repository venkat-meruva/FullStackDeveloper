package com.egiants.convertor;

import org.json.JSONObject;
import org.json.XML;

public class Xml2Json {

	private static final int INDENT_FACTOR = 4;

	public static void main(String[] args) {
		String xml2json = "<Names><user><name>venkat</name><age>25</age><name>egiants</name><age>12</age></user></Names>";
		JSONObject jsonObject = XML.toJSONObject(xml2json);
		String jsonString = jsonObject.toString(INDENT_FACTOR);
		System.out.println(jsonString);
	}

}
