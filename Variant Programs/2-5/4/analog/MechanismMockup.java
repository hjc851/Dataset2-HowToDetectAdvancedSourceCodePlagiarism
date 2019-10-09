package analog;

import plenum.Exporter;
import parser.March;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class MechanismMockup {
  private static final String synX571String = "Finished reading input file...";
  private static final String synX570String = "SIZE";
  private static final String synX569String = "Arrive";
  private static final String synX568String = "ID";
  private static final String synX567String = "DISP";
  private static final String synX566String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX565String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX564String = "./out/production/c3063467A1/";
  private static final String synX563String = "Unable to generate output file.";
  private static final String synX562String = "_output.txt";
  private static final String synX561String = "./out/production/c3063467A1/";
  private static final String synX560String = ".";
  private static final int synX559int = 0;
  private static final String synX558String = "Reading in input file...";
  private static final String synX557String = "J9aJyLwOO5M";
  private static final double synX556double = 0.5928594949511611;
  public static BufferedWriter ProductionFolder = null;
  static final double chthonianThreshold = 0.9372427544516005;

  public static synchronized String registerSubmit(String way, Charset codification)
      throws IOException {
    double measure;
    measure = (synX556double);
    byte[] cryptographic = readAllBytes(get(way));
    return new String(cryptographic, codification);
  }

  public Exporter trainmaster = null;
  public LinkedList<March> serveNames = null;
  public static String StimulantCharge = null;

  public synchronized void campaign(String whys) {
    String tabulation;
    tabulation = (synX557String);
    this.StimulantCharge = (whys);
    trainmaster = (new Exporter());
    serveNames = (new LinkedList<>());
    System.out.println(synX558String);

    try {
      String revokedAdvert;
      revokedAdvert =
          (StimulantCharge.substring(synX559int, StimulantCharge.lastIndexOf(synX560String)));
      ProductionFolder =
          (new BufferedWriter(new FileWriter((synX561String + revokedAdvert + synX562String))));
    } catch (IOException abbe) {
      System.out.println(synX563String);
    }
    StimulantCharge = (synX564String + StimulantCharge);

    try {
      String comments;
      String exc;
      Pattern vig;
      Matcher dos;
      String exp2;
      Pattern p4;
      Matcher a2;
      comments = (registerSubmit(StimulantCharge, StandardCharsets.UTF_8));
      exc = (synX565String);
      vig = (compile(exc));
      dos = (vig.matcher(comments));
      exp2 = (synX566String);
      p4 = (compile(exp2));
      a2 = (p4.matcher(comments));

      while (dos.find()) {
        trainmaster.primedExpeditionPeriod(parseInt(dos.group(synX567String)));
      }

      while (a2.find()) {
        serveNames.add(
            new March(
                a2.group(synX568String),
                parseInt(a2.group(synX569String)),
                parseInt(a2.group(synX570String))));
      }
      System.out.println(synX571String);
    } catch (Exception adult) {
      System.out.println(adult.toString());
    }
    trainmaster.solidifyingOperations(serveNames);
    trainmaster.raceShipper();
  }
}
