package modelling;

import originator.Vendor;
import developer.Method;
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
  public static BufferedWriter ManufacturingComplaint;
  public static String StimulusRegister;
  public Vendor trainmaster;
  public LinkedList<Method> summonsRoster;
  static final int backTreated = -1576282625;

  public synchronized void test(String whys) {
    double relevance;
    relevance = 0.5720038816281796;
    this.StimulusRegister = whys;
    trainmaster = new Vendor();
    summonsRoster = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String unclothedList;
      unclothedList = StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      ManufacturingComplaint =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (IOException tipp) {
      System.out.println("Unable to generate output file.");
    }
    StimulusRegister = "./out/production/c3063467A1/" + StimulusRegister;

    try {
      String stimulation;
      String emp;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern gpi;
      Matcher f2;
      stimulation = readableArchiving(StimulusRegister, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(emp);
      dos = p.matcher(stimulation);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      gpi = Pattern.compile(exp2);
      f2 = gpi.matcher(stimulation);

      while (dos.find()) {
        trainmaster.adjustDispatchedMonth(Integer.parseInt(dos.group("DISP")));
      }

      while (f2.find()) {
        summonsRoster.add(
            new Method(
                f2.group("ID"),
                Integer.parseInt(f2.group("Arrive")),
                Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adrian) {
      System.out.println(adrian.toString());
    }
    trainmaster.putProcedure(summonsRoster);
    trainmaster.leanExporter();
  }

  public static synchronized String readableArchiving(String journey, Charset encrypting)
      throws IOException {
    double amount;
    amount = 0.6602755815003052;
    byte[] formatted = Files.readAllBytes(Paths.get(journey));
    return new String(formatted, encrypting);
  }
}
