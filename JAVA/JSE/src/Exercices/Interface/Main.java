package Exercices.Interface;

public class Main {

	public static void main(String[] args) {
		
		I_print p1 = new Printer1();
		p1.print_();
		
		I_scan s1 = new Scanner1();
		s1.scan_();
		
		// IN this situation for using print -> 
		I_print p2 = new Printer_Scanner();
		p2.print_();
		
		//for using scan -> 
		I_scan s2 = new Printer_Scanner();
		s2.scan_();

	}

}
