package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestSolution {

	@Test
	public void testStep1()
	{
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "fizz");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = Solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map test = map.get("1 2 fizz 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertNotNull(test);
	}

	@Test
	public void testStep2()
	{
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "lucky");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = Solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map test = map.get("1 2 lucky 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertNotNull(test);
	}
	
	
	@Test
	public void testStep3()
	{
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "lucky");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = Solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map test = map.get("1 2 lucky 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertTrue((Integer)(test.get("lucky"))==1 && (Integer)(test.get("buzz"))==1 && (Integer)(test.get("fizzbuzz"))==1);
	}

	
	
}
