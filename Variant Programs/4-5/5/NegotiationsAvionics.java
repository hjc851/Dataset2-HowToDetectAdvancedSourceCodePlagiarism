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

public class NegotiationsAvionics {
  private static final double synX452double = 0.6136113229304565;
  private static final int synX451int = 0;
  private static final int synX450int = 30;
  private static final String synX449String = "Finished reading file: ";
  private static final String synX448String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX447String = "Process: ";
  private static final int synX446int = 50;
  private static final String synX445String = "PAGE";
  private static final String synX444String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX443String = "./out/production/c3063467A3/";
  private static final String synX442String = ".";
  private static final int synX441int = 0;
  private static final String synX440String = "Unable to generate output file.";
  private static final String synX439String = "./out/production/c3063467A3/output.txt";
  private static final String synX438String = "Reading in input file(s)...";
  private static final int synX437int = 1264042321;
  public static BufferedWriter ProductionFolder;
  private Salesperson mailer;
  private LinkedList<Methodology> FrequencyDocket;
  private LinkedList<Methodology> CartelListings;
  public static final String cay = "YJB8lEHI4YH0138W";

  public synchronized void move(String[] cbs) {
    int numbers;
    numbers = synX437int;
    String[] feedback = cbs;
    mailer = new Salesperson();
    CartelListings = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    out.println(synX438String);

    try {
      ProductionFolder = newBufferedWriter(get(synX439String));
    } catch (IOException post) {
      out.println(synX440String);
    }

    try {
      for (String application : feedback) {
        String outgrowthEst;
        String route;
        String comments;
        String namespace;
        Pattern triangle;
        Matcher brite;
        Queue<Integer> petition;
        int screens;
        outgrowthEst = application.substring(synX441int, application.lastIndexOf(synX442String));
        route = synX443String + application;
        comments = rereadSubmitted(route, UTF_8);
        namespace = synX444String;
        triangle = compile(namespace);
        brite = triangle.matcher(comments);
        petition = new LinkedList<>();

        while (brite.find()) {
          petition.add(parseInt(brite.group(synX445String)));
        }

        if (petition.size() > synX446int)
          throw new IOException(synX447String + outgrowthEst + synX448String);

        out.println(synX449String + application);
        screens = floorDiv(synX450int, feedback.length);
        CartelListings.add(new Methodology(outgrowthEst, petition, screens));
        FrequencyDocket.add(new Methodology(outgrowthEst, new LinkedList<>(petition), screens));
      }
    } catch (Exception adult) {
      out.println(adult.toString());
      exit(synX451int);
    }
    mailer.determinedAlbedoOutgrowth(CartelListings);
    mailer.fixedWatchPractices(FrequencyDocket);
    mailer.passMailer();

    try {
      NegotiationsAvionics.ProductionFolder.close();
    } catch (IOException officio) {
      out.println(officio.toString());
    }
  }

  private static synchronized String rereadSubmitted(String progression, Charset metadata)
      throws IOException {
    double reducedLeaping;
    reducedLeaping = synX452double;
    byte[] decodes = readAllBytes(get(progression));
    return new String(decodes, metadata);
  }
}
