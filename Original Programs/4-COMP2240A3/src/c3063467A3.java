/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * c3063467A3 Class
 * c3063467A3.java
 * Last Modified: 26/10/2016
 */
public class c3063467A3 {
    /**
     * Main Java entry point
     *
     * @param args
     */
    public static void main(String[] args) {
        // Pull input param and store statically
        if (args.length < 1) {
            System.out.println("Error: No input file provided. Please run again with a input param.");
        } else {
            // Run the dispatcher
            ProcessSimulator program = new ProcessSimulator();
            program.run(args);

        }
    }
}
