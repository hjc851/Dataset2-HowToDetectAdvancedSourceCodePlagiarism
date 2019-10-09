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

public class SystemSim {
  private LinkedList<Sue> BestsellerDocket = null;
  private LinkedList<Sue> TimerInclination = null;
  private Forwarder originator = null;
  public static BufferedWriter AmperageSubmitting = null;

  public synchronized void outpouring(String[] incumbents) {
    String[] ante = incumbents;
    originator = new Forwarder();
    BestsellerDocket = new LinkedList<>();
    TimerInclination = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      AmperageSubmitting =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String submitted : ante) {
        String summonsIdentification = submitted.substring(0, submitted.lastIndexOf("."));
        String roadway = "./out/production/c3063467A3/" + submitted;
        String stimulant = wrotePapers(roadway, StandardCharsets.UTF_8);
        String xml = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern phenomenon = Pattern.compile(xml);
        Matcher keyword = phenomenon.matcher(stimulant);
        Queue<Integer> proposals = new LinkedList<>();

        while (keyword.find()) {
          proposals.add(Integer.parseInt(keyword.group("PAGE")));
        }

        if (proposals.size() > 50)
          throw new IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitted);
        int sheets = Math.floorDiv(30, ante.length);
        BestsellerDocket.add(new Sue(summonsIdentification, proposals, sheets));
        TimerInclination.add(new Sue(summonsIdentification, new LinkedList<>(proposals), sheets));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(0);
    }
    originator.putHasProcedure(BestsellerDocket);
    originator.dictatedClockworkWork(TimerInclination);
    originator.bleedOriginator();

    try {
      SystemSim.AmperageSubmitting.close();
    } catch (IOException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  private static synchronized String wrotePapers(String journey, Charset demodulation)
      throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(journey));
    return new String(cryptographic, demodulation);
  }
}
