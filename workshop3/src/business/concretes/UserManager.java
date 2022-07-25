package business.concretes;

import business.abstracts.NotificationService;
import business.abstracts.UserService;
import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    DataRepository<User> dataRepository;
    NotificationService notificationService;

    public UserManager(DataRepository<User> dataRepository, NotificationService notificationService) {
        this.dataRepository = dataRepository;
        this.notificationService = notificationService;
    }

    @Override
    public void add(User user) {
        dataRepository.add(user);
        notificationService.register(user);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        for (User user : dataRepository.getAll()) {
            System.out.println(user.getFirstName());

        }
        return dataRepository.getAll();
    }

    @Override
    public void forgotPassword(User user) {
        notificationService.forgotPassword(user);
        System.out.println("Kullanici sifre ekranina yonlendirildi");
    }

}
