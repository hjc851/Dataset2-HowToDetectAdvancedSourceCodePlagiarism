import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * c3063467A2P2
 *
 * Main program entry point
 * Gets input and passes to simulator
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class c3063467A2P2 {
    private static List<Customer> customers = new LinkedList<>();
    public static void main (String[] args) {
        // Init Input and Run
        P2Simulator sim;
        String input = "";

        if (args.length > 0) {
            for (String s : args) {
                input = s;
            }

            try {
                input = "./out/production/c3063467A2P2/" + input;
                input = readFile(input, StandardCharsets.UTF_8);

                // Setup Pattern and Matcher
                // Gets Arrival time, customer id and eat time for each customer
                String storeExp = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
                Pattern storePat = Pattern.compile(storeExp);
                Matcher storeMatcher = storePat.matcher(input);
                while(storeMatcher.find()) {
                    customers.add(new Customer(
                            Integer.parseInt(storeMatcher.group("Arrive")),
                            storeMatcher.group("Customer"),
                            Integer.parseInt(storeMatcher.group("Eat"))
                    ));
                }
            } catch (IOException ex) {
                System.out.println("");
            }
        }

        // Run program
        sim = new P2Simulator(customers);
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
