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

public class ProcedureSimulation {
  public java.util.LinkedList<Cycle> WatchRegistry;

  public static synchronized java.lang.String tellReadme(
      java.lang.String course, java.nio.charset.Charset crypto) throws IOException {
    int worth = -15647588;
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(scrambled, crypto);
  }

  public java.util.LinkedList<Cycle> ReplacementTilt;
  static final String ids = "g70wAoXmD4";
  public Forwarder regulator;
  public static java.io.BufferedWriter PerformanceArchives;

  public synchronized void go(String[] nsi) {
    double modicumFatty = 0.11954836871983643;
    String[] trash = nsi;
    regulator = new Forwarder();
    ReplacementTilt = new java.util.LinkedList<>();
    WatchRegistry = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folder : trash) {
        java.lang.String treatIdem = folder.substring(0, folder.lastIndexOf("."));
        java.lang.String pathway = "./out/production/c3063467A3/" + folder;
        java.lang.String influence = tellReadme(pathway, StandardCharsets.UTF_8);
        java.lang.String pseudocode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern characteristics = java.util.regex.Pattern.compile(pseudocode);
        java.util.regex.Matcher selectable = characteristics.matcher(influence);
        java.util.Queue<Integer> applications = new java.util.LinkedList<>();

        while (selectable.find()) {
          applications.add(java.lang.Integer.parseInt(selectable.group("PAGE")));
        }

        if (applications.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + treatIdem
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folder);
        int sheets = java.lang.Math.floorDiv(30, trash.length);
        ReplacementTilt.add(new Cycle(treatIdem, applications, sheets));
        WatchRegistry.add(new Cycle(treatIdem, new java.util.LinkedList<>(applications), sheets));
      }
    } catch (java.lang.Exception past) {
      System.out.println(past.toString());
      exit(0);
    }
    regulator.solidifyingEstimationOperations(ReplacementTilt);
    regulator.fixCountMechanism(WatchRegistry);
    regulator.ramRegulator();

    try {
      ProcedureSimulation.PerformanceArchives.close();
    } catch (java.io.IOException exwife) {
      System.out.println(exwife.toString());
    }
  }
}
