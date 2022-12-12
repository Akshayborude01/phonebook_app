package miniP.contactDetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import miniP.contactDetails.entity.ContactDetails;

//@Service
public interface ContactService {

	public ContactDetails createcontact(ContactDetails contactDetails);

	public List<ContactDetails> getallcontacts();

	public ContactDetails getcontactbyid(Integer contactid);

	public String updatecontact(ContactDetails contactDetails);
	
	public String deletecontact(Integer contactid);
	
	
}
