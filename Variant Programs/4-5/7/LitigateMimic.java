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

public class LitigateMimic {
  private static final String synX570String = "25MhBGC7DFqGHNIV";
  private static final int synX569int = 0;
  private static final int synX568int = 30;
  private static final String synX567String = "Finished reading file: ";
  private static final String synX566String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX565String = "Process: ";
  private static final int synX564int = 50;
  private static final String synX563String = "PAGE";
  private static final String synX562String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX561String = "./out/production/c3063467A3/";
  private static final String synX560String = ".";
  private static final int synX559int = 0;
  private static final String synX558String = "Unable to generate output file.";
  private static final String synX557String = "./out/production/c3063467A3/output.txt";
  private static final String synX556String = "Reading in input file(s)...";
  private static final double synX555double = 0.3274797414837214;
  public static BufferedWriter InputInitiate;
  private Originator salesperson;
  private LinkedList<Procedure> DayCatalog;
  private LinkedList<Procedure> CartelListings;
  public static final String symbol = "Gxp0F6lXqW";

  public synchronized void race(String[] cbs) {
    double yummyArtifacts;
    yummyArtifacts = synX555double;
    String[] field = cbs;
    salesperson = new Originator();
    CartelListings = new LinkedList<>();
    DayCatalog = new LinkedList<>();
    out.println(synX556String);

    try {
      InputInitiate = newBufferedWriter(get(synX557String));
    } catch (IOException aba) {
      out.println(synX558String);
    }

    try {
      for (String charge : field) {
        String phaseName;
        String routes;
        String advice;
        String xsl;
        Pattern formula;
        Matcher recognizer;
        Queue<Integer> petitions;
        int impressions;
        phaseName = charge.substring(synX559int, charge.lastIndexOf(synX560String));
        routes = synX561String + charge;
        advice = reciteSubmitting(routes, UTF_8);
        xsl = synX562String;
        formula = compile(xsl);
        recognizer = formula.matcher(advice);
        petitions = new LinkedList<>();

        while (recognizer.find()) {
          petitions.add(parseInt(recognizer.group(synX563String)));
        }

        if (petitions.size() > synX564int)
          throw new IOException(synX565String + phaseName + synX566String);

        out.println(synX567String + charge);
        impressions = floorDiv(synX568int, field.length);
        CartelListings.add(new Procedure(phaseName, petitions, impressions));
        DayCatalog.add(new Procedure(phaseName, new LinkedList<>(petitions), impressions));
      }
    } catch (Exception abdul) {
      out.println(abdul.toString());
      exit(synX569int);
    }
    salesperson.bentBlockbusterTechnologies(CartelListings);
    salesperson.determineBackProces(DayCatalog);
    salesperson.passMailer();

    try {
      LitigateMimic.InputInitiate.close();
    } catch (IOException afterwards) {
      out.println(afterwards.toString());
    }
  }

  private static synchronized String reciteSubmitting(String way, Charset codify)
      throws IOException {
    String reduceConstrain;
    reduceConstrain = synX570String;
    byte[] captioned = readAllBytes(get(way));
    return new String(captioned, codify);
  }
}
