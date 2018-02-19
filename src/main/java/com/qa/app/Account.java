package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Account 
{
	private String firstName;
	private String secName;
	private int accNum = 0 ;
	private int nextAccNum = 1;
	
	public void setFirstName(String nfNme)
	{
		firstName = nfNme;
	}
	public void setSecondName(String sName)
	{
		secName = sName;
	}
	public void setAccNum()
	{
		if (accNum<nextAccNum)
		{
			//accNum = nextAccNum;
			//nextAccNum ++;		
		}
	}
	public Account(String fName,String sName)
	{
		
		//setAccNum();
		setFirstName(fName);
		setSecondName(sName);
		//System.out.println("First Name : " +getFirstName()+"\nSecond Name : "+getSecondName()+"\nAccount Number : "+getAccNum());
		
	}
	
	
	
	public String getFirstName( )
	{
		return firstName;
	}
	public String getSecondName()
	{
		return secName;
	}
	public int getAccNum()
	{
		accNum=accNum +1;
		return accNum;
	}
}
