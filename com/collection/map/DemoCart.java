package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this map in generic first one is integer for unique identity of the product
		Map<Integer,Product> prod=new HashMap<Integer, Product>();
		
		//we put data into the Map
		prod.put(1,new Product("orange",123.0f));
		prod.put(2,new Product("mango",111.0f));
		prod.put(3,new Product("grape",121.0f));
		prod.put(4,new Product("a1",101.3f));
		prod.put(5,new Product("b1",141.0f));
		
		//we see the o/p of the our map clearly by overriding the to string
		System.out.println(prod);
		
		//this is for see the all the element that is in the Map one by one in a sequence
		for(Map.Entry<Integer,Product> pd:prod.entrySet()) {
			System.out.println(pd);
		}
		//this work like cart that billing sector only know the product id,through the id the compare with quantity then print the bill
		Map<Integer,Integer> cart=new   HashMap<Integer,Integer>();
		cart.put(1,1);
		cart.put(2,1);
		
		//this class for all the process of the bill
		Bill bill=new Bill();
		//In the below method we pass the our map as a parameter in the method the will check the id and quantity and make bill
		System.out.println("Total Bill of the product is  "+bill.pay(prod, cart));
	}

}

class Bill{
	//here we pass our map reference as parameter
	int pay(Map<Integer,Product> prod,Map<Integer,Integer> cart) {
		
		int tot_bil=0;//temp variable with initialize
		//this is special method that get all the data form our map
		for(Map.Entry<Integer,Integer> crt:cart.entrySet()) {
			                     //it is key means id
			Product pd=prod.get(crt.getKey());/*we take pd new reference and it can hold our maps that see and goes to the another map
			                                   through the key ,
			                                   that have product name with the price that was in the values part,*/
			                     
			tot_bil+=pd.unit_cost*crt.getValue();//perform the operation and give the result
			
			
		}
		return tot_bil;
	}
}

//this class for our product detail that we pass in the map
class Product{
	 
	String name;
	float unit_cost;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Product(String name, float unit_cost) {
		super();
		this.name = name;
		this.unit_cost = unit_cost;
	}
    //we override the toString for clearly see the output 
	@Override
	public String toString() {
		return "Product [name=" + name + ", unit_cost=" + unit_cost + "]";
	}
  }
