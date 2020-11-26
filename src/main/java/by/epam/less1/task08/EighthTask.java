package by.epam.less1.task08;

import java.lang.Math;
import java.lang.Exception;
//Вычислить значение функции

public class EighthTask 
{
	public double getFunction(double x) throws Exception 
	{
		if (x == Math.cbrt(6))  
		{
			throw new Exception ("Error. x^3 can't be = 6.");
		}
		if (x == Double.POSITIVE_INFINITY)  
		{
			throw new Exception ("function F tends to negative infinity.");
		}
		if (x == Double.NEGATIVE_INFINITY)  
		{
			throw new Exception ("function F tends to 0.");
		}
		double F = 0;
		if (x < 3)
			F = 1/(x*x*x-6);
		else
			F = -(x*x)+3*x+9;
		return F;
	}
}
