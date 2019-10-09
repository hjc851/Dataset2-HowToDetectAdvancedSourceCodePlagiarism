package faker;

import starter.Shipper;
import planner.Summons;
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

public class ServeAnalogue {
  private static final String synX1964String = "Finished reading input file...";
  private static final String synX1963String = "SIZE";
  private static final String synX1962String = "Arrive";
  private static final String synX1961String = "ID";
  private static final String synX1960String = "DISP";
  private static final String synX1959String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1958String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1957String = "./out/production/c3063467A1/";
  private static final String synX1956String = "Unable to generate output file.";
  private static final String synX1955String = "_output.txt";
  private static final String synX1954String = "./out/production/c3063467A1/";
  private static final String synX1953String = ".";
  private static final int synX1952int = 0;
  private static final String synX1951String = "Reading in input file...";
  public static String StimulantCharge = null;

  public synchronized void test(String entries) {
    this.StimulantCharge = (entries);
    trainmaster = (new Shipper());
    negotiationsListings = (new LinkedList<>());
    out.println(synX1951String);

    try {
      String deletedSurname;
      deletedSurname =
          (StimulantCharge.substring(synX1952int, StimulantCharge.lastIndexOf(synX1953String)));
      OutturnLodge =
          (new BufferedWriter(new FileWriter((synX1954String + deletedSurname + synX1955String))));
    } catch (IOException abbe) {
      out.println(synX1956String);
    }
    StimulantCharge = (synX1957String + StimulantCharge);

    try {
      String influence;
      String experiment;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern n;
      Matcher ap;
      influence = (sayFolder(StimulantCharge, UTF_8));
      experiment = (synX1958String);
      p = (Pattern.compile(experiment));
      esi = (p.matcher(influence));
      exp2 = (synX1959String);
      n = (Pattern.compile(exp2));
      ap = (n.matcher(influence));

      while (esi.find()) {
        trainmaster.determinedDischargeDays(Integer.parseInt(esi.group(synX1960String)));
      }

      while (ap.find()) {
        negotiationsListings.add(
            new Summons(
                ap.group(synX1961String),
                Integer.parseInt(ap.group(synX1962String)),
                Integer.parseInt(ap.group(synX1963String))));
      }
      out.println(synX1964String);
    } catch (Exception appointed) {
      out.println(appointed.toString());
    }
    trainmaster.markSummons(negotiationsListings);
    trainmaster.operateStarter();
  }

  public LinkedList<Summons> negotiationsListings = null;

  public static synchronized String sayFolder(String route, Charset encryption) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(route));
    return new String(entered, encryption);
  }

  public Shipper trainmaster = null;
  public static BufferedWriter OutturnLodge = null;
}
