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
  private static final int synX1014int = 0;
  private static final int synX1013int = 30;
  private static final String synX1012String = "Finished reading file: ";
  private static final String synX1011String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1010String = "Process: ";
  private static final int synX1009int = 50;
  private static final String synX1008String = "PAGE";
  private static final String synX1007String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1006String = "./out/production/c3063467A3/";
  private static final String synX1005String = ".";
  private static final int synX1004int = 0;
  private static final String synX1003String = "Unable to generate output file.";
  private static final String synX1002String = "./out/production/c3063467A3/output.txt";
  private static final String synX1001String = "Reading in input file(s)...";
  public Vendor yardmaster = null;

  public synchronized void lead(String[] advocates) {
    String[] feed = advocates;
    yardmaster = new Vendor();
    BalancersDirectory = new java.util.LinkedList<>();
    StopwatchName = new java.util.LinkedList<>();
    out.println(synX1001String);

    try {
      GdpDatabase = java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX1002String));
    } catch (java.io.IOException post) {
      out.println(synX1003String);
    }

    try {
      for (java.lang.String document : feed) {
        java.lang.String sueIbid;
        java.lang.String track;
        java.lang.String stimulus;
        java.lang.String pathname;
        java.util.regex.Pattern method;
        java.util.regex.Matcher recognizer;
        java.util.Queue<Integer> requirements;
        int sheets;
        sueIbid = document.substring(synX1004int, document.lastIndexOf(synX1005String));
        track = synX1006String + document;
        stimulus = interpretLodge(track, UTF_8);
        pathname = synX1007String;
        method = java.util.regex.Pattern.compile(pathname);
        recognizer = method.matcher(stimulus);
        requirements = new java.util.LinkedList<>();

        while (recognizer.find()) {
          requirements.add(java.lang.Integer.parseInt(recognizer.group(synX1008String)));
        }

        if (requirements.size() > synX1009int)
          throw new java.io.IOException(synX1010String + sueIbid + synX1011String);

        out.println(synX1012String + document);
        sheets = java.lang.Math.floorDiv(synX1013int, feed.length);
        BalancersDirectory.add(new Proceeding(sueIbid, requirements, sheets));
        StopwatchName.add(
            new Proceeding(sueIbid, new java.util.LinkedList<>(requirements), sheets));
      }
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
      exit(synX1014int);
    }
    yardmaster.arrangedFifoAct(BalancersDirectory);
    yardmaster.primedSyncAppendage(StopwatchName);
    yardmaster.workForwarder();

    try {
      SueAnalog.GdpDatabase.close();
    } catch (java.io.IOException libris) {
      out.println(libris.toString());
    }
  }

  public static java.io.BufferedWriter GdpDatabase = null;
  public java.util.LinkedList<Proceeding> StopwatchName = null;
  public java.util.LinkedList<Proceeding> BalancersDirectory = null;

  public static synchronized java.lang.String interpretLodge(
      java.lang.String roadway, java.nio.charset.Charset code) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(codified, code);
  }
}
