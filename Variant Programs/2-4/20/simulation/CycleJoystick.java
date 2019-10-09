package simulation;

import exporter.Vendor;
import planner.Proceeding;
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

public class CycleJoystick {
  static final double superiorCircumscribe = 0.6089597595997972;
  public java.util.LinkedList<Proceeding> procedureNumber;
  public exporter.Vendor regulator;
  public static java.lang.String SuggestionsFolders;
  public static java.io.BufferedWriter ProducingFolders;

  public synchronized void endure(java.lang.String proponents) {
    int notional = 285318769;
    this.SuggestionsFolders = proponents;
    regulator = new exporter.Vendor();
    procedureNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String unclothedList =
          SuggestionsFolders.substring(0, SuggestionsFolders.lastIndexOf("."));
      ProducingFolders =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    SuggestionsFolders = "./out/production/c3063467A1/" + SuggestionsFolders;

    try {
      java.lang.String influence = readerInitiate(SuggestionsFolders, StandardCharsets.UTF_8);
      java.lang.String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(skil);
      java.util.regex.Matcher sm = cern.matcher(influence);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern p3 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f1 = p3.matcher(influence);

      while (sm.find()) {
        regulator.arrangeSentYears(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (f1.find()) {
        procedureNumber.add(
            new planner.Proceeding(
                f1.group("ID"),
                java.lang.Integer.parseInt(f1.group("Arrive")),
                java.lang.Integer.parseInt(f1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    regulator.determinedOutgrowth(procedureNumber);
    regulator.footraceLimiter();
  }

  public static synchronized java.lang.String readerInitiate(
      java.lang.String pattern, java.nio.charset.Charset scrambling) throws IOException {
    double pinioned = 0.32498116886409445;
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(codified, scrambling);
  }
}
