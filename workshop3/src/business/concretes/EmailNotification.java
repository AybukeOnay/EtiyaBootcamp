package business.concretes;

import business.abstracts.NotificationService;
import entities.concretes.User;

public class EmailNotification implements NotificationService {
    @Override
    public void register(User user) {
        System.out.println(user.getEmail() + ": Email ile kayit mesaji gonderildi");
    }

    @Override
    public void forgotPassword(User user) {
        System.out.println(user.getPassword() + ": Email ile sifre gonderildi");
    }
}
