package sim;

import distributors.Consignor;
import spooler.Mechanism;
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

  private static synchronized java.lang.String scanFolders(
      java.lang.String curve, java.nio.charset.Charset decoding) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(curve));
    return new java.lang.String(encrypted, decoding);
  }

  private static java.lang.String GuidanceFilename = null;
  public static java.io.BufferedWriter ExportationPapers = null;

  public synchronized void scarper(java.lang.String proponents) {
    this.GuidanceFilename = proponents;
    mailer = new distributors.Consignor();
    phaseDirectory = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish =
          GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    GuidanceFilename = "./out/production/c3063467A1/" + GuidanceFilename;

    try {
      java.lang.String opinion = scanFolders(GuidanceFilename, StandardCharsets.UTF_8);
      java.lang.String reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(reciprocal);
      java.util.regex.Matcher sm = postscript.matcher(opinion);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern c4 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher aml = c4.matcher(opinion);

      while (sm.find()) {
        mailer.arrangedCompleteSentence(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (aml.find()) {
        phaseDirectory.add(
            new spooler.Mechanism(
                aml.group("ID"),
                java.lang.Integer.parseInt(aml.group("Arrive")),
                java.lang.Integer.parseInt(aml.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abbe) {
      System.out.println(abbe.toString());
    }
    mailer.prepareMethodologies(phaseDirectory);
    mailer.testDistributors();
  }

  private java.util.LinkedList<Mechanism> phaseDirectory = null;
  private distributors.Consignor mailer = null;
}
