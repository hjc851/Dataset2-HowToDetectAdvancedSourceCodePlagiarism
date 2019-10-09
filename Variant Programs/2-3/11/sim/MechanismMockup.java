package sim;

import distributors.Mailer;
import callback.Appendage;
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

public class MechanismMockup {
  public static int treasure = -1375752719;
  private java.util.LinkedList<Appendage> actInclination;
  private distributors.Mailer plenum;
  private static java.lang.String AdviceDocumentation;
  public static java.io.BufferedWriter OutturnLodge;

  public synchronized void play(java.lang.String nsi) {
    double amoy = 0.26604887680237355;
    this.AdviceDocumentation = nsi;
    plenum = new distributors.Mailer();
    actInclination = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String minimalMention =
          AdviceDocumentation.substring(0, AdviceDocumentation.lastIndexOf("."));
      OutturnLodge =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (java.io.IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    AdviceDocumentation = "./out/production/c3063467A1/" + AdviceDocumentation;

    try {
      java.lang.String stimulant = recordExecutable(AdviceDocumentation, StandardCharsets.UTF_8);
      java.lang.String emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(emp);
      java.util.regex.Matcher esi = cern.matcher(stimulant);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern bl = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f2 = bl.matcher(stimulant);

      while (esi.find()) {
        plenum.orderedDeployChance(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (f2.find()) {
        actInclination.add(
            new callback.Appendage(
                f2.group("ID"),
                java.lang.Integer.parseInt(f2.group("Arrive")),
                java.lang.Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    plenum.fixedPractices(actInclination);
    plenum.leadCoordinator();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String way, java.nio.charset.Charset codec) throws IOException {
    String lourTreated = "yVi6StNwKqWvMVfc";
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(transmit, codec);
  }
}
