package miniP.contactDetails.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miniP.contactDetails.entity.ContactDetails;
import miniP.contactDetails.repository.ContactRepository;
import miniP.contactDetails.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public ContactDetails createcontact(ContactDetails contactDetails) {

		return contactRepository.save(contactDetails);
	}

	@Override
	public List<ContactDetails> getallcontacts() {

		return contactRepository.findAll();
	}

	@Override
	public ContactDetails getcontactbyid(Integer contactid) {

		Optional<ContactDetails> findbyid = contactRepository.findById(contactid);

		if (findbyid.isPresent()) {
			return findbyid.get();
		}

		return null;
	}

	@Override
	public String updatecontact(ContactDetails contactDetails) {

		if (contactRepository.existsById(contactDetails.getContactId()))
			contactRepository.save(contactDetails);

		return "updated successfully";
	}

	@Override
	public String deletecontact(Integer contactid) {

		if (contactRepository.existsById(contactid)) {
			contactRepository.deleteById(contactid);

			return "deleted";
		}
		return "id is not exist to delete";

	}
}
