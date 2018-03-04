package com.cof.service;

public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.cof.service.CustomerService#handleLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean handleLogin(String userName, String password) {
		boolean loginFlag = false;
		
		// login validation logic
		if(userName.equals("user1") && password.equals("12345")) {
			loginFlag = true;
		}
				
		return loginFlag;
	}
}
