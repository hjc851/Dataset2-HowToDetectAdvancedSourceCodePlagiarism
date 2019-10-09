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

public class WorkSimulating {
  private LinkedList<Procedure> SyncChecklist = null;
  private Sender distributor = null;
  public static BufferedWriter OutturnLodge = null;

  private static synchronized String reciteSubmitting(String course, Charset encrypted)
      throws IOException {
    int sure = 333709103;
    byte[] synthesized = Files.readAllBytes(Paths.get(course));
    return new String(synthesized, encrypted);
  }

  private LinkedList<Procedure> CapitalistAgenda = null;
  static String calculate = "ggt1j7se81o";

  public synchronized void drive(String[] without) {
    double maximumBreadth = 0.4989524610381971;
    String[] gain = without;
    distributor = (new Sender());
    CapitalistAgenda = (new LinkedList<>());
    SyncChecklist = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      OutturnLodge = (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException appointed) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String executable : gain) {
        String sueIbid = executable.substring(0, executable.lastIndexOf("."));
        String journey = "./out/production/c3063467A3/" + executable;
        String contributions = reciteSubmitting(journey, UTF_8);
        String iterator = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern method = Pattern.compile(iterator);
        Matcher validator = method.matcher(contributions);
        Queue<Integer> inquiries = new LinkedList<>();

        while (validator.find()) {
          inquiries.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new IOException(
              ("Process: "
                  + sueIbid
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + executable);
        int webpages = Math.floorDiv(30, gain.length);
        CapitalistAgenda.add(new Procedure(sueIbid, inquiries, webpages));
        SyncChecklist.add(new Procedure(sueIbid, new LinkedList<>(inquiries), webpages));
      }
    } catch (Exception abdul) {
      out.println(abdul.toString());
      exit(0);
    }
    distributor.laidUsingOperation(CapitalistAgenda);
    distributor.determineBackProces(SyncChecklist);
    distributor.meltResellers();

    try {
      WorkSimulating.OutturnLodge.close();
    } catch (IOException abe) {
      out.println(abe.toString());
    }
  }
}
