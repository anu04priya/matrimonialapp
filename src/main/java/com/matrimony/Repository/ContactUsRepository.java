package com.matrimony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.Entity.ContactUs;

@Repository
public interface ContactUsRepository  extends JpaRepository<ContactUs, Long>{
	 
}
