package com.qa.testLayer;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.domain.Account;
import com.qa.repositoryLayer.Repository;
import com.qa.service.AccountService;
import com.qa.util.JSONUtil;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TestMock 
{
	
		@InjectMocks
		private Repository accountControl;

		@Mock
		private EntityManager manager;
		
		@Mock
		private Query query;
		
		private JSONUtil util;
		
		private static final String MOCK_DATA_ARRAY ="[{\"firstName\":\"John\",\"secondName\":\"Doe\",\"accountNumber\":\"1234\"}]";
		private static final String MOCK_OBJECT = "{\"firstName\":\"John\",\"secondName\":\"Doe\",\"accountNumber\":\"1234\"}";
		
		@Before
		public void setup()
		{
			accountControl.setManager(manager);
			util = new JSONUtil();
			accountControl.setUtil(util);
		}
				
		@Test
		public void testGetAllAccounts() {
			Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
			List<Account> accounts = new ArrayList<Account>();
			accounts.add(new Account("John", "Doe", "1234"));
			Mockito.when(query.getResultList()).thenReturn(accounts);
			Assert.assertEquals(MOCK_DATA_ARRAY, accountControl.getAllAccounts());
		}
		
		@Test
		public void testDeleteAccount() {
			
			
		}
		@Test
		public void testGetAccount() {
			
		}
		@Test
		public void testUpdateAccount() {
			
		}
	


}
