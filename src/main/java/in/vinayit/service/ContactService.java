package in.vinayit.service;

import java.util.List;

import in.vinayit.entity.Contact;

public interface ContactService {

	public List<Contact> getAllContacts();
	public String saveContact(Contact contact);
	public String updateContact(Contact contact);
	public 	Contact getContactById(Long id);
	public String deleteContactById(Long id);
}
