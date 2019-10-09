package impactor;

import limiter.Originator;
import spreadsheet.Summons;
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

public class ProcedureSimulation {

  public static synchronized java.lang.String quoteData(
      java.lang.String trails, java.nio.charset.Charset encrypted) throws IOException {
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(demodulated, encrypted);
  }

  public static java.lang.String ContributionsDocket;

  public synchronized void move(java.lang.String cbs) {
    this.ContributionsDocket = cbs;
    distributors = new limiter.Originator();
    methodologyRegistry = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String deprivedAppoint =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ThroughputDocument =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (java.io.IOException officio) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      java.lang.String submissions = quoteData(ContributionsDocket, StandardCharsets.UTF_8);
      java.lang.String plu = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(plu);
      java.util.regex.Matcher sm = cern.matcher(submissions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern f2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher e2 = f2.matcher(submissions);

      while (sm.find()) {
        distributors.laidShipmentClip(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (e2.find()) {
        methodologyRegistry.add(
            new spreadsheet.Summons(
                e2.group("ID"),
                java.lang.Integer.parseInt(e2.group("Arrive")),
                java.lang.Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
    }
    distributors.readyMarch(methodologyRegistry);
    distributors.driveYardmaster();
  }

  public java.util.LinkedList<Summons> methodologyRegistry;
  public limiter.Originator distributors;
  public static java.io.BufferedWriter ThroughputDocument;
}
