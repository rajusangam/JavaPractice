package com.test.demo;

import java.util.HashMap;
import java.util.Map;

/**

 * This service return account detail according to accountId Implement cache

 * inside service to make it faster

 */

//@Service

public class AccountService {

 
	

	/**

	 * @return account detail of this accountId

	 */

	public Account getAccountById(long accountId) {
		
		// From cache
		
		Account acc = fetchAccountFromRemoteServer(accountId);
		
		Map<Long, Account> myCacheMap = new HashMap<Long, Account>();
		myCacheMap.put(acc.getId(), acc);
		
		
		Account accFromRemote = myCacheMap.get(accountId);
		if (null != accFromRemote.getId()) {
			// I can use my Account Object to process further.
		}
		
		return accFromRemote;

}

 

	/**

	 * Call remote server to retrieve account detail of given id

	 */

	private Account fetchAccountFromRemoteServer(long accountId) {

		// assume there is code send http request and get http response

		// no need to write any code here

		
		return null;

	}

 
	//Return a list of account details matching the account IDs

		//Make it a fast lookup.

	 

		/*
		 * public List<Account> filterAccount(List<Long> accountIdList, List<Account>
		 * accountList) {
		 * 
		 * }
		 */
	
}

