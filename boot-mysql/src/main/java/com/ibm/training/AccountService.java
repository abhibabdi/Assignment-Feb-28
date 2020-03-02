package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	AccountDao dao;

	public List<Account> getAll() {

		return dao.getAll();
	}

	public Account getAccountDetails(String accountNo) {

		return dao.getAccountDetails(accountNo);
	}

	public void updateAccountDetails(String accountNo, Account acc) {

		dao.updateAccountDetails(accountNo, acc);
	}

	public void deleteAccount(String accountNo) {

		dao.deleteAccount(accountNo);

	}

	public void addAccount(Account acc) {
		
		dao.addAccount(acc);
		
	}

}
