package in.vinayit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vinayit.dao.ContactRepository;
import in.vinayit.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public List<Contact> getAllContacts() {
		return  (List<Contact>) contactRepository.findAll();
	}

	@Override
	public String saveContact(Contact contact) {
		contact = contactRepository.save(contact);
		if(contact.getId()!=null) {
			return "Contact Saved...!";
		}else {
			return "Contact Failed to save...!";
		}
		
	}

	@Override
	public String deleteContactById(Long id) {

		if(contactRepository.existsById(id)) {
			contactRepository.deleteById(id);
			return "Record deleted...!";
		}else {
			return "No record found...!";
		}
	}

	@Override
	public String updateContact(Contact contact) {
		if(contactRepository.existsById(contact.getId())) {
			contactRepository.save(contact);
			return "Update success...!";
		}else {
			return "No record found";
			
		}
	}

	@Override
	public Contact getContactById(Long id) {
		Optional<Contact> findById = contactRepository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	


}
