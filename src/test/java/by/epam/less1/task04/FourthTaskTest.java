package by.epam.less1.task04;

import org.junit.Assert;
import org.junit.Test;

public class FourthTaskTest 
{
	@Test
	public void testIsStatementTrue01() 
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isStatementTrue(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsStatementTrue02() 
	{
		int A = 1;
		int B = -5;
		int C = 0;
		int D = 4;
		
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isStatementTrue(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsStatementTrue03() 
	{
		int A = 1;
		int B = 1;
		int C = 0;
		int D = 1;
		
		boolean expected = false;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isStatementTrue(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsStatementTrue04() 
	{
		int A = 0;
		int B = -11;
		int C = -2;
		int D = 10;
	
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isStatementTrue(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
}