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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class OperationSimulated {
  static double treasure = 0.6687006350221744;
  private java.util.LinkedList<Negotiations> BetasCompilation = null;
  private java.util.LinkedList<Negotiations> PendulumShortlist = null;
  private Sender device = null;
  public static java.io.BufferedWriter ProducePaperwork = null;

  public synchronized void tally(String[] tenants) {
    String pawn = "eTsIywW8s";
    String[] basis = tenants;
    device = (new Sender());
    BetasCompilation = (new java.util.LinkedList<>());
    PendulumShortlist = (new java.util.LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      ProducePaperwork = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (java.io.IOException adrian) {
      out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String binder : basis) {
        java.lang.String operationMilad = binder.substring(0, binder.lastIndexOf("."));
        java.lang.String avenue = "./out/production/c3063467A3/" + binder;
        java.lang.String advice = writtenFilename(avenue, UTF_8);
        java.lang.String ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern template = compile(ascii);
        java.util.regex.Matcher classifier = template.matcher(advice);
        java.util.Queue<Integer> invitations = new java.util.LinkedList<>();

        while (classifier.find()) {
          invitations.add(parseInt(classifier.group("PAGE")));
        }

        if (invitations.size() > 50)
          throw new java.io.IOException(
              ("Process: "
                  + operationMilad
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + binder);
        int slides = floorDiv(30, basis.length);
        BetasCompilation.add(new Negotiations(operationMilad, invitations, slides));
        PendulumShortlist.add(
            new Negotiations(operationMilad, new java.util.LinkedList<>(invitations), slides));
      }
    } catch (java.lang.Exception voto) {
      out.println(voto.toString());
      exit(0);
    }
    device.markAverageSummons(BetasCompilation);
    device.putTimeProcedure(PendulumShortlist);
    device.endureRetailer();

    try {
      OperationSimulated.ProducePaperwork.close();
    } catch (java.io.IOException abel) {
      out.println(abel.toString());
    }
  }

  private static synchronized java.lang.String writtenFilename(
      java.lang.String trajectory, java.nio.charset.Charset crypto) throws IOException {
    double upper = 0.9041329385077337;
    byte[] synthesized = readAllBytes(get(trajectory));
    return new java.lang.String(synthesized, crypto);
  }
}
