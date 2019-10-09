package robot;

import reseller.Yardmaster;
import planner.Cycle;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class SummonsFaker {
  private static final String synX1606String = "SBmS";
  private static final String synX1605String = "Finished reading input file...";
  private static final String synX1604String = "SIZE";
  private static final String synX1603String = "Arrive";
  private static final String synX1602String = "ID";
  private static final String synX1601String = "DISP";
  private static final String synX1600String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1599String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1598String = "./out/production/c3063467A1/";
  private static final String synX1597String = "Unable to generate output file.";
  private static final String synX1596String = "_output.txt";
  private static final String synX1595String = "./out/production/c3063467A1/";
  private static final String synX1594String = ".";
  private static final int synX1593int = 0;
  private static final String synX1592String = "Reading in input file...";
  private static final double synX1591double = 0.4713408196414419;
  public static java.io.BufferedWriter ProducesFilename = null;
  public static java.lang.String ConsultationSubmit = null;
  public reseller.Yardmaster yardmaster = null;
  public java.util.LinkedList<Cycle> summonsRoster = null;
  public static final double nickSpan = 0.09988112976215646;

  public synchronized void scarper(java.lang.String elected) {
    double guarantee;
    guarantee = (synX1591double);
    this.ConsultationSubmit = (elected);
    yardmaster = (new reseller.Yardmaster());
    summonsRoster = (new java.util.LinkedList<>());
    System.out.println(synX1592String);

    try {
      java.lang.String withdrawnMake;
      withdrawnMake =
          (ConsultationSubmit.substring(
              synX1593int, ConsultationSubmit.lastIndexOf(synX1594String)));
      ProducesFilename =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX1595String + withdrawnMake + synX1596String))));
    } catch (java.io.IOException late) {
      System.out.println(synX1597String);
    }
    ConsultationSubmit = (synX1598String + ConsultationSubmit);

    try {
      java.lang.String influence;
      java.lang.String mgr;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern p4;
      java.util.regex.Matcher fig;
      influence = (learnRegister(ConsultationSubmit, StandardCharsets.UTF_8));
      mgr = (synX1599String);
      writes = (compile(mgr));
      esi = (writes.matcher(influence));
      exp2 = (synX1600String);
      p4 = (compile(exp2));
      fig = (p4.matcher(influence));

      while (esi.find()) {
        yardmaster.placeRoutingWeek(parseInt(esi.group(synX1601String)));
      }

      while (fig.find()) {
        summonsRoster.add(
            new planner.Cycle(
                fig.group(synX1602String),
                parseInt(fig.group(synX1603String)),
                parseInt(fig.group(synX1604String))));
      }
      System.out.println(synX1605String);
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
    }
    yardmaster.arrangeMethods(summonsRoster);
    yardmaster.leadCoordinator();
  }

  public static synchronized java.lang.String learnRegister(
      java.lang.String ride, java.nio.charset.Charset cipher) throws IOException {
    String numbers;
    numbers = (synX1606String);
    byte[] interlaced = readAllBytes(get(ride));
    return new java.lang.String(interlaced, cipher);
  }
}
