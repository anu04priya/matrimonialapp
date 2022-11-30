package com.matrimony.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimony.Entity.ContactUs;
import com.matrimony.Service.ContactUsService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ContactUsController {
	
	@Autowired
	 private ContactUsService contactUsService;
	
	public ContactUsController(ContactUsService contactUsService) {
		super();
		this.contactUsService = contactUsService;
	}
     
	        
	        @PostMapping("/addcontactus")
	        public ResponseEntity<ContactUs>saveContactUs(@Valid @RequestBody ContactUs contactUs) {
	            return new ResponseEntity<ContactUs>(contactUsService.saveContactUs(contactUs), HttpStatus.CREATED);
	            
	        }
	        
	        
	        @GetMapping("/getallcontactus")
	        public List<ContactUs> getAllContactUs(){
	            return contactUsService.getAllContactUs();
	        }
	        
	        @GetMapping("/getcontactus/{id}")
	        public ResponseEntity<ContactUs> getContactUsById(@PathVariable("id") long contactUsId){
	            return new ResponseEntity<ContactUs>(contactUsService.getContactUsById(contactUsId), HttpStatus.OK);
	            
	        }
	        
	        @PutMapping("/updatecontactus/{id}")
	        public ResponseEntity<ContactUs> updateContactUs(@Valid @PathVariable("id")long id ,@RequestBody ContactUs contactUs){
	            return new ResponseEntity<ContactUs>(contactUsService.updateContactUs(contactUs, id), HttpStatus.OK);
	            



	   }
}
