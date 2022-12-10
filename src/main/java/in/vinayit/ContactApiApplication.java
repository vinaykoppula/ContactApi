package in.vinayit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.vinayit.dao.ContactRepository;
import in.vinayit.entity.Contact;

@SpringBootApplication
public class ContactApiApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ContactApiApplication.class);
	
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactApiApplication.class, args);
	}
	
	public void run(String... args) {
		log.info("Starting application...");
		
		contactRepository.save(new Contact("Java"));
		contactRepository.save(new Contact("Node"));
		contactRepository.save(new Contact("Python"));
		
		
		
	}

}
