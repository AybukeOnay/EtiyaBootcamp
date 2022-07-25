package business.concretes;

import business.abstracts.NotificationService;
import entities.concretes.User;

public class SmsNotification implements NotificationService {
    @Override
    public void register(User user) {
        System.out.println(user.getEmail() + ": Sms ile kayit mesaji gonderildi");
    }

    @Override
    public void forgotPassword(User user) {
        System.out.println(user.getPassword() + ": Sms ile sifre gonderildi");
    }
}
