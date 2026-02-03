package Metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditMetierImplTest {
	
	private IcreditMetier metier ;

	@Before
	public void setUp() throws Exception {
		metier = new CreditMetierImpl();
	}

	@Test
	public void testClaculerMesualiteCredit() {
		double capital = 200000;
		int duree = 240 ;
		double taux = 4.5 ;
		
		double resultatAttendu = 1265.2987;
		
		double resCalculer = metier.claculerMesualiteCredit(capital, taux, duree);
		
		assertEquals(resultatAttendu, resCalculer , 0.0001);
	}


}
