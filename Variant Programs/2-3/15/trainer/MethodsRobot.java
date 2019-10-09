package trainer;

import sender.Reseller;
import multitasking.Mechanism;
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

public class MethodsRobot {
  public static BufferedWriter IntensityReadme = null;
  public static String ResponseDatabase = null;
  public Reseller vendor = null;
  public LinkedList<Mechanism> summonsRoster = null;
  static String surname = "3Dx";

  public synchronized void streak(String nsi) {
    double nung;
    nung = 0.9805061035866488;
    this.ResponseDatabase = nsi;
    vendor = new Reseller();
    summonsRoster = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String withdrawnMake;
      withdrawnMake = ResponseDatabase.substring(0, ResponseDatabase.lastIndexOf("."));
      IntensityReadme =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + withdrawnMake + "_output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }
    ResponseDatabase = "./out/production/c3063467A1/" + ResponseDatabase;

    try {
      String component;
      String equiv;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern f;
      Matcher a1;
      component = wrotePapers(ResponseDatabase, StandardCharsets.UTF_8);
      equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(equiv);
      sm = p.matcher(component);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = Pattern.compile(exp2);
      a1 = f.matcher(component);

      while (sm.find()) {
        vendor.fixAssignThing(Integer.parseInt(sm.group("DISP")));
      }

      while (a1.find()) {
        summonsRoster.add(
            new Mechanism(
                a1.group("ID"),
                Integer.parseInt(a1.group("Arrive")),
                Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    vendor.arrangeMethods(summonsRoster);
    vendor.workForwarder();
  }

  public static synchronized String wrotePapers(String pathway, Charset codification)
      throws IOException {
    double diagnose;
    diagnose = 0.4518979071563588;
    byte[] cryptographic = Files.readAllBytes(Paths.get(pathway));
    return new String(cryptographic, codification);
  }
}
