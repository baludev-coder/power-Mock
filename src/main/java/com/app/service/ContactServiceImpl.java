package com.app.service;

import java.util.List;

import com.app.dao.ContactDao;
import com.app.model.Contact;

public class ContactServiceImpl implements ContactService {
	private  ContactDao contactDao;
	

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public Long getContactNumByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
