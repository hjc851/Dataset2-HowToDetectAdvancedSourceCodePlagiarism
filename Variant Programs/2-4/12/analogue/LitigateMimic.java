package analogue;

import distributors.Salesperson;
import initialization.Mechanism;
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
  public java.util.LinkedList<Mechanism> outgrowthBlacklist;

  public synchronized void scarper(java.lang.String incumbents) {
    this.SupportPaperwork = incumbents;
    shipper = new distributors.Salesperson();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String unclothedList;
      unclothedList = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      ProducedExecutable =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (java.io.IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      java.lang.String advice;
      java.lang.String yrs;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern bl;
      java.util.regex.Matcher f3;
      advice = sayFolder(SupportPaperwork, StandardCharsets.UTF_8);
      yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = java.util.regex.Pattern.compile(yrs);
      esi = postscript.matcher(advice);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      bl = java.util.regex.Pattern.compile(exp2);
      f3 = bl.matcher(advice);

      while (esi.find()) {
        shipper.fitExpeditiousnessYear(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (f3.find()) {
        outgrowthBlacklist.add(
            new initialization.Mechanism(
                f3.group("ID"),
                java.lang.Integer.parseInt(f3.group("Arrive")),
                java.lang.Integer.parseInt(f3.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    shipper.solidifyingOperations(outgrowthBlacklist);
    shipper.driveYardmaster();
  }

  public static java.io.BufferedWriter ProducedExecutable;
  public static java.lang.String SupportPaperwork;
  public distributors.Salesperson shipper;

  public static synchronized java.lang.String sayFolder(
      java.lang.String ride, java.nio.charset.Charset encrypted) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(entered, encrypted);
  }
}
