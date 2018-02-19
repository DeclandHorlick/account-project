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
		Iterator it = currentMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			//System.out.println(pair.toString());
			//pair.toString()
			//it.remove(); // avoids a ConcurrentModificationException
			//System.out.println(pair.getValue());
			if(newAcc.toString().equals("Declan"))
			{
			
				count ++;
			}
			//if (pair.getValue().equals("Declan"))
			//{
			//	count ++;
			//}
			
		}
		System.out.println(count);
		return count;
		
	}

}
