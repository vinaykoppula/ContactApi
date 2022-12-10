package in.vinayit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.vinayit.dao.ContactRepository;
import in.vinayit.entity.Contact;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public List<Contact> getAllContacts() {
		return (List<Contact>) contactRepository.findAll();
	}

	@Override
	public String saveContact(Contact contact) {
		return null;
	}

	@Override
	public void deleteContact(Integer id) {
		
	}

	@Override
	public Contact updateContact(Contact contact) {
		return null;
	}

	@Override
	public Contact getContactById(Integer id) {
		return null;
	}

}
