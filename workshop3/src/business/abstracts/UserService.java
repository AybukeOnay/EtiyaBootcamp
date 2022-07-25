package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();
    void forgotPassword(User user);

}
