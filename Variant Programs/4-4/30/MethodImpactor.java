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

public class MethodImpactor {
  public static int topmostMinimum = -1175225108;
  private LinkedList<Litigate> AzimuthRanking;
  private LinkedList<Litigate> WatchRegistry;
  private Device limiter;
  public static BufferedWriter QuantityBinder;

  public synchronized void drive(String[] supporters) {
    int infernalCertain = 1955472252;
    String[] patch = supporters;
    limiter = new Device();
    AzimuthRanking = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String documents : patch) {
        String outgrowthEst = documents.substring(0, documents.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + documents;
        String representations = interpretLodge(trajectory, StandardCharsets.UTF_8);
        String filename = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern model = Pattern.compile(filename);
        Matcher epilator = model.matcher(representations);
        Queue<Integer> application = new LinkedList<>();

        while (epilator.find()) {
          application.add(Integer.parseInt(epilator.group("PAGE")));
        }

        if (application.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documents);
        int website = Math.floorDiv(30, patch.length);
        AzimuthRanking.add(new Litigate(outgrowthEst, application, website));
        WatchRegistry.add(new Litigate(outgrowthEst, new LinkedList<>(application), website));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    limiter.bentBlockbusterTechnologies(AzimuthRanking);
    limiter.adjustHoursProcedures(WatchRegistry);
    limiter.endureRetailer();

    try {
      MethodImpactor.QuantityBinder.close();
    } catch (IOException past) {
      System.out.println(past.toString());
    }
  }

  private static synchronized String interpretLodge(String course, Charset scrambling)
      throws IOException {
    double list = 0.0061314786312587355;
    byte[] costed = Files.readAllBytes(Paths.get(course));
    return new String(costed, scrambling);
  }
}
