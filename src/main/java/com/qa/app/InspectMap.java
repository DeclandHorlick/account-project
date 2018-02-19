package com.qa.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InspectMap {
	public int getCommonNames()
	{
		
	    
	        
	        
	        
		
		
		
		
		int count =0;
		Services myService = new Services();
		Account newAcc= new Account("Declan","Horlick");
		HashMap currentMap = myService.addAccount();
		System.out.println(currentMap);
		Iterator it = currentMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			
			if(newAcc.toString().equals("Declan"))
			{
			
				count ++;
			}
			
		}
		
		return count;
		
	}

}
