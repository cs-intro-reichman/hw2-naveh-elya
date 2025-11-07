// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfTerms = Integer.parseInt(args[0]);
	    double piApproximation = 0.0;

	    for (int i = 0; i < numberOfTerms; i++) {
	        piApproximation += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
	    }
	    piApproximation *= 4;

		System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated:     " + piApproximation); 
	}
}
