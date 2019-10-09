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

public class FormalitiesDemo {

  private static synchronized String readerInitiate(String way, Charset coded) throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(way));
    return new String(decrypt, coded);
  }

  public static BufferedWriter ProductionFolder;

  public synchronized void operate(String[] supporters) {
    String[] feed = supporters;
    trainmaster = new Retailer();
    BestsellerDocket = new LinkedList<>();
    BackListings = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String register : feed) {
        String actIdentifier;
        String journey;
        String participation;
        String ascii;
        Pattern design;
        Matcher recognizer;
        Queue<Integer> orders;
        int aspects;
        actIdentifier = register.substring(0, register.lastIndexOf("."));
        journey = "./out/production/c3063467A3/" + register;
        participation = readerInitiate(journey, StandardCharsets.UTF_8);
        ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        design = Pattern.compile(ascii);
        recognizer = design.matcher(participation);
        orders = new LinkedList<>();

        while (recognizer.find()) {
          orders.add(Integer.parseInt(recognizer.group("PAGE")));
        }

        if (orders.size() > 50)
          throw new IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + register);
        aspects = Math.floorDiv(30, feed.length);
        BestsellerDocket.add(new Procedures(actIdentifier, orders, aspects));
        BackListings.add(new Procedures(actIdentifier, new LinkedList<>(orders), aspects));
      }
    } catch (Exception abdul) {
      System.out.println(abdul.toString());
      exit(0);
    }
    trainmaster.dictatedAssociatedWork(BestsellerDocket);
    trainmaster.orderedFrequencyMechanisms(BackListings);
    trainmaster.courseResponsible();

    try {
      FormalitiesDemo.ProductionFolder.close();
    } catch (IOException late) {
      System.out.println(late.toString());
    }
  }

  private Retailer trainmaster;
  private LinkedList<Procedures> BestsellerDocket;
  private LinkedList<Procedures> BackListings;
}
