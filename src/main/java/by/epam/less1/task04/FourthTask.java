package by.epam.less1.task04;
//Составить программу, печатающую значение true, 
//если указанное высказывание является истинным, и 
//false — в противном случае: 
//среди заданных целых чисел А, В, С, D есть хотя бы два четных.

public class FourthTask 
{
	public boolean isStatementTrue(int A, int B, int C, int D)
	{
		if ((		A%2==0 && B%2==0) 
				|| (A%2==0 && C%2==0) 
				|| (A%2==0 && D%2==0) 
				|| (C%2==0 && B%2==0) 
				|| (D%2==0 && B%2==0) 
				|| (C%2==0 && D%2==0)) 
			return true;
		else 
			return false;
	}
}
