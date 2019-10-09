import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * c3063467A2P1
 *
 * Main program entry point
 * Gets input and passes to simulator
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class c3063467A2P1 {
    private static Scanner console = new Scanner(System.in);

    public static void main (String[] args) {
        // Init Input and Run
        P1Simulator sim;
        String input = "";
        int northInput = -1;
        int southInput = -1;

        if (args.length > 0) {
            for (String s : args) {
                input = s;
            }

            try {
                input = "./out/production/c3063467A2P1/" + input;
                input = readFile(input, StandardCharsets.UTF_8);

                // Setup Pattern and Matcher
                // North Input
                String northExp = "N=(?<North>[\\d]+)";
                Pattern northPattern = Pattern.compile(northExp);
                Matcher northMatcher = northPattern.matcher(input);
                while(northMatcher.find()) {
                    northInput = Integer.parseInt(northMatcher.group("North"));
                }

                // South Input
                String southExp = "S=(?<South>[\\d]+)";
                Pattern southPattern = Pattern.compile(southExp);
                Matcher southMatcher = southPattern.matcher(input);
                while(southMatcher.find()) {
                    southInput = Integer.parseInt(southMatcher.group("South"));
                }
            } catch (IOException ex) {
                System.out.println("");
            }
        }

        // Validate input
        while (northInput < 0 || southInput < 0) {
            System.out.println("Oops some of those input values were invalid, lets try again.");
            System.out.println("Enter the number of North Island Farmers to initialize:");
            northInput = console.nextInt();
            System.out.println("Enter the number of South Island Farmers to initialize:");
            southInput = console.nextInt();
        }

        // Run program
        sim = new P1Simulator(northInput, southInput);
        System.out.println("main: Start main");
        sim.begin();
    }

    /**
     * Private helper function to read in file
     * @param path
     * @param encoding
     * @return
     * @throws IOException
     */
    private static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
