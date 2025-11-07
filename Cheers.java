//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase();
            int cheers = Integer.parseInt(args[1]);
            String specialLetters = "AEFHILMNORSX";

            for (int i = 0; i < name.length(); i++) {
                String addition = specialLetters.indexOf(name.charAt(i)) != -1 ? "an" : "a ";
                System.out.println("Give me " + addition + " " + name.charAt(i) + ": " + name.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < cheers; i++) {
                System.out.println(name + "!!!");
            }
        }
}
