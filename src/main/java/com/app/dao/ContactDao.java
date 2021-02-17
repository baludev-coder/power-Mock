package com.app.dao;

import java.util.List;

import com.app.model.Contact;

public interface ContactDao {

	public Long getContactNumByName(String name);

	public List<Contact> getAllContacts();

}
