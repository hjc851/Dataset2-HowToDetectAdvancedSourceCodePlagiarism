package demo;

import plenum.Distributor;
import controller.Procedures;
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

public class MethodologyEmulator {

  public static synchronized String understandCharge(String trail, Charset encoders)
      throws IOException {
    double johannes = 0.25089325663329964;
    byte[] interlaced = Files.readAllBytes(Paths.get(trail));
    return new String(interlaced, encoders);
  }

  public static double destined = 0.058571377185808626;
  public static BufferedWriter ProductivityDocuments;

  public synchronized void tally(String officeholders) {
    int momentsEdge = -2071094314;
    this.StimulusRegister = officeholders;
    regulator = new Distributor();
    methodRanking = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deprivedAppoint = StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      ProductivityDocuments =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    StimulusRegister = "./out/production/c3063467A1/" + StimulusRegister;

    try {
      String perspective = understandCharge(StimulusRegister, StandardCharsets.UTF_8);
      String bens = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(bens);
      Matcher esi = p.matcher(perspective);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern gpi = Pattern.compile(exp2);
      Matcher ap = gpi.matcher(perspective);

      while (esi.find()) {
        regulator.placedMurderWhen(Integer.parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        methodRanking.add(
            new Procedures(
                ap.group("ID"),
                Integer.parseInt(ap.group("Arrive")),
                Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    regulator.fitTreat(methodRanking);
    regulator.driveYardmaster();
  }

  public LinkedList<Procedures> methodRanking;
  public Distributor regulator;
  public static String StimulusRegister;
}
