package pl.jedynakbartosz.crud.repositories;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import pl.jedynakbartosz.crud.model.Users;

import java.util.List;

@Repository("userDaoImpl")
public class UserDaoImpl extends AbstractDao implements UserDao {

    public void saveUser(final Users user) {
        persist(user);
    }

    public void delete(final Users user) {
        final Query query = getSession().createSQLQuery("delete from User where ssn = :ssn");
        query.setString("ssn", user.getSsn());
        query.executeUpdate();
    }

    public Users[] findAll() {
        final Criteria criteria = getSession().createCriteria(Users.class);

        final int size = criteria.list().size();
        final List<Users> list = (List<Users>) criteria.list();
        return list.toArray(new Users[size]);
    }

    public Users getUser(final String ssn) {
        final Criteria criteria = getSession().createCriteria(Users.class);
        return (Users) criteria.uniqueResult();
    }

}
