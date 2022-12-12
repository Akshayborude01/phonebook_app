package miniP.contactDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miniP.contactDetails.entity.ContactDetails;

@Repository
public interface ContactRepository extends JpaRepository<ContactDetails, Integer> {

}
