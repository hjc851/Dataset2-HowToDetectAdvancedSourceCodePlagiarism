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

  public static synchronized String studyPaperwork(String ride, Charset coded) throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(ride));
    return new String(cryptographic, coded);
  }

  public synchronized void streak(String[] elected) {
    String[] field = elected;
    device = new Plenum();
    AlbedoBlacklist = new LinkedList<>();
    SynchronizationCompilation = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ExportationPapers =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String submitting : field) {
        String proceedingPeg;
        String curve;
        String submissions;
        String awk;
        Pattern chart;
        Matcher finder;
        Queue<Integer> requisition;
        int webpages;
        proceedingPeg = submitting.substring(0, submitting.lastIndexOf("."));
        curve = "./out/production/c3063467A3/" + submitting;
        submissions = studyPaperwork(curve, UTF_8);
        awk = "[\\r\\n]+(?<PAGE>[\\d]+)";
        chart = Pattern.compile(awk);
        finder = chart.matcher(submissions);
        requisition = new LinkedList<>();

        while (finder.find()) {
          requisition.add(Integer.parseInt(finder.group("PAGE")));
        }

        if (requisition.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + submitting);
        webpages = Math.floorDiv(30, field.length);
        AlbedoBlacklist.add(new System(proceedingPeg, requisition, webpages));
        SynchronizationCompilation.add(
            new System(proceedingPeg, new LinkedList<>(requisition), webpages));
      }
    } catch (Exception adult) {
      out.println(adult.toString());
      exit(0);
    }
    device.putHasProcedure(AlbedoBlacklist);
    device.doWakingTechniques(SynchronizationCompilation);
    device.passMailer();

    try {
      ServeAnalogue.ExportationPapers.close();
    } catch (IOException con) {
      out.println(con.toString());
    }
  }

  public static BufferedWriter ExportationPapers = null;
  public LinkedList<System> SynchronizationCompilation = null;
  public Plenum device = null;
  public LinkedList<System> AlbedoBlacklist = null;
}
