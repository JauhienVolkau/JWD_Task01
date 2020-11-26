package by.epam.less1.task02;
import java.lang.Exception;
//Составить программу, которая по заданным году и номеру месяца 
//определяет количество дней в этом месяце 
//и корректно определялись все високосные года.

public class SecondTask 
{
	public int findNumberOfDays(int year, int month) throws Exception 
	{
        int days = 0;
        if (year<1 || month<1 || month>12)  
        {
        	throw new Exception ("Error. The number of year can't be less than 1 and the number of month can't be less than 1 and more than 12.");
        }
        if (year>0 || month >0 || month < 13)
        {
        	if (year%4!=0 || (year%4==0 && year%100==0 && year%400!=0)) 
    		{
    			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
    			{
    				days=31;
    			} else
    			if ( month == 4 || month == 6 || month == 9 || month == 11) 
    			{
    				days=30;
    			}
    			else
    			{
    		    if (month == 2)
    				    {
    				    	days=28;
    				    }
    			}
    		}
    		else
    		{
    			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
    			{
    				days=31;
    			} else
    			if (month == 4 || month == 6 || month == 9 || month == 11) 
    			{
    				days=30;
    			} else 
    			{
    				if (month == 2)
    			    {
    			    	days=29;
    			    }
    			}
    		}
        }
		return days; 
    }
}