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

public class ServeAnalogue {
  private static final int synX1662int = 0;
  private static final int synX1661int = 30;
  private static final String synX1660String = "Finished reading file: ";
  private static final String synX1659String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1658String = "Process: ";
  private static final int synX1657int = 50;
  private static final String synX1656String = "PAGE";
  private static final String synX1655String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1654String = "./out/production/c3063467A3/";
  private static final String synX1653String = ".";
  private static final int synX1652int = 0;
  private static final String synX1651String = "Unable to generate output file.";
  private static final String synX1650String = "./out/production/c3063467A3/output.txt";
  private static final String synX1649String = "Reading in input file(s)...";
  public LinkedList<Methods> CartelListings = null;
  public Yardmaster trainmaster = null;
  public LinkedList<Methods> SynchNames = null;
  public static BufferedWriter ExportSubmit = null;

  public synchronized void bleed(String[] advocates) {
    String[] entry = advocates;
    trainmaster = new Yardmaster();
    CartelListings = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println(synX1649String);

    try {
      ExportSubmit = Files.newBufferedWriter(Paths.get(synX1650String));
    } catch (IOException admittedly) {
      System.out.println(synX1651String);
    }

    try {
      for (String initiate : entry) {
        String formalitiesTag;
        String course;
        String advice;
        String subroutine;
        Pattern practice;
        Matcher brite;
        Queue<Integer> application;
        int leafs;
        formalitiesTag = initiate.substring(synX1652int, initiate.lastIndexOf(synX1653String));
        course = synX1654String + initiate;
        advice = writeDatabase(course, StandardCharsets.UTF_8);
        subroutine = synX1655String;
        practice = Pattern.compile(subroutine);
        brite = practice.matcher(advice);
        application = new LinkedList<>();

        while (brite.find()) {
          application.add(Integer.parseInt(brite.group(synX1656String)));
        }

        if (application.size() > synX1657int)
          throw new IOException(synX1658String + formalitiesTag + synX1659String);

        System.out.println(synX1660String + initiate);
        leafs = Math.floorDiv(synX1661int, entry.length);
        CartelListings.add(new Methods(formalitiesTag, application, leafs));
        SynchNames.add(new Methods(formalitiesTag, new LinkedList<>(application), leafs));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(synX1662int);
    }
    trainmaster.fixCryptographyMechanism(CartelListings);
    trainmaster.putTimeProcedure(SynchNames);
    trainmaster.bleedOriginator();

    try {
      ServeAnalogue.ExportSubmit.close();
    } catch (IOException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public static synchronized String writeDatabase(String pathways, Charset decoding)
      throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(pathways));
    return new String(captioned, decoding);
  }
}
