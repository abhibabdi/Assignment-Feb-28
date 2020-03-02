package com.ibm.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

	@Autowired
	JdbcTemplate template;

	public List<Account> getAll() {

		return template.query("select * from userdetails", new UserMapper());
	}

	class UserMapper implements RowMapper<Account> {

		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account acc = new Account();
			acc.setAccountNo(rs.getString("accountNo"));
			acc.setUserName(rs.getString("userName"));
			acc.setAddress(rs.getString("address"));
			acc.setPhoneNo(rs.getString("phoneNo"));
			acc.setBalance(rs.getInt("balance"));
			return acc;
		}

	}

	public Account getAccountDetails(String accountNo) {

		return template.queryForObject("select * from userdetails where accountNo = ?", new Object[] { accountNo },
				new UserMapper());
	}

	public void updateAccountDetails(String accountNo, Account acc) {

		template.update("update userdetails set userName = ? , address = ? , phoneNo = ? where accountNo = ?",
				new Object[] { acc.getUserName(), acc.getAddress(), acc.getPhoneNo(), acc.getAccountNo() });

	}

	public void deleteAccount(String accountNo) {

		template.update("delete from userdetails where accountNo = ?", new Object[] { accountNo });

	}

	public void addAccount(Account acc) {

       template.update("insert into userdetails values(?,?,?,?,?)",new Object[] {acc.getUserName(),acc.getAccountNo(), acc.getAddress(), acc.getPhoneNo(), acc.getBalance()});
		
	}

}
