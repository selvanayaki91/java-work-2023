package com.sb.basic.seleniumtesting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForLoopTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ForLoopTesting");
		
		List<Integer> list =Arrays.asList(1,3,7,8,9);
		
		list.forEach(num -> {
		    System.out.println(num);
		});
		
	

	}

	private static void forEach() {
		// TODO Auto-generated method stub
		
	}

}
