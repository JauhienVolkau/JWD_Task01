package by.epam.less1.task10;

import java.lang.Math;
import java.lang.Exception;
public class TenthTask {
	public double getFunction(double i) throws Exception 
	{
		if (i == Math.PI/2) 
		{
			throw new Exception ("Error. The tangens of pi/2 is not defined.");
		}
		double F = Math.tan(i);
		return F;
	}
}
