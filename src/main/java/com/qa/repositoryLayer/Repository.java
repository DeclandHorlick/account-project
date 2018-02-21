package com.qa.repositoryLayer;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
public class Repository {
	
	    @PersistenceContext(unitName = "primary")
	    private EntityManager em;
	    
	    @Inject
	    private JSONUtil util;

	    public String getAccount(Long id) 
	    {
	    	Query query = em.createQuery("Select a FROM Account a");
	    	Collection<Account> accounts = (Collection<Account>) query.getResultList();
	    	
	    	return util.getJSONForObject(accounts);
	    	
	       // return em.find(Account.class, id);
	    }

	    @Transactional(TxType.REQUIRED)
	    public String createAccount(String newAcc) 
	    {
	        Account anAccount = util.getObjectForJSON(accounts,Account.class);
	    	em.persist(newAcc);
	        return newAcc;
	    }
	    
	    @Transactional(TxType.REQUIRED)
	    public void deleteAccount(Long id) 
	    {
	        em.remove(em.find(Account.class,id));
	        
	    }
	    
	    @Transactional(TxType.REQUIRED)
	    public void updateAccount(Long id,String newName) 
	    {
	    	Account repo = em.find(Account.class,id);
	        repo.setFirstName(newName);
	        System.out.println(repo.getFirstName());
	    }
	


}
