package by.epam.less1.task01;
import java.lang.Math;

//Написать программу, позволяющую по последней цифре числа 
//определить последнюю цифру его квадрата

public class FirstTask 
{
	public int findLastDigitOfSquare(int i) 
	{
		int last_dig = (Math.abs(i)) % 10;
		int square = 0;
        switch (last_dig)
        {
        case 0:
            square = 0;
            break;
        case 1:
            square = 1;
            break;
        case 2:
            square = 4;
            break;
        case 3:
            square = 9;
            break;
        case 4:
            square = 6;
            break;
        case 5:
            square = 5;
            break;
        case 6:
            square = 6;
            break;
        case 7:
            square = 9;
            break;
        case 8:
            square = 4;
            break;
        case 9:
            square = 1;
            break;
        }
        return square;
	}
}