package com.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import com.anmol.NutritionFacts;
import com.anmol.Singleton;
import com.anmol.SingletonEnum;

public class Test {
	public static void main(String[] args) {
//		Singleton single = Singleton.INSTANCE;
//		System.out.println(single.hashCode());
//		System.out.println("Inside Test Class count : " + single.count);
//		
//		
//		Singleton single1 = Singleton.INSTANCE;
//		System.out.println(single1.hashCode());
//		System.out.println("Inside Test Class count : " + single1.count);
//		
//		System.out.println(SingletonEnum.INSTANCE);
//		
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("23", 0);
		m.put(new String("23"),424);
		
		String s1 = "23";
		String s2 = s1;
		if(s1 == s2)
			System.out.println("true");
		if("23" == new String("23")) {
			System.out.println("/ccs/true");
		}
		
		System.out.println("Anmol".hashCode());
		System.out.println(new String("Anmol").hashCode());
		
		System.out.println(m.size());
		Set s = m.keySet();
		for(Object key : s) {
			System.out.println(key.hashCode());
		}
	}
}
