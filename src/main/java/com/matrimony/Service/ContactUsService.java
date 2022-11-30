package com.matrimony.Service;

import java.util.List;

import com.matrimony.Entity.ContactUs;

public interface ContactUsService {
ContactUs saveContactUs(ContactUs contactUs);
List<ContactUs> getAllContactUs();
ContactUs getContactUsById(long id);
ContactUs updateContactUs(ContactUs contactUs,long id);
void deleteContactUs(long id);

}