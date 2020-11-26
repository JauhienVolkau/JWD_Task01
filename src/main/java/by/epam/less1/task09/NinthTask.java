package by.epam.less1.task09;

import java.lang.Math;
import java.lang.Exception;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class NinthTask 
{
	double pi = Math.PI;
	public double getArea(double R) throws Exception 
	{
		if (R < 0)  
		{
			throw new Exception ("Error. R can't be < 0.");
		}
		double area = pi*R*R;
	    return area;
	}
		
	public double getLength(double R) throws Exception 
	{
		if (R<0)  
		{
			throw new Exception ("Error. R can't be < 0.");
		}
        double length= 2*pi*R;
        return length;
	}
}
