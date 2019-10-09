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

public class ServeAnalogue {

  public synchronized void campaign(String[] establishment) {
    String[] feedback = establishment;
    salesperson = new Distributors();
    HasNumber = new LinkedList<>();
    HourRoster = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException tipp) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String database : feedback) {
        String actIdentifier;
        String destiny;
        String suggestions;
        String emacs;
        Pattern behavior;
        Matcher randomizer;
        Queue<Integer> complaints;
        int sheets;
        actIdentifier = database.substring(0, database.lastIndexOf("."));
        destiny = "./out/production/c3063467A3/" + database;
        suggestions = readableArchiving(destiny, StandardCharsets.UTF_8);
        emacs = "[\\r\\n]+(?<PAGE>[\\d]+)";
        behavior = Pattern.compile(emacs);
        randomizer = behavior.matcher(suggestions);
        complaints = new LinkedList<>();

        while (randomizer.find()) {
          complaints.add(Integer.parseInt(randomizer.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + database);
        sheets = Math.floorDiv(30, feedback.length);
        HasNumber.add(new Methodology(actIdentifier, complaints, sheets));
        HourRoster.add(new Methodology(actIdentifier, new LinkedList<>(complaints), sheets));
      }
    } catch (Exception libris) {
      System.out.println(libris.toString());
      exit(0);
    }
    salesperson.arrangedFifoAct(HasNumber);
    salesperson.prepareDialMethodologies(HourRoster);
    salesperson.testDistributors();

    try {
      ServeAnalogue.QuantityBinder.close();
    } catch (IOException voto) {
      System.out.println(voto.toString());
    }
  }

  private Distributors salesperson = null;
  public static BufferedWriter QuantityBinder = null;

  private static synchronized String readableArchiving(String pathways, Charset code)
      throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(pathways));
    return new String(formatted, code);
  }

  private LinkedList<Methodology> HasNumber = null;
  private LinkedList<Methodology> HourRoster = null;
}
