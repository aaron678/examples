package com.study.examples;

public class VarArgs {
	
	void test(String ... s){
	  System.out.println("Running test");
	}
	
	void test2(String[] s){
		System.out.println("Running test2");
	}

	public static void main(String[] args) {
		//https://stackoverflow.com/questions/11640507/difference-between-arrays-and-3-dots-in-java
		
		new VarArgs().test(new String[]{"hi","its", "me"});
		new VarArgs().test("hi","its", "me");
		
		new VarArgs().test2(new String[]{"hi","its", "me"});
		new VarArgs().test2("hi","its", "me"); // this should not compile

	}

}
