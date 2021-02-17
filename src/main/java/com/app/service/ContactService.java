package com.app.service;

import java.util.List;

import com.app.model.Contact;

public interface ContactService {
	public Long getContactNumByName(String name);

	public List<Contact> getAllContacts();
}
