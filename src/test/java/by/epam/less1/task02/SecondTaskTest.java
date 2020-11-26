package by.epam.less1.task02;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class SecondTaskTest
{
	@Test
	public void testFindNumberOfDays01() 
	{
		try 
		{
			int year = 2022;
			int month = 2;
			
			int expected = 28;
			int actual;
			
			SecondTask obj = new SecondTask();
			
			actual = obj.findNumberOfDays(year, month);
			Assert.assertEquals(expected, actual);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays02() 
	{
		try 
		{
			int year = 2020;
			int month = 2;
			
			int expected = 29;
			int actual;
			
			SecondTask obj = new SecondTask();
			
			actual = obj.findNumberOfDays(year, month);
			
			Assert.assertEquals(expected, actual);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays03() 
	{
		try
		{
			int year = 1100;
			int month = 2;
			
			int expected = 28;
			int actual;
			
			SecondTask obj = new SecondTask();
			
			actual = obj.findNumberOfDays(year, month);
			
			Assert.assertEquals(expected, actual);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays04() 
	{
		try
		{
			int year = 1;
			int month = 13;
			
			int expected = 31;
			int actual;
			
			SecondTask obj = new SecondTask();
			
			actual = obj.findNumberOfDays(year, month);
			
			Assert.assertEquals(expected, actual);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays05() 
	{
		try
		{
			int year = 2020;
			int month = 5;
			
			int expected = 31;
			int actual;
			
			SecondTask obj = new SecondTask();
			
			actual = obj.findNumberOfDays(year, month);
			
			Assert.assertEquals(expected, actual);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
