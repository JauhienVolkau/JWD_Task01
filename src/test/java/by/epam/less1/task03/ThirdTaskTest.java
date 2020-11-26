package by.epam.less1.task03;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest 
{
	@Test
	public void testFindAreaOfSecondSquare01() 
	{
		try 
		{
			double square1 = 3.0;
			
			double expected = 1.5;
			double actual;
			double delta = 0.001;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected, actual, delta); 
		}
		catch (Exception e) 
		{
			final String expected = "Error. The area of a square can't be nonpositive.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindAreaOfSecondSquare02() 
	{
		try 
		{
			double square1 = 14.4;
			
			double expected = 7.2;
			double actual;
			double delta = 0.001;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) 
		{
			final String expected = "Error. The area of a square can't be nonpositive.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindAreaOfSecondSquare03() 
	{
		try 
		{
			double square1 = 0;
			
			double expected = 0;
			double actual;
			double delta = 0.01;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta);
		}
		catch (Exception e) 
		{
			final String expected = "Error. The area of a square can't be nonpositive.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindAreaOfSecondSquare04() 
	{
		try 
		{
			double square1 = -1;
			
			double expected = 0.5;
			double actual;
			double delta = 0.001;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) 
		{
			final String expected = "Error. The area of a square can't be nonpositive.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
		
	@Test
	public void testFindAreaOfSecondSquare05() 
	{
		try 
		{
			double square1 = 20;
			
			double expected = 10;
			double actual;
			double delta = 0.001;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) 
		{
			final String expected = "Error. The area of a square can't be nonpositive.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
