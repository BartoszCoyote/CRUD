package pl.jedynakbartosz.crud.services;

import pl.jedynakbartosz.crud.model.Users;

public interface UserService {
    public void saveUser(Users user);

    public void delete(Users user);

    public Users[] findAll();

    public Users getUser(String ssn);
}
