package in.vinayit.dao;

import org.springframework.data.repository.CrudRepository;

import in.vinayit.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>{
}
