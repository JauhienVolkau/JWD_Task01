package by.epam.less1.task07;

import java.lang.Math;

//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, 
//которая из точек находится ближе к началу координат. x y.

public class SeventhTask 
{
	public int getNearest(double x1, double y1, double x2, double y2) 
	{
		if (Math.sqrt(x1*x1+y1*y1)>Math.sqrt(x2*x2+y2*y2)) 
		{
			return 1;
		}
		else if(Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2)) 
		{
			return -1;
		}
		else
			return 0;
	}
}
