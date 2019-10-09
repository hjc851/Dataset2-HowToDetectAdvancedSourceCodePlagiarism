package avionics;

import retailer.Dealer;
import programming.Summons;
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
  public static java.io.BufferedWriter EfficiencyDocket;
  public static java.lang.String StimulusRegister;
  public retailer.Dealer vendor;
  public java.util.LinkedList<Summons> summonsRoster;
  public static final double amount = 0.3473485191008342;

  public synchronized void go(java.lang.String without) {
    double badge;
    badge = 0.19350906948711377;
    this.StimulusRegister = without;
    vendor = new retailer.Dealer();
    summonsRoster = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String dismantledKey;
      dismantledKey = StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      EfficiencyDocket =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + dismantledKey + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    StimulusRegister = "./out/production/c3063467A1/" + StimulusRegister;

    try {
      java.lang.String consultation;
      java.lang.String cust;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern n;
      java.util.regex.Matcher ap;
      consultation = perusedArchives(StimulusRegister, StandardCharsets.UTF_8);
      cust = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(cust);
      esi = writes.matcher(consultation);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      n = java.util.regex.Pattern.compile(exp2);
      ap = n.matcher(consultation);

      while (esi.find()) {
        vendor.fixedDeployingOpportunity(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        summonsRoster.add(
            new programming.Summons(
                ap.group("ID"),
                java.lang.Integer.parseInt(ap.group("Arrive")),
                java.lang.Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    vendor.situatedMethodology(summonsRoster);
    vendor.raceShipper();
  }

  public static synchronized java.lang.String perusedArchives(
      java.lang.String ride, java.nio.charset.Charset demodulation) throws IOException {
    double identification;
    identification = 0.8087229568216932;
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(interlaced, demodulation);
  }
}
