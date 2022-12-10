package in.vinayit.service;

import java.util.List;

import in.vinayit.entity.Contact;

public interface ContactService {

	public List<Contact> getAllContacts();
	public String saveContact(Contact contact);
	public void deleteContact(Integer id);
	public Contact updateContact(Contact contact);
	public Contact getContactById(Integer id);
}
