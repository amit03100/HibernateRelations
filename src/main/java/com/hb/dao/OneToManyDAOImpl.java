package com.hb.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.domain.PhoneNumber;
import com.hb.domain.User;
import com.hb.utility.HibernateUtils;

public class OneToManyDAOImpl implements OneToManyDAO{

	public void saveData() {
		
		Session ses = HibernateUtils.getSession();
		Transaction txn = null;
		
		User user = new User();
		user.setUserId(101);
		user.setFirstName("abc");
		
		PhoneNumber ph = new PhoneNumber();
		ph.setPhone(987654321);
		ph.setNumberType("office");
		
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhone(998877665);
		ph1.setNumberType("work");
		
		List<PhoneNumber> phoneList = new ArrayList<PhoneNumber>();
		phoneList.add(ph);
		phoneList.add(ph1);
		
		user.setPhones(phoneList);
		
		txn = ses.beginTransaction();
		
		ses.save(user);
		txn.commit();
		
		HibernateUtils.closeSession(ses);
		
		
	}

	public void loadData() {
		// TODO Auto-generated method stub
		
	}

}
