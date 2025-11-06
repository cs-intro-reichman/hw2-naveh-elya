// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int heightSeed = Integer.parseInt(args[0]);
		String mode = args[1];

		int current = 1;
		int steps = 0;
		for (int i = 1; i < heightSeed + 1; i++) {

			do {
				steps++;
				if (mode.equals("v")) {
					System.out.print(current + " ");
				}

				if (current % 2 == 0) {
					current = current / 2;
				} else {
					current = 3 * current + 1;
				}

			} while (current != 1);
			if (mode.equals("v")) {
				System.out.println("1 " + "(" + steps + ")");
			}
			steps = 0;
			current = i + 1;
		}

		System.out.println("Every one of the first " + heightSeed + " hailstone sequences reached 1.");
	}
}
