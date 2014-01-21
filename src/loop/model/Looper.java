package loop.model;

import java.util.ArrayList;

public class Looper
{
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheGraveNameList();
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("George Wesley");
		graveNameList.add("Frances R. Davenport");
		graveNameList.add("Arthur Julius");
		graveNameList.add("Delilah M. Sisam");
		graveNameList.add("G. Leonard");
		graveNameList.add("M. Cecilia");
		graveNameList.add("Perry W. Black");
		graveNameList.add("April Anderson");
		graveNameList.add("Ruth Carlsonnix");
		graveNameList.add("Marian Maxwell Holdaway");
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	


	
	public void setGraveNameList(ArrayList<String> graveNameList)
	{
		this.graveNameList = graveNameList;
	}

	public String loopTestOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		
		for(int counter = 5; counter <= 20; counter++)
		{
			loopResult += counter +",";
			numberOfTimes++;
		}
		loopResult += " was the last time";
		loopResult += "\nthe loop executed " + numberOfTimes + " times.";
		return loopResult;
	}
	
	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		
		for(int week = 0; week < 52; week++)
		{
			for(int day = 0; day < 7; day++)
			{
				for(int other = 0; other < 24; other++)
				{
					for(int count = 0; count < 60; count++)
					{
						//loopResult += " Count is " + count + "\n";
						for(int otherCount = 0; otherCount < 60; otherCount++)
						{
							//loopResult += " Othercount is " + otherCount + "\n";
							numberOfTimes++;
						}
					}
				}
			}
		}
		loopResult += "The loop executed" + numberOfTimes + " times - wow!";
		return loopResult;
	}
}
