package by.epam.less1.task07;

import org.junit.Assert;
import org.junit.Test;

public class SeventhTaskTest 
{
	@Test
	public void testGetNearest01() 
	{
		double x1 = 34;
		double y1 = 1;
		double x2 = -1;
		double y2 = -34;
		
		int expected = 0;
		int actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetNearest02() 
	{
		double x1 = 23;
		double y1 = -1.001;
		double x2 = 12.99;
		double y2 = 13.1;
		int expected = 1;
		int actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetNearest03() 
	{
		double x1 = 1.1;
		double y1 = 1.7;
		double x2 = -2.2;
		double y2 = -2;
		
		int expected = -1;
		int actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
}