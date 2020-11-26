package by.epam.less1.task06;

import java.lang.Exception;

//Идет n-я секунда суток, определить, сколько полных часов, 
//полных минут и секунд прошло к этому моменту.

public class SixthTask 
{
	public int getHours(int seconds) throws Exception 
	{
		if (seconds<1 || seconds>86400)  
		{
			throw new Exception ("Error. The number of seconds can't be <1 and >86400.");
		}
		seconds--;
		int hours = seconds/3600;
		return hours;
	}
		
	public int getMinutes(int seconds) throws Exception 
	{
		seconds--;
		int hours = seconds/3600;
		int minutes = (seconds - hours*3600)/60;
		return minutes;
	}
	
	public int getSeconds(int seconds) throws Exception 
	{
		seconds--;
		int hours = seconds/3600;
		int minutes = (seconds - hours*3600)/60;
		int secs = seconds-hours*3600-minutes*60;
		return secs;
	}
}

