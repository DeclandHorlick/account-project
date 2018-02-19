package com.qa.app;

import java.util.HashMap;

import org.json.JSONObject;


public class Services 
{
	
	public void createAccount()
	{
		
		//System.out.println("Account Number : "+ accNum +"\n First Name : "+firstName + "\n Second Name : " +secName);
		
	}
	public HashMap addAccount()
	{
		
		Account newAcc = new Account("Jimmy", "Newtron");
		Account newAcc2 = new Account("Declan", "Cordial");
		
		
		HashMap <Integer,Account>accountMap = new HashMap<Integer,Account>();
		accountMap.put(newAcc.getAccNum(), newAcc);//new Account("Jimmy", "Newtron") );
		accountMap.put(newAcc2.getAccNum() , newAcc2);//new Account("Jimmy", "Newtron") );
		JSONObject gson = new JSONObject(accountMap);	
		System.out.println(gson);
		//ObjectMapper mapper = new ObjectMapper();
		//String jsonFromMap = mapper.writeValueAsString(accountMap);
		return accountMap;
	}
		
	
	
}
