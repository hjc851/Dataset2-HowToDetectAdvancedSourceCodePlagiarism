package sim;

import forwarder.Distributor;
import configuration.Sue;
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

  public static synchronized java.lang.String writeDatabase(
      java.lang.String road, java.nio.charset.Charset encoders) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(keyed, encoders);
  }

  public forwarder.Distributor distributors = null;
  public static java.io.BufferedWriter SupplyDocumentation = null;
  public static java.lang.String ContributionsDocket = null;

  public synchronized void test(java.lang.String without) {
    this.ContributionsDocket = without;
    distributors = new forwarder.Distributor();
    mechanismsBibliography = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String dismantledKey;
      dismantledKey = ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      SupplyDocumentation =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + dismantledKey + "_output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      java.lang.String perspective;
      java.lang.String knowl;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern g;
      java.util.regex.Matcher ap;
      perspective = writeDatabase(ContributionsDocket, StandardCharsets.UTF_8);
      knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = java.util.regex.Pattern.compile(knowl);
      manuscript = postscript.matcher(perspective);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      g = java.util.regex.Pattern.compile(exp2);
      ap = g.matcher(perspective);

      while (manuscript.find()) {
        distributors.situatedDeploymentMinutes(
            java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (ap.find()) {
        mechanismsBibliography.add(
            new configuration.Sue(
                ap.group("ID"),
                java.lang.Integer.parseInt(ap.group("Arrive")),
                java.lang.Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception pro) {
      System.out.println(pro.toString());
    }
    distributors.arrangedAct(mechanismsBibliography);
    distributors.passMailer();
  }

  public java.util.LinkedList<Sue> mechanismsBibliography = null;
}
