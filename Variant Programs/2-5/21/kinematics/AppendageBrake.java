package kinematics;

import originator.Reseller;
import programmer.Treat;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class AppendageBrake {
  private static final String synX1858String = "Finished reading input file...";
  private static final String synX1857String = "SIZE";
  private static final String synX1856String = "Arrive";
  private static final String synX1855String = "ID";
  private static final String synX1854String = "DISP";
  private static final String synX1853String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1852String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1851String = "./out/production/c3063467A1/";
  private static final String synX1850String = "Unable to generate output file.";
  private static final String synX1849String = "_output.txt";
  private static final String synX1848String = "./out/production/c3063467A1/";
  private static final String synX1847String = ".";
  private static final int synX1846int = 0;
  private static final String synX1845String = "Reading in input file...";
  private static final double synX1844double = 0.44596766366657103;
  private static final double synX1843double = 0.771911132481234;

  public static synchronized String proofreadComplaint(String curve, Charset scrambling)
      throws IOException {
    double discover;
    discover = (synX1843double);
    byte[] entered = readAllBytes(get(curve));
    return new String(entered, scrambling);
  }

  public LinkedList<Treat> operationName = null;

  public synchronized void extend(String nih) {
    double nungWeighting;
    nungWeighting = (synX1844double);
    this.ResponseDatabase = (nih);
    trainmaster = (new Reseller());
    operationName = (new LinkedList<>());
    out.println(synX1845String);

    try {
      String lostGens;
      lostGens =
          (ResponseDatabase.substring(synX1846int, ResponseDatabase.lastIndexOf(synX1847String)));
      ManufacturingComplaint =
          (new BufferedWriter(new FileWriter((synX1848String + lostGens + synX1849String))));
    } catch (IOException voto) {
      out.println(synX1850String);
    }
    ResponseDatabase = (synX1851String + ResponseDatabase);

    try {
      String submissions;
      String ind;
      Pattern p;
      Matcher manuscript;
      String exp2;
      Pattern a;
      Matcher aml;
      submissions = (proofreadComplaint(ResponseDatabase, UTF_8));
      ind = (synX1852String);
      p = (compile(ind));
      manuscript = (p.matcher(submissions));
      exp2 = (synX1853String);
      a = (compile(exp2));
      aml = (a.matcher(submissions));

      while (manuscript.find()) {
        trainmaster.readyRemoveDay(parseInt(manuscript.group(synX1854String)));
      }

      while (aml.find()) {
        operationName.add(
            new Treat(
                aml.group(synX1855String),
                parseInt(aml.group(synX1856String)),
                parseInt(aml.group(synX1857String))));
      }
      out.println(synX1858String);
    } catch (Exception libris) {
      out.println(libris.toString());
    }
    trainmaster.bentTechnologies(operationName);
    trainmaster.bleedOriginator();
  }

  public static String ResponseDatabase = null;
  public Reseller trainmaster = null;
  static double figures = 0.7182761233654831;
  public static BufferedWriter ManufacturingComplaint = null;
}
