package faker;

import consignor.Dealer;
import spreadsheet.Procedure;
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

public class SummonsFaker {
  private static final String synX882String = "Finished reading input file...";
  private static final String synX881String = "SIZE";
  private static final String synX880String = "Arrive";
  private static final String synX879String = "ID";
  private static final String synX878String = "DISP";
  private static final String synX877String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX876String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX875String = "./out/production/c3063467A1/";
  private static final String synX874String = "Unable to generate output file.";
  private static final String synX873String = "_output.txt";
  private static final String synX872String = "./out/production/c3063467A1/";
  private static final String synX871String = ".";
  private static final int synX870int = 0;
  private static final String synX869String = "Reading in input file...";
  private java.util.LinkedList<Procedure> operationName = null;
  private consignor.Dealer regulator = null;
  private static java.lang.String ParticipatoryArchiving = null;
  public static java.io.BufferedWriter ProductionFolder = null;

  public synchronized void melt(java.lang.String elected) {
    this.ParticipatoryArchiving = (elected);
    regulator = (new consignor.Dealer());
    operationName = (new java.util.LinkedList<>());
    System.out.println(synX869String);

    try {
      java.lang.String peeledFigure =
          ParticipatoryArchiving.substring(
              synX870int, ParticipatoryArchiving.lastIndexOf(synX871String));
      ProductionFolder =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX872String + peeledFigure + synX873String))));
    } catch (java.io.IOException eden) {
      System.out.println(synX874String);
    }
    ParticipatoryArchiving = (synX875String + ParticipatoryArchiving);

    try {
      java.lang.String suggestions =
          aloudApplication(ParticipatoryArchiving, StandardCharsets.UTF_8);
      java.lang.String skil = synX876String;
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(skil);
      java.util.regex.Matcher dos = cern.matcher(suggestions);
      java.lang.String exp2 = synX877String;
      java.util.regex.Pattern a2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher fio = a2.matcher(suggestions);

      while (dos.find()) {
        regulator.placeRoutingWeek(java.lang.Integer.parseInt(dos.group(synX878String)));
      }

      while (fio.find()) {
        operationName.add(
            new spreadsheet.Procedure(
                fio.group(synX879String),
                java.lang.Integer.parseInt(fio.group(synX880String)),
                java.lang.Integer.parseInt(fio.group(synX881String))));
      }
      System.out.println(synX882String);
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    regulator.layLitigate(operationName);
    regulator.workForwarder();
  }

  private static synchronized java.lang.String aloudApplication(
      java.lang.String destiny, java.nio.charset.Charset codified) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(encrypted, codified);
  }
}
