package miniP.contactDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ContactDetails {

	@Id
	@GeneratedValue
	private int contactId;
	private String contactName;
	private String email;
	private int phoneNo;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public ContactDetails(int contactId, String contactName, String email, int phoneNo) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", contactName=" + contactName + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}

}
