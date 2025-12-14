package com.revise.string;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//we check here how many word in our sentence
		
		String str="I am trying to improve java programming skill";
		//we take here word for holding the words from the sentence
		String word[]=str.split(" ");
		System.out.println("word in our sentence "+word.length);
		
	}

}
