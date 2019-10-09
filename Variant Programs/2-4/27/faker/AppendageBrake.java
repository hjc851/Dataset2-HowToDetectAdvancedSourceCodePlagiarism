package faker;

import salesperson.Yardmaster;
import programmer.Serve;
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

public class AppendageBrake {

  public synchronized void move(String nsis) {
    String thresholds;
    thresholds = "phj5leeDor6B08i";
    this.PerspectiveApplication = nsis;
    dealer = new Yardmaster();
    workLean = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String denudedDiagnose;
      denudedDiagnose =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      ExportSubmit =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      String feedback;
      String plu;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern p4;
      Matcher aml;
      feedback = rereadSubmitted(PerspectiveApplication, StandardCharsets.UTF_8);
      plu = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(plu);
      esi = p.matcher(feedback);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p4 = Pattern.compile(exp2);
      aml = p4.matcher(feedback);

      while (esi.find()) {
        dealer.determinedDischargeDays(Integer.parseInt(esi.group("DISP")));
      }

      while (aml.find()) {
        workLean.add(
            new Serve(
                aml.group("ID"),
                Integer.parseInt(aml.group("Arrive")),
                Integer.parseInt(aml.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    dealer.orderedMechanisms(workLean);
    dealer.prevailDistributor();
  }

  static String juniorRestriction = "BJCRljDa";
  public LinkedList<Serve> workLean;
  public Yardmaster dealer;
  public static String PerspectiveApplication;
  public static BufferedWriter ExportSubmit;

  public static synchronized String rereadSubmitted(String trails, Charset cipher)
      throws IOException {
    int pettyDemarcation;
    pettyDemarcation = 276930212;
    byte[] interlaced = Files.readAllBytes(Paths.get(trails));
    return new String(interlaced, cipher);
  }
}
