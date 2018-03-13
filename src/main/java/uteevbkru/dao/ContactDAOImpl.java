package uteevbkru.dao;

import uteevbkru.domain.Contact;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uteevbkru.hibernate.HibernateService;

import java.util.List;

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    //private HibernateService hibernateService = HibernateService.getInstance();

    //public void addContact(Contact contact) {
    //    hibernateService.getSession().save(contact);
    //}

    //@SuppressWarnings("unchecked")
//    public List<Contact> listContact() {
//
//        return hibernateService.getSession().createQuery("from Contact")
//                .list();
//    }

//    public void removeContact(Integer id) {
//        Contact contact = (Contact) hibernateService.getSession().load(
//                Contact.class, id);
//        if (null != contact) {
//            hibernateService.getSession().delete(contact);
//        }
//
//    }

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
    }
}