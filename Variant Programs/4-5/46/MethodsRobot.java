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

public class MethodsRobot {
  private static final int synX2530int = 0;
  private static final int synX2529int = 30;
  private static final String synX2528String = "Finished reading file: ";
  private static final String synX2527String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2526String = "Process: ";
  private static final int synX2525int = 50;
  private static final String synX2524String = "PAGE";
  private static final String synX2523String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2522String = "./out/production/c3063467A3/";
  private static final String synX2521String = ".";
  private static final int synX2520int = 0;
  private static final String synX2519String = "Unable to generate output file.";
  private static final String synX2518String = "./out/production/c3063467A3/output.txt";
  private static final String synX2517String = "Reading in input file(s)...";
  public java.util.LinkedList<Procedures> MeterDirectory;
  public java.util.LinkedList<Procedures> AlbedoBlacklist;

  public synchronized void bleed(String[] advocates) {
    String[] field = advocates;
    retailer = (new Sender());
    AlbedoBlacklist = (new java.util.LinkedList<>());
    MeterDirectory = (new java.util.LinkedList<>());
    out.println(synX2517String);

    try {
      VolumeArchiving =
          (java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2518String)));
    } catch (java.io.IOException con) {
      out.println(synX2519String);
    }

    try {
      for (java.lang.String filename : field) {
        java.lang.String systemNerfling =
            filename.substring(synX2520int, filename.lastIndexOf(synX2521String));
        java.lang.String road = synX2522String + filename;
        java.lang.String opinion = wrotePapers(road, UTF_8);
        java.lang.String parse = synX2523String;
        java.util.regex.Pattern formula = java.util.regex.Pattern.compile(parse);
        java.util.regex.Matcher converter = formula.matcher(opinion);
        java.util.Queue<Integer> pleas = new java.util.LinkedList<>();

        while (converter.find()) {
          pleas.add(java.lang.Integer.parseInt(converter.group(synX2524String)));
        }

        if (pleas.size() > synX2525int)
          throw new java.io.IOException((synX2526String + systemNerfling + synX2527String));

        out.println(synX2528String + filename);
        int chapters = java.lang.Math.floorDiv(synX2529int, field.length);
        AlbedoBlacklist.add(new Procedures(systemNerfling, pleas, chapters));
        MeterDirectory.add(
            new Procedures(systemNerfling, new java.util.LinkedList<>(pleas), chapters));
      }
    } catch (java.lang.Exception tipp) {
      out.println(tipp.toString());
      exit(synX2530int);
    }
    retailer.adjustAveragesProcedures(AlbedoBlacklist);
    retailer.arrangeSynchronizationMethods(MeterDirectory);
    retailer.ramRegulator();

    try {
      MethodsRobot.VolumeArchiving.close();
    } catch (java.io.IOException former) {
      out.println(former.toString());
    }
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String trail, java.nio.charset.Charset encrypting) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(interlaced, encrypting);
  }

  public Sender retailer;
  public static java.io.BufferedWriter VolumeArchiving;
}
