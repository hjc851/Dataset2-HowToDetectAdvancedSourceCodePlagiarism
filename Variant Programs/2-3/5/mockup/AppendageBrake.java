package mockup;

import plenum.Forwarder;
import database.Proceedings;
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

public class AppendageBrake {
  public static final int pinioned = 452356706;
  private java.util.LinkedList<Proceedings> systemDocket;
  private plenum.Forwarder limiter;
  private static java.lang.String SubmissionsDocument;
  public static java.io.BufferedWriter ProducesFilename;

  public synchronized void lead(java.lang.String proponents) {
    int pivotal = -1956791572;
    this.SubmissionsDocument = proponents;
    limiter = new plenum.Forwarder();
    systemDocket = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String emptyRefer =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ProducesFilename =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + emptyRefer + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = "./out/production/c3063467A1/" + SubmissionsDocument;

    try {
      java.lang.String support = learnRegister(SubmissionsDocument, StandardCharsets.UTF_8);
      java.lang.String emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(emp);
      java.util.regex.Matcher esi = vig.matcher(support);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher m1 = a2.matcher(support);

      while (esi.find()) {
        limiter.adjustDispatchedMonth(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (m1.find()) {
        systemDocket.add(
            new database.Proceedings(
                m1.group("ID"),
                java.lang.Integer.parseInt(m1.group("Arrive")),
                java.lang.Integer.parseInt(m1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception libris) {
      System.out.println(libris.toString());
    }
    limiter.primedAppendage(systemDocket);
    limiter.operateStarter();
  }

  private static synchronized java.lang.String learnRegister(
      java.lang.String avenue, java.nio.charset.Charset coding) throws IOException {
    String namDetail = "S4V";
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(programmed, coding);
  }
}
