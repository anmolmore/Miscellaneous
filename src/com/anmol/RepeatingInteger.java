package com.anmol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RepeatingInteger {
	
	public static void main(String[] args) {
		int input[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		for(int i=0;i<input.length;i++) {
			int current_item = input[i];
			for(int j=i+1; j<input.length;j++) {
				if(current_item == input[j]) {
					System.out.println("Found Number " + current_item + "repeated");
				}
			}
		}
	}
}

//1413044240385
//1413044240385


