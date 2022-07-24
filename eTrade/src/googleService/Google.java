package googleService;

public class Google {
    public void checkIfGmailExists(String email)
    {
        if(email.contains("gmail"))
        {
            System.out.println("logged in with gmail");
        }
        else
            System.out.println("gmail is not exist");
    }
}
