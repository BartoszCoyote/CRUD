package pl.jedynakbartosz.crud.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    public void persist(final Object entry) {
        getSession().persist(entry);
    }

    public void delete(final Object entry) {
        getSession().delete(entry);
    }

}
