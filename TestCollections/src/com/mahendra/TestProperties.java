package com.mahendra;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// Properties class is derived from "Hashtable", which is derived from Map
		// Both key and value are Strings
		Properties ps = System.getProperties();
		
		System.out.println("OS : "+ps.getProperty("os.name"));
		
		System.out.println("All properties ");
		
		Enumeration enums = ps.keys();
		while(enums.hasMoreElements()) {
			String name = enums.nextElement().toString();
			String value = ps.getProperty(name);
			System.out.println(name+" \t\t "+value);
		}
		
	}

}
