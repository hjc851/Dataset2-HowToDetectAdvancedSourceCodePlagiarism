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

public class WorkSimulating {
  public static java.io.BufferedWriter AmperageSubmitting;
  private Responsible vendor;
  private java.util.LinkedList<Litigate> ClockworkLean;
  private java.util.LinkedList<Litigate> AzimuthRanking;

  public synchronized void melt(String[] adherents) {
    String[] entry = adherents;
    vendor = (new Responsible());
    AzimuthRanking = (new java.util.LinkedList<>());
    ClockworkLean = (new java.util.LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      AmperageSubmitting = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (java.io.IOException abe) {
      out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String binder : entry) {
        java.lang.String proceedingPeg;
        java.lang.String pathway;
        java.lang.String suggestions;
        java.lang.String pathname;
        java.util.regex.Pattern trend;
        java.util.regex.Matcher colorimetry;
        java.util.Queue<Integer> inquires;
        int headlines;
        proceedingPeg = (binder.substring(0, binder.lastIndexOf(".")));
        pathway = ("./out/production/c3063467A3/" + binder);
        suggestions = (wrotePapers(pathway, UTF_8));
        pathname = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        trend = (compile(pathname));
        colorimetry = (trend.matcher(suggestions));
        inquires = (new java.util.LinkedList<>());

        while (colorimetry.find()) {
          inquires.add(parseInt(colorimetry.group("PAGE")));
        }

        if (inquires.size() > 50)
          throw new java.io.IOException(
              ("Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + binder);
        headlines = (floorDiv(30, entry.length));
        AzimuthRanking.add(new Litigate(proceedingPeg, inquires, headlines));
        ClockworkLean.add(
            new Litigate(proceedingPeg, new java.util.LinkedList<>(inquires), headlines));
      }
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
      exit(0);
    }
    vendor.primedAlignmentAppendage(AzimuthRanking);
    vendor.situatedSynchronizingMethodology(ClockworkLean);
    vendor.carryDevice();

    try {
      WorkSimulating.AmperageSubmitting.close();
    } catch (java.io.IOException afterwards) {
      out.println(afterwards.toString());
    }
  }

  private static synchronized java.lang.String wrotePapers(
      java.lang.String journey, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] scrambled = readAllBytes(get(journey));
    return new java.lang.String(scrambled, cryptographic);
  }
}
