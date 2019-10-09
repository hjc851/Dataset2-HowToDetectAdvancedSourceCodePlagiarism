package trainer;

import salesperson.Yardmaster;
import planner.Negotiations;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class NegotiationsAvionics {
  private static final String synX2056String = "Finished reading input file...";
  private static final String synX2055String = "SIZE";
  private static final String synX2054String = "Arrive";
  private static final String synX2053String = "ID";
  private static final String synX2052String = "DISP";
  private static final String synX2051String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2050String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2049String = "./out/production/c3063467A1/";
  private static final String synX2048String = "Unable to generate output file.";
  private static final String synX2047String = "_output.txt";
  private static final String synX2046String = "./out/production/c3063467A1/";
  private static final String synX2045String = ".";
  private static final int synX2044int = 0;
  private static final String synX2043String = "Reading in input file...";
  public LinkedList<Negotiations> litigateLeaning = null;
  public Yardmaster retailer = null;
  public static String RepresentationsInitiate = null;
  public static BufferedWriter YieldRegister = null;

  public synchronized void carry(String elected) {
    this.RepresentationsInitiate = (elected);
    retailer = (new Yardmaster());
    litigateLeaning = (new LinkedList<>());
    out.println(synX2043String);

    try {
      String undoneForename =
          RepresentationsInitiate.substring(
              synX2044int, RepresentationsInitiate.lastIndexOf(synX2045String));
      YieldRegister =
          (new BufferedWriter(new FileWriter((synX2046String + undoneForename + synX2047String))));
    } catch (IOException aba) {
      out.println(synX2048String);
    }
    RepresentationsInitiate = (synX2049String + RepresentationsInitiate);

    try {
      String stimulation = showDocumentation(RepresentationsInitiate, UTF_8);
      String plu = synX2050String;
      Pattern p = Pattern.compile(plu);
      Matcher sm = p.matcher(stimulation);
      String exp2 = synX2051String;
      Pattern gpi = Pattern.compile(exp2);
      Matcher f1 = gpi.matcher(stimulation);

      while (sm.find()) {
        retailer.laidShipmentClip(Integer.parseInt(sm.group(synX2052String)));
      }

      while (f1.find()) {
        litigateLeaning.add(
            new Negotiations(
                f1.group(synX2053String),
                Integer.parseInt(f1.group(synX2054String)),
                Integer.parseInt(f1.group(synX2055String))));
      }
      out.println(synX2056String);
    } catch (Exception adrian) {
      out.println(adrian.toString());
    }
    retailer.layLitigate(litigateLeaning);
    retailer.streakVendor();
  }

  public static synchronized String showDocumentation(String pathways, Charset metadata)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(pathways));
    return new String(stored, metadata);
  }
}
