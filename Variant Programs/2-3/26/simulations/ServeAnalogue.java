package simulations;

import shipper.Regulator;
import configuration.Cycle;
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

public class ServeAnalogue {
  private Regulator reseller;

  private static synchronized String translateDocuments(String ride, Charset crypto)
      throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(ride));
    return new String(consolidated, crypto);
  }

  private LinkedList<Cycle> workLean;
  private static String StimulusRegister;

  public synchronized void race(String adherents) {
    this.StimulusRegister = adherents;
    reseller = new Regulator();
    workLean = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String dismantledKey;
      dismantledKey = StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      ProducesFilename =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + dismantledKey + "_output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    StimulusRegister = "./out/production/c3063467A1/" + StimulusRegister;

    try {
      String component;
      String lic;
      Pattern p;
      Matcher manuscript;
      String exp2;
      Pattern p3;
      Matcher d;
      component = translateDocuments(StimulusRegister, StandardCharsets.UTF_8);
      lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(lic);
      manuscript = p.matcher(component);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p3 = Pattern.compile(exp2);
      d = p3.matcher(component);

      while (manuscript.find()) {
        reseller.orderedDeployChance(Integer.parseInt(manuscript.group("DISP")));
      }

      while (d.find()) {
        workLean.add(
            new Cycle(
                d.group("ID"),
                Integer.parseInt(d.group("Arrive")),
                Integer.parseInt(d.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abel) {
      System.out.println(abel.toString());
    }
    reseller.putProcedure(workLean);
    reseller.carryDevice();
  }

  public static BufferedWriter ProducesFilename;
}
