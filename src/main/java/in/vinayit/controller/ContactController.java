package in.vinayit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.vinayit.entity.Contact;
import in.vinayit.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/")
	public String getWelcomePage() {
		return "index";
	}

	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {

		return contactService.getAllContacts();
	}

	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		String status = contactService.saveContact(contact);
		return status;
	}

	@GetMapping("/contact/{contactId}")
	public Contact getContactById(@PathVariable Long contactId) {
		return contactService.getContactById(contactId);
	}

	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return contactService.updateContact(contact);
	}

	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable Long contactId) {
		return contactService.deleteContactById(contactId);
	}

}
