package business.abstracts;

import entities.concretes.User;

public interface NotificationService {
    void register(User user);
    void forgotPassword(User user);
}
