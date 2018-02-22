package com.qa.repositoryLayer;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
public class Repository {
	
	    @PersistenceContext(unitName = "primary")
	    private EntityManager em;
	    
	    @Inject
	    private JSONUtil util;

	    public String getAllAccounts() 
	    {
	    	Query query = em.createQuery("Select a FROM Account a");
	    	Collection<Account> accounts = (Collection<Account>) query.getResultList();
	    	
	    	return util.getJSONForObject(accounts);
	    }
	    
	    
	    public String findAccount(Long id) 
	    {
	    	String myAc= util.getJSONForObject(em.find(Account.class, id));
	    	return myAc;
	    }

	    @Transactional(REQUIRED)
		public String createAccount(String accout) {
			Account anAccount = util.getObjectForJSON(accout, Account.class);
			em.persist(anAccount);
			return "{\"message\": \"account has been sucessfully added\"}";
		}
	    
	    @Transactional(REQUIRED)
		public String deleteAccount(Long id) {
			Account accountInDB = util.getObjectForJSON(findAccount(id), null);
			if (accountInDB != null) {
				em.remove(accountInDB);
			}
			return "{\"message\": \"account sucessfully deleted\"}";
		}
	 
		@Transactional(REQUIRED)
		public String updateAccount(Long id)//, String accountToUpdate) 
	    {
			//Account updatedAccount = util.getObjectForJSON(accountToUpdate, Account.class);
			//String updateAccount = util.getJSONForObject(updatedAccount);
			String accountFromDB = findAccount(id);
			//if (accountToUpdate != null) {
			//accountFromDB = updateAccount;
				
			     em.createQuery("update Account set firstName = \'king' where id=1")
			     .executeUpdate();
				
			//}
			return "{\"message\": \"account sucessfully updated\"}";
		}
	    
	    public void setManager(EntityManager manager) {
			this.em = manager;
		}

		public void setUtil(JSONUtil util) {
			this.util = util;
		}

	


}
