package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test1Int {
	
	public static void main(String[] args) {
	
	List<Integer> lis1 = new ArrayList();
	List<Integer> lis2 = new ArrayList();
	
	lis1.add(4);
	lis1.add(9);
	lis1.add(7);
	lis1.add(1);
	//lis2=lis1;
	lis2.addAll(lis1);
	System.out.println(lis2);
	lis1.remove(7);
	System.out.println(lis2);
	}
	
	
	

}
