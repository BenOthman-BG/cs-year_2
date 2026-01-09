package Exercices.Couplage_faible;

//Implementation 2 (مثلاً للتجربة)
class FakeEmailService implements EmailService {
 public void sendEmail() {
     System.out.println("Fake email (for testing)");
 }
}