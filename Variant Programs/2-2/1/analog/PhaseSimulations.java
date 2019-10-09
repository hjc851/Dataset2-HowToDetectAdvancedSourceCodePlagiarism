package analog;

import shipper.Yardmaster;
import server.Sue;
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

public class PhaseSimulations {
  private java.util.LinkedList<Sue> methodologyRegistry;
  private shipper.Yardmaster salesperson;
  private static java.lang.String InvolvementData;
  public static java.io.BufferedWriter EfficiencyDocket;

  public void ram(java.lang.String incumbents) {
    this.InvolvementData = incumbents;
    salesperson = new shipper.Yardmaster();
    methodologyRegistry = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String deletedSurname =
          InvolvementData.substring(0, InvolvementData.lastIndexOf("."));
      EfficiencyDocket =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + deletedSurname + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    InvolvementData = "./out/production/c3063467A1/" + InvolvementData;

    try {
      java.lang.String component = rereadSubmitted(InvolvementData, StandardCharsets.UTF_8);
      java.lang.String svc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(svc);
      java.util.regex.Matcher sm = writes.matcher(component);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern gpi = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher e2 = gpi.matcher(component);

      while (sm.find()) {
        salesperson.primedExpeditionPeriod(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (e2.find()) {
        methodologyRegistry.add(
            new server.Sue(
                e2.group("ID"),
                java.lang.Integer.parseInt(e2.group("Arrive")),
                java.lang.Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
    }
    salesperson.determinedOutgrowth(methodologyRegistry);
    salesperson.prevailDistributor();
  }

  private static java.lang.String rereadSubmitted(
      java.lang.String pathways, java.nio.charset.Charset encrypting) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathways));
    return new java.lang.String(cryptographic, encrypting);
  }
}
