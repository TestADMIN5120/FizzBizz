package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

	public static Map<String,Map<String,Integer>> step1(String inputStr, Map<String,String> replaceStr)
	{

		 Map<String, Map<String, Integer>> map = new  HashMap<String, Map<String,Integer>>();
		
		String[] strArr = inputStr.split(" ");
		
		String finalStr = "";
		
		Set<String> keys = replaceStr.keySet();
		Map<String,Integer> test = new HashMap<String, Integer>();
		for(String str: strArr)
		{
			/*if(str.equalsIgnoreCase("3"))
			{
				finalStr = finalStr.concat("fizz");
				if(test == null || test.get("fizz") ==null)
				{
					test.put("fizz", 1);
				}else
				{
					test.put("fizz", test.get("fizz")+1);
				}
				
			}else if(str.equalsIgnoreCase("5"))
			{
				finalStr=	finalStr.concat("buzz");
				
				if(test == null || test.get("buzz") ==null)
				{
					test.put("buzz", 1);
				}else
				{
					test.put("buzz", test.get("buzz")+1);
				}
				
			}else if(str.equalsIgnoreCase("15"))
			{
				finalStr = finalStr.concat("fizzbuzz");
				
				if(test == null || test.get("fizzbuzz") == null)
				{
					test.put("fizzbuzz", 1);
				}else
				{
					test.put("fizzbuzz", test.get("fizzbuzz")+1);
				}
				
			}*/
			
			if(keys.contains(str))
			{
				finalStr = finalStr.concat(replaceStr.get(str));
				if(test == null || test.get(replaceStr.get(str)) ==null)
				{
					test.put(replaceStr.get(str), 1);
				}else
				{
					test.put(replaceStr.get(str), test.get(replaceStr.get(str))+1);
				}
			}
			else
			{
				finalStr = finalStr.concat(str);
			}
			
			
			finalStr  = finalStr.concat(" ");
		}
		
		for(String str: test.keySet())
		{
			System.out.println(str+": "+ test.get(str));
		}
		System.out.println(finalStr);
		
		map.put(finalStr, test);
		
		return map;
	}
	/*
	 * 
	 * public static String step2(String inputStr) {
	 * 
	 * 
	 * String[] strArr = inputStr.split(" ");
	 * 
	 * String finalStr = ""; for(String str: strArr) { if(str.equalsIgnoreCase("3"))
	 * { finalStr = finalStr.concat("lucky");
	 * 
	 * }else if(str.equalsIgnoreCase("5")) { finalStr= finalStr.concat("buzz");
	 * 
	 * }else if(str.equalsIgnoreCase("15")) { finalStr =
	 * finalStr.concat("fizzbuzz");
	 * 
	 * }else { finalStr = finalStr.concat(str); }
	 * 
	 * finalStr = finalStr.concat(" "); } System.out.println(finalStr); return
	 * finalStr; }
	 * 
	 * 
	 * public static Map step3(String inputStr) {
	 * 
	 * 
	 * String[] strArr = inputStr.split(" ");
	 * 
	 * String finalStr = "";
	 * 
	 * Map<String,Integer> test = new HashMap<String, Integer>(); for(String str:
	 * strArr) { if(str.equalsIgnoreCase("3")) { finalStr =
	 * finalStr.concat("lucky"); if(test.get("lucky") ==0) { test.put("lucky", 1);
	 * }else { test.put("lucky", test.get("lucky")+1); }
	 * 
	 * }else if(str.equalsIgnoreCase("5")) { finalStr= finalStr.concat("buzz");
	 * 
	 * if(test.get("buzz") ==0) { test.put("buzz", 1); }else { test.put("buzz",
	 * test.get("buzz")+1); }
	 * 
	 * }else if(str.equalsIgnoreCase("15")) { finalStr =
	 * finalStr.concat("fizzbuzz");
	 * 
	 * if(test.get("fizzbuzz") ==0) { test.put("fizzbuzz", 1); }else {
	 * test.put("fizzbuzz", test.get("fizzbuzz")+1); }
	 * 
	 * }else { finalStr = finalStr.concat(str); }
	 * 
	 * 
	 * finalStr = finalStr.concat(" "); }
	 * 
	 * for(String str: test.keySet()) { System.out.println(str+": "+ test.get(str));
	 * } System.out.println(finalStr);
	 * 
	 * 
	 * 
	 * return test; }
	 */
	
	public static void main(String[] args) {
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "fizz");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		step1(args[0],inputStr);
	}
}
