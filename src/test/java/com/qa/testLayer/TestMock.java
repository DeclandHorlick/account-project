package com.qa.testLayer;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.domain.Account;
import com.qa.repositoryLayer.Repository;
import com.qa.service.AccountService;

@RunWith(MockitoJUnitRunner.class)
public class TestMock 
{
	
		@InjectMocks
		private AccountService myAccountServices;

		@Mock
		private Repository accountService;


		@Test
		public void testCreateAccount() {
			myRepository.setService(accountService);
			Mockito.when(movieService.createMovie("test")).thenReturn("test output");
			Assert.assertEquals("test output", endPoint.addMovie("test"));
			Mockito.verify(movieService).createMovie("test");
			Mockito.verify(movieService, Mockito.never()).deleteMovie(1L);
		}
		
		@Test
		public void testDeleteAccount() {
			
			
		}
		@Test
		public void testGetAllAccount() {
			
		}
		@Test
		public void testUpdateAccount() {
			
		}
	


}
