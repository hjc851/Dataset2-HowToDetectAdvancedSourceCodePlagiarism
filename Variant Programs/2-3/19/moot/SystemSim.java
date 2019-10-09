package moot;

import yardmaster.Starter;
import outliner.System;
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

public class SystemSim {
  public LinkedList<System> proceedingsPlaylist;
  public Starter reseller;
  public static BufferedWriter ProducedExecutable;
  public static String StimulantCharge;

  public synchronized void melt(String nsi) {
    this.StimulantCharge = nsi;
    reseller = new Starter();
    proceedingsPlaylist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String rippedCall;
      rippedCall = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      ProducedExecutable =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + rippedCall + "_output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      String perspective;
      String skil;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern a3;
      Matcher aml;
      perspective = readableArchiving(StimulantCharge, StandardCharsets.UTF_8);
      skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(skil);
      dos = p.matcher(perspective);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      a3 = Pattern.compile(exp2);
      aml = a3.matcher(perspective);

      while (dos.find()) {
        reseller.determineDetachmentBeginning(Integer.parseInt(dos.group("DISP")));
      }

      while (aml.find()) {
        proceedingsPlaylist.add(
            new System(
                aml.group("ID"),
                Integer.parseInt(aml.group("Arrive")),
                Integer.parseInt(aml.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    reseller.bentTechnologies(proceedingsPlaylist);
    reseller.testDistributors();
  }

  public static synchronized String readableArchiving(String road, Charset encrypt)
      throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(road));
    return new String(concatenated, encrypt);
  }
}
