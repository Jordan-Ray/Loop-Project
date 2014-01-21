package loop.controller;

import java.util.ArrayList;

import loop.model.Looper;
import loop.view.LoopFrame;

public class LoopController
{
	
	private LoopFrame appFrame;
	private Looper myLooper;
	
	public LoopController()
	{
		myLooper = new Looper();
	}
	
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String results = "";
		
		results = myLooper.loopTestTwo();
		
		return results;
	}
	
	public String getListResults(int position)
	{
		
		String currentResult = "";
		
		ArrayList<String> tempList = myLooper.getGraveNameList();
		currentResult = tempList.get(position);
		
		currentResult = myLooper.getGraveNameList().get(position);
		
		return currentResult;
	}
	
	
	
	
}
