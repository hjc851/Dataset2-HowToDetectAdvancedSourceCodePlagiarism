package prototype;

import distributors.Distributor;
import callback.System;
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

public class LitigateMimic {
  private java.util.LinkedList<System> procedureNumber;
  private distributors.Distributor distributor;
  private static java.lang.String ContributionsDocket;
  public static java.io.BufferedWriter ProducerSubmitted;

  public void play(java.lang.String adherents) {
    this.ContributionsDocket = adherents;
    distributor = new distributors.Distributor();
    procedureNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String abolishedDiscover =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ProducerSubmitted =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"));
    } catch (java.io.IOException adult) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      java.lang.String support = hearBinder(ContributionsDocket, StandardCharsets.UTF_8);
      java.lang.String supp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(supp);
      java.util.regex.Matcher esi = postscript.matcher(support);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern g = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher fc = g.matcher(support);

      while (esi.find()) {
        distributor.adjustDispatchedMonth(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (fc.find()) {
        procedureNumber.add(
            new callback.System(
                fc.group("ID"),
                java.lang.Integer.parseInt(fc.group("Arrive")),
                java.lang.Integer.parseInt(fc.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception libris) {
      System.out.println(libris.toString());
    }
    distributor.situatedMethodology(procedureNumber);
    distributor.goTrainmaster();
  }

  private static java.lang.String hearBinder(java.lang.String way, java.nio.charset.Charset cipher)
      throws IOException {
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(captioned, cipher);
  }
}
