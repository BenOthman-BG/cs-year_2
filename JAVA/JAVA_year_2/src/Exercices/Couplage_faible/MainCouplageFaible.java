package Exercices.Couplage_faible;

public class MainCouplageFaible {
    public static void main(String[] args) {

        // هنا نختارو implementation
        EmailService emailService = new SmtpEmailService();
        // EmailService emailService = new FakeEmailService();

        UserService userService = new UserService(emailService);
        userService.registerUser();
    }
}
