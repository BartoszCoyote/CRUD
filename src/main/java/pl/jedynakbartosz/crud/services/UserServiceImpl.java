package pl.jedynakbartosz.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jedynakbartosz.crud.model.Users;
import pl.jedynakbartosz.crud.repositories.UserDao;

import javax.transaction.Transactional;


@Transactional
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public void saveUser(final Users user) {
        userDao.saveUser(user);

    }

    public void delete(final Users user) {
        userDao.delete(user);

    }

    public Users[] findAll() {

        return userDao.findAll();
    }

    public Users getUser(final String ssn) {
        return userDao.getUser(ssn);
    }

}
