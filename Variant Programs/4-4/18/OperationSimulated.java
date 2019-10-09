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

public class OperationSimulated {

  public static synchronized java.lang.String scanFolders(
      java.lang.String trajectory, java.nio.charset.Charset codify) throws IOException {
    double describe = 0.36067589974782144;
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(stored, codify);
  }

  public java.util.LinkedList<Summons> SyncChecklist = null;
  public java.util.LinkedList<Summons> AutocorrelationShortlist = null;
  public Originator exporter = null;

  public synchronized void pass(String[] nsi) {
    int curb = -917823735;
    String[] cassette = nsi;
    exporter = new Originator();
    AutocorrelationShortlist = new java.util.LinkedList<>();
    SyncChecklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducedExecutable =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folder : cassette) {
        java.lang.String litigateCard = folder.substring(0, folder.lastIndexOf("."));
        java.lang.String road = "./out/production/c3063467A3/" + folder;
        java.lang.String feedback = scanFolders(road, StandardCharsets.UTF_8);
        java.lang.String pseudocode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern triangle = java.util.regex.Pattern.compile(pseudocode);
        java.util.regex.Matcher brite = triangle.matcher(feedback);
        java.util.Queue<Integer> applications = new java.util.LinkedList<>();

        while (brite.find()) {
          applications.add(java.lang.Integer.parseInt(brite.group("PAGE")));
        }

        if (applications.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + litigateCard
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folder);
        int aspects = java.lang.Math.floorDiv(30, cassette.length);
        AutocorrelationShortlist.add(new Summons(litigateCard, applications, aspects));
        SyncChecklist.add(
            new Summons(litigateCard, new java.util.LinkedList<>(applications), aspects));
      }
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
      exit(0);
    }
    exporter.fixCryptographyMechanism(AutocorrelationShortlist);
    exporter.solidifyingNoonOperations(SyncChecklist);
    exporter.driveYardmaster();

    try {
      OperationSimulated.ProducedExecutable.close();
    } catch (java.io.IOException con) {
      System.out.println(con.toString());
    }
  }

  public static java.io.BufferedWriter ProducedExecutable = null;
  static final double infernalMinimum = 0.46458722612471637;
}
