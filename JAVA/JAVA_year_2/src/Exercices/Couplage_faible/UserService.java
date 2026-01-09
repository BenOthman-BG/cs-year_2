package Exercices.Couplage_faible;

//High-level class
class UserService {
 private EmailService emailService;

 // ✅ dependency تُعطى من الخارج
 public UserService(EmailService emailService) {
     this.emailService = emailService;
 }

 public void registerUser() {
     System.out.println("User registered");
     emailService.sendEmail();
 }
}