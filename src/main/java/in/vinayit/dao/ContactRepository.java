package in.vinayit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.vinayit.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>{
	List<Contact> findByName(String name);
}
