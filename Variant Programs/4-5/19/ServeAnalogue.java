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

public class ServeAnalogue {
  private static final int synX1242int = 0;
  private static final int synX1241int = 30;
  private static final String synX1240String = "Finished reading file: ";
  private static final String synX1239String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1238String = "Process: ";
  private static final int synX1237int = 50;
  private static final String synX1236String = "PAGE";
  private static final String synX1235String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1234String = "./out/production/c3063467A3/";
  private static final String synX1233String = ".";
  private static final int synX1232int = 0;
  private static final String synX1231String = "Unable to generate output file.";
  private static final String synX1230String = "./out/production/c3063467A3/output.txt";
  private static final String synX1229String = "Reading in input file(s)...";
  private static final int synX1228int = -518821657;
  private static final String synX1227String = "";

  public static synchronized java.lang.String scanFolders(
      java.lang.String track, java.nio.charset.Charset keying) throws IOException {
    String maximumBreadth;
    maximumBreadth = synX1227String;
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(demodulated, keying);
  }

  public static java.io.BufferedWriter PowerApplication;

  public synchronized void extend(String[] proponents) {
    int upwardMaximum;
    upwardMaximum = synX1228int;
    String[] assistance = proponents;
    trainmaster = new Exporter();
    AverageRoster = new java.util.LinkedList<>();
    DayCatalog = new java.util.LinkedList<>();
    out.println(synX1229String);

    try {
      PowerApplication =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX1230String));
    } catch (java.io.IOException con) {
      out.println(synX1231String);
    }

    try {
      for (java.lang.String submitted : assistance) {
        java.lang.String proceedingsUser;
        java.lang.String approach;
        java.lang.String influence;
        java.lang.String emacs;
        java.util.regex.Pattern paradigm;
        java.util.regex.Matcher algorithm;
        java.util.Queue<Integer> orders;
        int webpage;
        proceedingsUser = submitted.substring(synX1232int, submitted.lastIndexOf(synX1233String));
        approach = synX1234String + submitted;
        influence = scanFolders(approach, UTF_8);
        emacs = synX1235String;
        paradigm = java.util.regex.Pattern.compile(emacs);
        algorithm = paradigm.matcher(influence);
        orders = new java.util.LinkedList<>();

        while (algorithm.find()) {
          orders.add(java.lang.Integer.parseInt(algorithm.group(synX1236String)));
        }

        if (orders.size() > synX1237int)
          throw new java.io.IOException(synX1238String + proceedingsUser + synX1239String);

        out.println(synX1240String + submitted);
        webpage = java.lang.Math.floorDiv(synX1241int, assistance.length);
        AverageRoster.add(new Work(proceedingsUser, orders, webpage));
        DayCatalog.add(new Work(proceedingsUser, new java.util.LinkedList<>(orders), webpage));
      }
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
      exit(synX1242int);
    }
    trainmaster.arrangedFifoAct(AverageRoster);
    trainmaster.laidStopwatchOperation(DayCatalog);
    trainmaster.workForwarder();

    try {
      ServeAnalogue.PowerApplication.close();
    } catch (java.io.IOException admittedly) {
      out.println(admittedly.toString());
    }
  }

  static final int upperSkank = -436645126;
  public java.util.LinkedList<Work> AverageRoster;
  public Exporter trainmaster;
  public java.util.LinkedList<Work> DayCatalog;
}
