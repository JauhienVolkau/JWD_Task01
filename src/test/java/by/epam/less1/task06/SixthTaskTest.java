package by.epam.less1.task06;

import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class SixthTaskTest 
{
	@Test
	public void testGetHoursMinutesSeconds01() 
	{
		try 
		{
			int seconds = 0;
			
			int expected1 = 0;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 0;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 0;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHoursMinutesSeconds02() 
	{
		try 
		{
			int seconds = 3600;
			
			int expected1 = 0;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 59;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 59;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHoursMinutesSeconds03() 
	{
		try 
		{
			int seconds = 3601;
			
			int expected1 = 1;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 0;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 0;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHoursMinutesSeconds04() 
	{
		try 
		{
			int seconds = 86400;
			
			int expected1 = 23;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 59;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 59;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHoursMinutesSeconds05() 
	{
		try 
		{
			int seconds = 11111;
			
			int expected1 = 3;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 5;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 10;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHoursMinutesSeconds06() 
	{
		try 
		{
			int seconds = 87777;
			
			int expected1 = 0;
			int actual1;		
			SixthTask obj = new SixthTask();		
			actual1 = obj.getHours(seconds);
			
			int expected2 = 22;
			int actual2;			
			actual2 = obj.getMinutes(seconds);
			
			int expected3 = 56;
			int actual3;				
			actual3 = obj.getSeconds(seconds);
			
			Assert.assertEquals(expected1, actual1);
			Assert.assertEquals(expected2, actual2);
			Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of seconds can't be <1 and >86400.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
