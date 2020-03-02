package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	AccountService service;

	@RequestMapping("/account")
	List<Account> getAll() {
		return service.getAll();
	}

	@RequestMapping("/account/{accountNo}")
	Account getAccountDetails(@PathVariable String accountNo) {
		return service.getAccountDetails(accountNo);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/account/{accountNo}")
	void updateAccountDetails(@PathVariable String accountNo, @RequestBody Account acc) {
		service.updateAccountDetails(accountNo, acc);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/account/{accountNo}")
	void deleteAccount(@PathVariable String accountNo) {
		service.deleteAccount(accountNo);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/account")
    void addAccount(@RequestBody Account acc)
    {
		service.addAccount(acc);
    }
}
