package uteevbkru.service;

import java.util.List;
import uteevbkru.domain.Contact;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
