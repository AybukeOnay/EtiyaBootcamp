package business.abstracts;

import entities.User;

public interface NotificationService {
    void sendNotification(User user);
}
