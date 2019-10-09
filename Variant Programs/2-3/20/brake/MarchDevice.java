package brake;

import exporter.Shipper;
import synchronizer.Act;
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

public class MarchDevice {
  public static java.io.BufferedWriter ThroughputDocument;
  public java.util.LinkedList<Act> litigateLeaning;

  public static synchronized java.lang.String showDocumentation(
      java.lang.String trails, java.nio.charset.Charset encrypting) throws IOException {
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(synthesized, encrypting);
  }

  public exporter.Shipper starter;
  public static java.lang.String ContributionsDocket;

  public synchronized void outpouring(java.lang.String proponents) {
    this.ContributionsDocket = proponents;
    starter = new exporter.Shipper();
    litigateLeaning = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String withdrawnMake =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ThroughputDocument =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + withdrawnMake + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      java.lang.String consultation =
          showDocumentation(ContributionsDocket, StandardCharsets.UTF_8);
      java.lang.String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(skil);
      java.util.regex.Matcher esi = postscript.matcher(consultation);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ribulose = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher a2 = ribulose.matcher(consultation);

      while (esi.find()) {
        starter.fixedDeployingOpportunity(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (a2.find()) {
        litigateLeaning.add(
            new synchronizer.Act(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abdul) {
      System.out.println(abdul.toString());
    }
    starter.determinedOutgrowth(litigateLeaning);
    starter.outpouringPlenum();
  }
}
