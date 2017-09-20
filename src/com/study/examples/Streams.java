package com.study.examples;

import java.util.LinkedList;

public class Streams {
	int count2=0;
	long count(LinkedList<String> names){
		names.forEach(name -> {if (name.startsWith("a")) count2++;});
        return count2;
	}
	
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>(){{add("aaron");add("fred");add("eric");}};
		long count = names.stream().filter(name -> name.startsWith("a")).count();
        System.out.println(count);
        
        System.out.println(new Streams().count(names));
        
	}

}
