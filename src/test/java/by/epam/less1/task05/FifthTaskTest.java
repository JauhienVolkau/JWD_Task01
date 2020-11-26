package by.epam.less1.task05;

import org.junit.Assert;
import org.junit.Test;

public class FifthTaskTest 
{
	@Test
	public void testIsPerfect01() 
	{
		int number = 6;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfect02() 
	{
		int number = 28;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfect03() 
	{
		int number = 496;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfect04() 
	{
		int number = 8128;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfect05() 
	{
		int number = 15;
		boolean expected = false;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPerfect06() 
	{
		int number = 1111;
		boolean expected = false;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
}
