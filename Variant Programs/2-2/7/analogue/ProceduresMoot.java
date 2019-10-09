package analogue;

import salesperson.Mailer;
import timer.Proceeding;
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

public class ProceduresMoot {
  private java.util.LinkedList<Proceeding> systemDocket;
  private salesperson.Mailer regulator;
  private static java.lang.String RepresentationsInitiate;
  public static java.io.BufferedWriter SupplyDocumentation;

  public void operate(java.lang.String tenants) {
    this.RepresentationsInitiate = tenants;
    regulator = new salesperson.Mailer();
    systemDocket = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String unclothedList =
          RepresentationsInitiate.substring(0, RepresentationsInitiate.lastIndexOf("."));
      SupplyDocumentation =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (java.io.IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    RepresentationsInitiate = "./out/production/c3063467A1/" + RepresentationsInitiate;

    try {
      java.lang.String stimulation =
          perusedArchives(RepresentationsInitiate, StandardCharsets.UTF_8);
      java.lang.String equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(equiv);
      java.util.regex.Matcher sm = writes.matcher(stimulation);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a3 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f2 = a3.matcher(stimulation);

      while (sm.find()) {
        regulator.fixedDeployingOpportunity(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (f2.find()) {
        systemDocket.add(
            new timer.Proceeding(
                f2.group("ID"),
                java.lang.Integer.parseInt(f2.group("Arrive")),
                java.lang.Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
    }
    regulator.placedSue(systemDocket);
    regulator.leanExporter();
  }

  private static java.lang.String perusedArchives(
      java.lang.String pattern, java.nio.charset.Charset coding) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(ciphered, coding);
  }
}
