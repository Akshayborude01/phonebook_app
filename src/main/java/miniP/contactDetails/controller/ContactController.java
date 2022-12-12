package miniP.contactDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miniP.contactDetails.entity.ContactDetails;
import miniP.contactDetails.serviceImpl.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@PostMapping("/createcontact")
	public ContactDetails createcontact(@RequestBody ContactDetails contactDetails) {

		return contactServiceImpl.createcontact(contactDetails);
	}

	@GetMapping("/getallcontacts")
	public List<ContactDetails> getallcontacts() {

		return contactServiceImpl.getallcontacts();
	}

	@GetMapping("/getcontactbyid {contactid}")
	public ContactDetails getcontactbyid(@PathVariable Integer contactid) {

		return contactServiceImpl.getcontactbyid(contactid);
	}

	@PutMapping("/updatecontact")
	public String updatecontact(@RequestBody ContactDetails contactDetails) {

		return contactServiceImpl.updatecontact(contactDetails);
	}

	@DeleteMapping("/deletebyid {contactid}")
	public String deletecontact(@PathVariable Integer contactid) {

		return contactServiceImpl.deletecontact(contactid);

	}
}