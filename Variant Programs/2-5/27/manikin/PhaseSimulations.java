package manikin;

import consignor.Distributor;
import programmer.Operation;
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
  private static final String synX2235String = "Finished reading input file...";
  private static final String synX2234String = "SIZE";
  private static final String synX2233String = "Arrive";
  private static final String synX2232String = "ID";
  private static final String synX2231String = "DISP";
  private static final String synX2230String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2229String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2228String = "./out/production/c3063467A1/";
  private static final String synX2227String = "Unable to generate output file.";
  private static final String synX2226String = "_output.txt";
  private static final String synX2225String = "./out/production/c3063467A1/";
  private static final String synX2224String = ".";
  private static final int synX2223int = 0;
  private static final String synX2222String = "Reading in input file...";

  public static synchronized String showDocumentation(String roadway, Charset coded)
      throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(roadway));
    return new String(interlaced, coded);
  }

  public synchronized void drive(String nih) {
    this.InvolvementData = (nih);
    distributor = (new Distributor());
    proceedingsPlaylist = (new LinkedList<>());
    System.out.println(synX2222String);

    try {
      String removedIdentify =
          InvolvementData.substring(synX2223int, InvolvementData.lastIndexOf(synX2224String));
      ManufacturingComplaint =
          (new BufferedWriter(new FileWriter((synX2225String + removedIdentify + synX2226String))));
    } catch (IOException abbe) {
      System.out.println(synX2227String);
    }
    InvolvementData = (synX2228String + InvolvementData);

    try {
      String advice = showDocumentation(InvolvementData, StandardCharsets.UTF_8);
      String skil = synX2229String;
      Pattern p = Pattern.compile(skil);
      Matcher dos = p.matcher(advice);
      String exp2 = synX2230String;
      Pattern g = Pattern.compile(exp2);
      Matcher b = g.matcher(advice);

      while (dos.find()) {
        distributor.arrangeSentYears(Integer.parseInt(dos.group(synX2231String)));
      }

      while (b.find()) {
        proceedingsPlaylist.add(
            new Operation(
                b.group(synX2232String),
                Integer.parseInt(b.group(synX2233String)),
                Integer.parseInt(b.group(synX2234String))));
      }
      System.out.println(synX2235String);
    } catch (Exception admittedly) {
      System.out.println(admittedly.toString());
    }
    distributor.settledServe(proceedingsPlaylist);
    distributor.carryDevice();
  }

  public static BufferedWriter ManufacturingComplaint;
  public Distributor distributor;
  public LinkedList<Operation> proceedingsPlaylist;
  public static String InvolvementData;
}
