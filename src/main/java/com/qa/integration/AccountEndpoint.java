package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.domain.Account;
import com.qa.repositoryLayer.Repository;

@Path("/account")
public class AccountEndpoint 
{
	
	@Inject
	private Repository myRepo;
	
	@GET
	@Path("/json")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public String getAllAccounts() {
		return myRepo.getAllAccounts();
	}
	
	
	@GET
	@Path("/json/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public String findAccount(@PathParam("id") Long id)
	{
		return myRepo.findAccount(id);
	}
	
	@PUT
	@Path("/jsonupdate/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public String updateAccount(@PathParam("id") Long id)//,@PathParam("account") String account) 
	{
		return myRepo.updateAccount(id);
	}
	
	
	@DELETE
	@Path("/jsondelete/{id}")
	@Produces ({ MediaType.APPLICATION_JSON })
	@Consumes({MediaType.APPLICATION_JSON})
	public String deleteAccount(@PathParam("id") Long id) {
		return myRepo.deleteAccount(id);

	}
	
	@Path("/jsonadd")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public String addAccount(String account) {
		return myRepo.createAccount(account);
	}

	
}
