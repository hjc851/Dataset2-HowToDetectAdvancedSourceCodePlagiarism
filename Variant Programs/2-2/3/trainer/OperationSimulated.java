package trainer;

import regulator.Device;
import database.Litigate;
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

public class OperationSimulated {
  private java.util.LinkedList<Litigate> proceedingRosters;
  private regulator.Device forwarder;
  private static java.lang.String OpinionExecutable;
  public static java.io.BufferedWriter EfficiencyDocket;

  public void outpouring(java.lang.String adherents) {
    this.OpinionExecutable = adherents;
    forwarder = new regulator.Device();
    proceedingRosters = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String dismantledKey =
          OpinionExecutable.substring(0, OpinionExecutable.lastIndexOf("."));
      EfficiencyDocket =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + dismantledKey + "_output.txt"));
    } catch (java.io.IOException former) {
      System.out.println("Unable to generate output file.");
    }
    OpinionExecutable = "./out/production/c3063467A1/" + OpinionExecutable;

    try {
      java.lang.String information = showDocumentation(OpinionExecutable, StandardCharsets.UTF_8);
      java.lang.String equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(equiv);
      java.util.regex.Matcher esi = cern.matcher(information);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern b2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher e = b2.matcher(information);

      while (esi.find()) {
        forwarder.markDispatchesHours(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (e.find()) {
        proceedingRosters.add(
            new database.Litigate(
                e.group("ID"),
                java.lang.Integer.parseInt(e.group("Arrive")),
                java.lang.Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    forwarder.putProcedure(proceedingRosters);
    forwarder.testDistributors();
  }

  private static java.lang.String showDocumentation(
      java.lang.String pattern, java.nio.charset.Charset coded) throws IOException {
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(synthesized, coded);
  }
}
