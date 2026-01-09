package Exercices.Couplage_faible;

//Implementation 1
class SmtpEmailService implements EmailService {
 public void sendEmail() {
     System.out.println("Email sent using SMTP");
 }
}