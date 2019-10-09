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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SueAnalog {
  public static BufferedWriter ProducerSubmitted = null;
  public LinkedList<Sue> FifoInclination = null;
  public LinkedList<Sue> ClockworkLean = null;
  public Plenum sender = null;

  public synchronized void endure(String[] cbs) {
    double primal = 0.294721926917321;
    String[] patch = cbs;
    sender = new Plenum();
    FifoInclination = new LinkedList<>();
    ClockworkLean = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ProducerSubmitted =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException officio) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String submit : patch) {
        String actIdentifier = submit.substring(0, submit.lastIndexOf("."));
        String avenue = "./out/production/c3063467A3/" + submit;
        String perspective = wrotePapers(avenue, UTF_8);
        String autocomplete = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern form = Pattern.compile(autocomplete);
        Matcher selectable = form.matcher(perspective);
        Queue<Integer> orders = new LinkedList<>();

        while (selectable.find()) {
          orders.add(Integer.parseInt(selectable.group("PAGE")));
        }

        if (orders.size() > 50)
          throw new IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + submit);
        int sections = Math.floorDiv(30, patch.length);
        FifoInclination.add(new Sue(actIdentifier, orders, sections));
        ClockworkLean.add(new Sue(actIdentifier, new LinkedList<>(orders), sections));
      }
    } catch (Exception adrian) {
      out.println(adrian.toString());
      exit(0);
    }
    sender.dictatedAssociatedWork(FifoInclination);
    sender.situatedSynchronizingMethodology(ClockworkLean);
    sender.outpouringPlenum();

    try {
      SueAnalog.ProducerSubmitted.close();
    } catch (IOException abbe) {
      out.println(abbe.toString());
    }
  }

  public static synchronized String wrotePapers(String road, Charset uncompressed)
      throws IOException {
    String symbol = "uV8PxWjM2Me";
    byte[] ciphered = Files.readAllBytes(Paths.get(road));
    return new String(ciphered, uncompressed);
  }

  public static String matter = "KFRijay80pHCyvWu";
}
