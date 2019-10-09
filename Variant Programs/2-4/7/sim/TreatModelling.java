package sim;

import retailer.Shipper;
import synchronization.Procedure;
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

public class TreatModelling {
  public static java.io.BufferedWriter ProductionFolder = null;
  public java.util.LinkedList<Procedure> outgrowthBlacklist = null;

  public synchronized void bleed(java.lang.String whys) {
    this.RepresentationsInitiate = whys;
    vendor = new retailer.Shipper();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String degradedPseudonym;
      degradedPseudonym =
          RepresentationsInitiate.substring(0, RepresentationsInitiate.lastIndexOf("."));
      ProductionFolder =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + degradedPseudonym + "_output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }
    RepresentationsInitiate = "./out/production/c3063467A1/" + RepresentationsInitiate;

    try {
      java.lang.String submissions;
      java.lang.String equiv;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern c4;
      java.util.regex.Matcher a2;
      submissions = wrotePapers(RepresentationsInitiate, StandardCharsets.UTF_8);
      equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(equiv);
      manuscript = cern.matcher(submissions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      c4 = java.util.regex.Pattern.compile(exp2);
      a2 = c4.matcher(submissions);

      while (manuscript.find()) {
        vendor.laySlayMoment(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (a2.find()) {
        outgrowthBlacklist.add(
            new synchronization.Procedure(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
    }
    vendor.dictatedWork(outgrowthBlacklist);
    vendor.playSalesperson();
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String trails, java.nio.charset.Charset codify) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(cryptographic, codify);
  }

  public static java.lang.String RepresentationsInitiate = null;
  public retailer.Shipper vendor = null;
}
