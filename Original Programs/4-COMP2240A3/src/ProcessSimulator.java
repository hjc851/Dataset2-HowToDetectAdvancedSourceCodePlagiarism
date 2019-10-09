import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * ProcessSimulator Class
 * ProcessSimulator.java
 * Last Modified: 26/10/2016
 */
public class ProcessSimulator {
    private LinkedList<Process> LRU_List;
    private LinkedList<Process> CLOCK_List;
    private Dispatcher dispatcher;

    public static BufferedWriter OUTPUT_FILE;

    /**
     * run()
     * Main program interface
     */
    public void run(String[] in) {
        String[] input_files = in;

        // Init Processes and dispatcher
        dispatcher = new Dispatcher();
        LRU_List = new LinkedList<>();
        CLOCK_List = new LinkedList<>();

        // Begin by reading in processes from supplied file
        System.out.println("Reading in input file(s)...");

        // Setup Output file
        try {
            OUTPUT_FILE = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
        } catch (IOException ex) {
            System.out.println("Unable to generate output file.");
        }

        // Alter input to Project path
            try {
                for (String file : input_files) {
                    String processId = file.substring(0, file.lastIndexOf("."));
                    String path = "./out/production/c3063467A3/" + file;
                    String input = readFile(path, StandardCharsets.UTF_8);
                    // Setup Pattern and Matcher
                    String regex = "[\\r\\n]+(?<PAGE>[\\d]+)";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(input);

                    // Iterate through each pattern found, creating Processes as we go
                    Queue<Integer> requests = new LinkedList<>();
                    while (matcher.find()) {
                        requests.add(Integer.parseInt(matcher.group("PAGE")));
                    }
                    if (requests.size() > 50) throw new IOException("Process: " + processId + " - request count exceeds the allowed 50! Please check input files and try again.");
                    System.out.println("Finished reading file: " + file);
                    // Add process to process list
                    int pages = Math.floorDiv(30, input_files.length);
                    LRU_List.add(new Process(processId, requests, pages));
                    CLOCK_List.add(new Process(processId, new LinkedList<>(requests), pages));
                }
            }
            catch (Exception ex){
                System.out.println(ex.toString());
                exit(0);
            }

        // Store send processes to Dispatcher
        dispatcher.setLRUProcesses(LRU_List);
        dispatcher.setClockProcesses(CLOCK_List);
        // Now processes are stored, we can run simulations
        dispatcher.runDispatcher();

        // Close Output file
        try {
            ProcessSimulator.OUTPUT_FILE.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
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
