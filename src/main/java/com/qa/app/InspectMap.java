package com.qa.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InspectMap {
	public int getCommonNames()
	{
		
	    
	        
	        
	        
		
		
		
		
		int count =0;
		Services myService = new Services();
		HashMap currentMap = myService.addAccount();
		Iterator it = currentMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
			
			if(currentMap.containsValue("Declan"))
			{
				count ++;
			}
			return count;
		}
		return count;
	}

}
