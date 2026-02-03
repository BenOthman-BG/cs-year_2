package Exercices.Couplage_fort;

//High-level class
class UserService {
 private EmailService emailService;

 public UserService() {
     // ❌ هنا المشكل: UserService كيصايب EmailService بيده
     emailService = new EmailService();
 }

 public void registerUser() {
     System.out.println("User registered");
     emailService.sendEmail();
 }
}