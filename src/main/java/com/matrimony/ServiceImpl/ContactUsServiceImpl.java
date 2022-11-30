package com.matrimony.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimony.Entity.ContactUs;
import com.matrimony.Exception.ResourceNotFoundException;
import com.matrimony.Repository.ContactUsRepository;
import com.matrimony.Service.ContactUsService;


@Service
public class ContactUsServiceImpl implements ContactUsService{
	
	@Autowired
    private ContactUsRepository contactUsRepository;
    
    
   public ContactUsServiceImpl(ContactUsRepository contactUsRepository) {
        super();
        this.contactUsRepository = contactUsRepository;
    }



   @Override
   public ContactUs saveContactUs(ContactUs contactUs) {
       return contactUsRepository.save(contactUs);
   }



  @Override
   public List<ContactUs> getAllContactUs() {
       return contactUsRepository.findAll() ;
   }
   
   @Override
   public ContactUs getContactUsById(long id) {
       
       return contactUsRepository.findById(id).orElseThrow(() ->
                       new ResourceNotFoundException("ContactUs","Id",id));
           
       }




   @Override
   public ContactUs updateContactUs(ContactUs contactUs, long id) {
       ContactUs contact = contactUsRepository.findById(id).orElseThrow(
               ()-> new ResourceNotFoundException("ContactUs", "Id", id));
       
       contact.setUserName(contact.getUserName());
       contact.setEmail(contact.getEmail());
       contact.setSubject(contact.getSubject());
       
       contactUsRepository.save(contact);
       return contact;
   }



  @Override
   public void deleteContactUs(long id) {
       contactUsRepository.findById(id).orElseThrow(() ->
               new ResourceNotFoundException("ContactUs","Id",id));
            contactUsRepository.deleteById(id);



}

}
