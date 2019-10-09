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

public class MechanismsManikin {
  private static final double synX2138double = 0.5039990979157882;
  private static final int synX2137int = 0;
  private static final int synX2136int = 30;
  private static final String synX2135String = "Finished reading file: ";
  private static final String synX2134String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2133String = "Process: ";
  private static final int synX2132int = 50;
  private static final String synX2131String = "PAGE";
  private static final String synX2130String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2129String = "./out/production/c3063467A3/";
  private static final String synX2128String = ".";
  private static final int synX2127int = 0;
  private static final String synX2126String = "Unable to generate output file.";
  private static final String synX2125String = "./out/production/c3063467A3/output.txt";
  private static final String synX2124String = "Reading in input file(s)...";
  private static final int synX2123int = -1865724492;
  public static BufferedWriter OutturnLodge = null;
  private Distributors salesperson = null;
  private LinkedList<Proceeding> WakingBibliography = null;
  private LinkedList<Proceeding> EstimationPlaylist = null;
  public static final int narrowerRestrain = 1846027428;

  public synchronized void move(String[] entries) {
    int pinioned;
    pinioned = (synX2123int);
    String[] trash = entries;
    salesperson = (new Distributors());
    EstimationPlaylist = (new LinkedList<>());
    WakingBibliography = (new LinkedList<>());
    System.out.println(synX2124String);

    try {
      OutturnLodge = (Files.newBufferedWriter(Paths.get(synX2125String)));
    } catch (IOException post) {
      System.out.println(synX2126String);
    }

    try {
      for (String documents : trash) {
        String formalitiesTag;
        String ride;
        String representations;
        String namespace;
        Pattern method;
        Matcher aspx;
        Queue<Integer> proposals;
        int ppm;
        formalitiesTag = (documents.substring(synX2127int, documents.lastIndexOf(synX2128String)));
        ride = (synX2129String + documents);
        representations = (understandCharge(ride, StandardCharsets.UTF_8));
        namespace = (synX2130String);
        method = (Pattern.compile(namespace));
        aspx = (method.matcher(representations));
        proposals = (new LinkedList<>());

        while (aspx.find()) {
          proposals.add(Integer.parseInt(aspx.group(synX2131String)));
        }

        if (proposals.size() > synX2132int)
          throw new IOException((synX2133String + formalitiesTag + synX2134String));

        System.out.println(synX2135String + documents);
        ppm = (Math.floorDiv(synX2136int, trash.length));
        EstimationPlaylist.add(new Proceeding(formalitiesTag, proposals, ppm));
        WakingBibliography.add(new Proceeding(formalitiesTag, new LinkedList<>(proposals), ppm));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(synX2137int);
    }
    salesperson.placedAutocorrelationSue(EstimationPlaylist);
    salesperson.putTimeProcedure(WakingBibliography);
    salesperson.operateStarter();

    try {
      MechanismsManikin.OutturnLodge.close();
    } catch (IOException late) {
      System.out.println(late.toString());
    }
  }

  private static synchronized String understandCharge(String course, Charset encrypting)
      throws IOException {
    double measure;
    measure = (synX2138double);
    byte[] scrambled = Files.readAllBytes(Paths.get(course));
    return new String(scrambled, encrypting);
  }
}
