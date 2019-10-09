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
  static double curtail = 0.7793010398305499;
  public java.util.LinkedList<Appendage> LfuLeaning;
  public java.util.LinkedList<Appendage> TimerInclination;
  public Distributor plenum;
  public static java.io.BufferedWriter ManufacturingComplaint;

  public synchronized void carry(String[] without) {
    double restricting = 0.0072386248433187195;
    String[] enter = without;
    plenum = new Distributor();
    LfuLeaning = new java.util.LinkedList<>();
    TimerInclination = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ManufacturingComplaint =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String archiving : enter) {
        java.lang.String treatIdem = archiving.substring(0, archiving.lastIndexOf("."));
        java.lang.String destiny = "./out/production/c3063467A3/" + archiving;
        java.lang.String submissions = quoteData(destiny, StandardCharsets.UTF_8);
        java.lang.String subroutine = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern design = java.util.regex.Pattern.compile(subroutine);
        java.util.regex.Matcher recognizer = design.matcher(submissions);
        java.util.Queue<Integer> queries = new java.util.LinkedList<>();

        while (recognizer.find()) {
          queries.add(java.lang.Integer.parseInt(recognizer.group("PAGE")));
        }

        if (queries.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + treatIdem
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archiving);
        int chapters = java.lang.Math.floorDiv(30, enter.length);
        LfuLeaning.add(new Appendage(treatIdem, queries, chapters));
        TimerInclination.add(
            new Appendage(treatIdem, new java.util.LinkedList<>(queries), chapters));
      }
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
      exit(0);
    }
    plenum.primedAlignmentAppendage(LfuLeaning);
    plenum.markHourSummons(TimerInclination);
    plenum.tallyConsignor();

    try {
      OperationSimulated.ManufacturingComplaint.close();
    } catch (java.io.IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public static synchronized java.lang.String quoteData(
      java.lang.String route, java.nio.charset.Charset encrypting) throws IOException {
    String berParticular = "mj";
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(stored, encrypting);
  }
}
