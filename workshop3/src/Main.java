import business.concretes.EmailNotification;
import business.concretes.SmsNotification;
import business.concretes.UserManager;
import dataAccess.abstracts.DataRepository;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Aybuke","Onay","aybuke@gmail.com","1234");
        User user2 = new User(2,"Gonca","Bal","gonca@gmail.com","1234");
       UserManager userManager = new UserManager(new UserRepository(),new SmsNotification());
        UserManager userManager2 = new UserManager(new UserRepository(),new EmailNotification());
       userManager.add(user1);
       userManager2.add(user2);
       //userManager.getAll();
       //userManager.forgotPassword(user1);
    }
}
