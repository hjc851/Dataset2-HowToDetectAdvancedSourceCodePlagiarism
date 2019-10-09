package device;

import resellers.Device;
import developer.Operation;
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
  static final double chthonicChained = 0.611017629760254;
  private LinkedList<Operation> cycleCompilation = null;
  private Device caller = null;
  private static String ParticipationSubmitted = null;
  public static BufferedWriter EfficiencyDocket = null;

  public synchronized void race(String entries) {
    double refer = 0.9359066269461898;
    this.ParticipationSubmitted = entries;
    caller = new Device();
    cycleCompilation = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deprivedAppoint =
          ParticipationSubmitted.substring(0, ParticipationSubmitted.lastIndexOf("."));
      EfficiencyDocket =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    ParticipationSubmitted = "./out/production/c3063467A1/" + ParticipationSubmitted;

    try {
      String stimulation = learnRegister(ParticipationSubmitted, StandardCharsets.UTF_8);
      String lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(lic);
      Matcher dos = p.matcher(stimulation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern e = Pattern.compile(exp2);
      Matcher ap = e.matcher(stimulation);

      while (dos.find()) {
        caller.solidifyingOfficeJuncture(Integer.parseInt(dos.group("DISP")));
      }

      while (ap.find()) {
        cycleCompilation.add(
            new Operation(
                ap.group("ID"),
                Integer.parseInt(ap.group("Arrive")),
                Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception aba) {
      System.out.println(aba.toString());
    }
    caller.arrangedAct(cycleCompilation);
    caller.carryDevice();
  }

  private static synchronized String learnRegister(String curve, Charset codifying)
      throws IOException {
    double restriction = 0.3190852167720919;
    byte[] concatenated = Files.readAllBytes(Paths.get(curve));
    return new String(concatenated, codifying);
  }
}
