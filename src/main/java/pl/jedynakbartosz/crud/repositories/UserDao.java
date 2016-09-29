package pl.jedynakbartosz.crud.repositories;

import pl.jedynakbartosz.crud.model.Users;

public interface UserDao {

    public void saveUser(Users user);

    public void delete(Users user);

    public Users[] findAll();

    public Users getUser(String ssn);

}
