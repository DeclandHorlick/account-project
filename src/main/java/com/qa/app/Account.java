package com.qa.app;



public class Account 
{
	private String firstName;
	private String secName;
	private static int accNum =0;
	private int nextAccNum ;
	public Account(String fName,String sName)
	{
		
		//
		setFirstName(fName);
		setSecondName(sName);
		//System.out.println("First Name : " +getFirstName()+"\nSecond Name : "+getSecondName()+"\nAccount Number : "+getAccNum());
		accNum =0;
	}
	
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
		
			//accNum = nextAccNum;
			//nextAccNum ++;	

			
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
		
		//accNum= accNum-2;
		accNum++;
		return accNum;
	}
}
