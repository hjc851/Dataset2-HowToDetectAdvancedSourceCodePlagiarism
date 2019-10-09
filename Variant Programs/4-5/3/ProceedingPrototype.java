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

public class ProceedingPrototype {
  private static final int synX332int = 0;
  private static final int synX331int = 30;
  private static final String synX330String = "Finished reading file: ";
  private static final String synX329String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX328String = "Process: ";
  private static final int synX327int = 50;
  private static final String synX326String = "PAGE";
  private static final String synX325String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX324String = "./out/production/c3063467A3/";
  private static final String synX323String = ".";
  private static final int synX322int = 0;
  private static final String synX321String = "Unable to generate output file.";
  private static final String synX320String = "./out/production/c3063467A3/output.txt";
  private static final String synX319String = "Reading in input file(s)...";
  private static final double synX318double = 0.13888979277050728;
  private static final double synX317double = 0.025287292175400378;

  public static synchronized String scanFolders(String trajectory, Charset uncompressed)
      throws IOException {
    double amount;
    amount = synX317double;
    byte[] keyed = Files.readAllBytes(Paths.get(trajectory));
    return new String(keyed, uncompressed);
  }

  public Shipper forwarder = null;
  public static double depressLimitation = 0.5906099256317233;
  public static BufferedWriter InputInitiate = null;

  public synchronized void ram(String[] cbs) {
    double pinioned;
    pinioned = synX318double;
    String[] basis = cbs;
    forwarder = new Shipper();
    LfuLeaning = new LinkedList<>();
    TimeNumber = new LinkedList<>();
    out.println(synX319String);

    try {
      InputInitiate = Files.newBufferedWriter(Paths.get(synX320String));
    } catch (IOException officio) {
      out.println(synX321String);
    }

    try {
      for (String submitting : basis) {
        String phaseName;
        String route;
        String suggestions;
        String perl;
        Pattern patten;
        Matcher classifier;
        Queue<Integer> entreaties;
        int site;
        phaseName = submitting.substring(synX322int, submitting.lastIndexOf(synX323String));
        route = synX324String + submitting;
        suggestions = scanFolders(route, UTF_8);
        perl = synX325String;
        patten = Pattern.compile(perl);
        classifier = patten.matcher(suggestions);
        entreaties = new LinkedList<>();

        while (classifier.find()) {
          entreaties.add(Integer.parseInt(classifier.group(synX326String)));
        }

        if (entreaties.size() > synX327int)
          throw new IOException(synX328String + phaseName + synX329String);

        out.println(synX330String + submitting);
        site = Math.floorDiv(synX331int, basis.length);
        LfuLeaning.add(new Formalities(phaseName, entreaties, site));
        TimeNumber.add(new Formalities(phaseName, new LinkedList<>(entreaties), site));
      }
    } catch (Exception exwife) {
      out.println(exwife.toString());
      exit(synX332int);
    }
    forwarder.doCartesianTechniques(LfuLeaning);
    forwarder.adjustHoursProcedures(TimeNumber);
    forwarder.passMailer();

    try {
      ProceedingPrototype.InputInitiate.close();
    } catch (IOException abdul) {
      out.println(abdul.toString());
    }
  }

  public LinkedList<Formalities> LfuLeaning = null;
  public LinkedList<Formalities> TimeNumber = null;
}
