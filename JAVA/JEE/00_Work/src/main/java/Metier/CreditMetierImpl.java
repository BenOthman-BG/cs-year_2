package Metier;

public class CreditMetierImpl implements IcreditMetier{

	@Override
	public double claculerMesualiteCredit(double capitale, double taux, int duree) {
		
	      double t=taux/100;
	      double t1 = capitale *t/12 ;
	      double t2=1-Math.pow(1+t/12, -duree);
	      
	      
	      return t1/t2;
		
		
	}
	

}
