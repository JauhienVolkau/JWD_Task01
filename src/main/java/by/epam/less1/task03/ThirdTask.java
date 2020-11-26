package by.epam.less1.task03;
import java.lang.Math;
import java.lang.Exception;
//Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. 
//Во сколько раз площадь вписанного квадрата меньше площади заданного?

public class ThirdTask 
{
	public double findAreaOfSecondSquare(double square1) throws Exception 
	{
		if (square1 < 0)  
		{
			throw new Exception ("Error. The area of a square can't be nonpositive.");
		}
		double r = Math.sqrt(square1);
		double new_side = r * Math.sqrt(2)/2;
		double square2 = new_side * new_side;
		return square2;
	}
	
	public double findSquareDivision(double square1) 
	{
		double r = Math.sqrt(square1);
		r/=2;
		double side = r * Math.sqrt(2);
		double square2=side*side;
		return square1/square2;
	}
}