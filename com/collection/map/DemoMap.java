package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"apple");
		map.put(2,"orange");
		map.put(3,"mango");
		
		
		System.out.println(map.values());
		
		for(Map.Entry<Integer,String> a:map.entrySet()) {
			System.out.println(a);
		}
		
		

	}

}
