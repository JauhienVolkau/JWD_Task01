package by.epam.less1.task01;
import org.junit.Assert;
import org.junit.Test;

public class FirstTaskTest
{
	@Test
	public void testFindLastDigitOfSquare01() 
	{
		int i = -90389;
		
		int expected = 1;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findLastDigitOfSquare(i);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindLastDigitOfSquare02() 
	{
		int i = 11125;
		
		int expected = 5;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findLastDigitOfSquare(i);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindLastDigitOfSquare03() 
	{
		int i = 330;
		
		int expected = 0;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findLastDigitOfSquare(i);
		
		Assert.assertEquals(expected, actual);
	}
}
