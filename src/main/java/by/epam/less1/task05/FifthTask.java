package by.epam.less1.task05;

//Составить программу, печатающую значение true, 
//если указанное высказывание является истинным, 
//и false — в противном случае:
//является ли целое число совершенным (сумма делителей равна самому числу).

public class FifthTask 
{
	public boolean isPerfect(int number)
	{
		int num = number;
		int sum = 1;
		for (int i = 2; i < number/2 + 1; i++) 
			if (num%i == 0) 
				sum+=i;
		if (sum == number)
			return true;
		else
			return false;
	}
}
