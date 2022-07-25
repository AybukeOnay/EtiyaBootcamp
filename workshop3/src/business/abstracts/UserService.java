package business.abstracts;

import entities.User;

public interface UserService {
    void register(User user);
    void forgotPassword(User user);
}
