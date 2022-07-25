package business.concretes;

import business.abstracts.NotificationService;
import entities.User;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println(user.getEmail() + ": Email notification");
    }
}
