import business.concretes.EmailNotification;
import business.concretes.UserManager;
import entities.User;

public class Main {
    public static void main(String[] args) {

        User user1=new User(1,"Aybuke","Onay","aybuke@gmail.com","1234");
        UserManager userManager = new UserManager(new EmailNotification());
        userManager.forgotPassword(user1);
    }
}
