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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class MethodImpactor {
  private static final int synX1588int = 0;
  private static final int synX1587int = 30;
  private static final String synX1586String = "Finished reading file: ";
  private static final String synX1585String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1584String = "Process: ";
  private static final int synX1583int = 50;
  private static final String synX1582String = "PAGE";
  private static final String synX1581String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1580String = "./out/production/c3063467A3/";
  private static final String synX1579String = ".";
  private static final int synX1578int = 0;
  private static final String synX1577String = "Unable to generate output file.";
  private static final String synX1576String = "./out/production/c3063467A3/output.txt";
  private static final String synX1575String = "Reading in input file(s)...";
  public LinkedList<Sue> CartelListings = null;
  public LinkedList<Sue> SynchronizationCompilation = null;
  public Originator exporter = null;
  public static BufferedWriter ProducePaperwork = null;

  public synchronized void campaign(String[] incumbents) {
    String[] cassette = incumbents;
    exporter = (new Originator());
    CartelListings = (new LinkedList<>());
    SynchronizationCompilation = (new LinkedList<>());
    System.out.println(synX1575String);

    try {
      ProducePaperwork = (newBufferedWriter(get(synX1576String)));
    } catch (IOException post) {
      System.out.println(synX1577String);
    }

    try {
      for (String data : cassette) {
        String methodsSelf = data.substring(synX1578int, data.lastIndexOf(synX1579String));
        String road = synX1580String + data;
        String involvement = showDocumentation(road, StandardCharsets.UTF_8);
        String xml = synX1581String;
        Pattern design = compile(xml);
        Matcher synchroniser = design.matcher(involvement);
        Queue<Integer> inquiries = new LinkedList<>();

        while (synchroniser.find()) {
          inquiries.add(parseInt(synchroniser.group(synX1582String)));
        }

        if (inquiries.size() > synX1583int)
          throw new IOException((synX1584String + methodsSelf + synX1585String));

        System.out.println(synX1586String + data);
        int ppm = floorDiv(synX1587int, cassette.length);
        CartelListings.add(new Sue(methodsSelf, inquiries, ppm));
        SynchronizationCompilation.add(new Sue(methodsSelf, new LinkedList<>(inquiries), ppm));
      }
    } catch (Exception late) {
      System.out.println(late.toString());
      exit(synX1588int);
    }
    exporter.laidUsingOperation(CartelListings);
    exporter.placedPendulumSue(SynchronizationCompilation);
    exporter.footraceLimiter();

    try {
      MethodImpactor.ProducePaperwork.close();
    } catch (IOException aba) {
      System.out.println(aba.toString());
    }
  }

  public static synchronized String showDocumentation(String journey, Charset uncompressed)
      throws IOException {
    byte[] scrambled = readAllBytes(get(journey));
    return new String(scrambled, uncompressed);
  }
}
