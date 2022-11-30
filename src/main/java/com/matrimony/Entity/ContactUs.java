package com.matrimony.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactUs")
public class ContactUs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	    private String userName;
	    private String email;
	    private String subject;
	    
	    public ContactUs() {
	        super();
	        
	    }



	   public ContactUs(String userName, String email, String subject) {
	        super();
	        this.userName = userName;
	        this.email = email;
	        this.subject = subject;
	    }
	    
	    



	   public long getId() {
	        return id;
	    }



	   public void setId(long id) {
	        this.id = id;
	    }



	   public String getUserName() {
	        return userName;
	    }



	   public void setUserName(String userName) {
	        this.userName = userName;
	    }



	   public String getEmail() {
	        return email;
	    }



	   public void setEmail(String email) {
	        this.email = email;
	    }



	   public String getSubject() {
	        return subject;
	    }



	   public void setSubject(String subject) {
	        this.subject = subject;
	    }
	    
	    
	    

}
