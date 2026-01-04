package TPs.Tp_1;

public class ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int i = 2;
        int n = 1;
        double S = 1;
        while (Math.abs(S - 1.33) > 0.01) {

            if (i % 2 == 0) {
                S = S + 1.0 / i;
                i++;
            } else {
                S = S - 1.0 / i;
                i++;
            }
            n++;
            System.out.println(S);

        }
        System.out.println(S);
        System.out.println(n);


	}

}
