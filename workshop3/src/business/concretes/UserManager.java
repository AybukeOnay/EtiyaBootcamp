package business.concretes;

import business.abstracts.NotificationService;
import business.abstracts.UserService;
import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    List<User> users=new ArrayList<>();
    NotificationService notificationService;

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void register(User user){
        users.add(user);
        notificationService.sendNotification(user);
        System.out.println("Kullanici kaydedildi");
    }

    public void forgotPassword(User user){
        notificationService.sendNotification(user);
        System.out.println("Yeni parola gonderildi");
    }
}
