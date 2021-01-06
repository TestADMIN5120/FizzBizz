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
	
	public static void main(String[] args) {
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "fizz");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		step1(args[0],inputStr);
	}
}
