package mockup;

import vendor.Starter;
import planner.March;
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

public class MethodologyEmulator {
  private static java.lang.String ContributionsDocket = null;

  public synchronized void outpouring(java.lang.String nsi) {
    this.ContributionsDocket = nsi;
    coordinator = new vendor.Starter();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String dismantledKey;
      dismantledKey = ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ProducedExecutable =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + dismantledKey + "_output.txt"));
    } catch (java.io.IOException former) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      java.lang.String guidance;
      java.lang.String equiv;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern a;
      java.util.regex.Matcher f2;
      guidance = readableArchiving(ContributionsDocket, StandardCharsets.UTF_8);
      equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(equiv);
      dos = cern.matcher(guidance);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      a = java.util.regex.Pattern.compile(exp2);
      f2 = a.matcher(guidance);

      while (dos.find()) {
        coordinator.dictatedCommuniqueMeter(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (f2.find()) {
        outgrowthBlacklist.add(
            new planner.March(
                f2.group("ID"),
                java.lang.Integer.parseInt(f2.group("Arrive")),
                java.lang.Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
    }
    coordinator.readyMarch(outgrowthBlacklist);
    coordinator.leadCoordinator();
  }

  public static java.io.BufferedWriter ProducedExecutable = null;

  private static synchronized java.lang.String readableArchiving(
      java.lang.String lane, java.nio.charset.Charset code) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(keyed, code);
  }

  private vendor.Starter coordinator = null;
  private java.util.LinkedList<March> outgrowthBlacklist = null;
}
