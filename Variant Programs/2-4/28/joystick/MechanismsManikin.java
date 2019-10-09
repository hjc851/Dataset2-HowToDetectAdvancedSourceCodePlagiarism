package joystick;

import coordinator.Salesperson;
import initialization.Mechanism;
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

public class MechanismsManikin {
  public LinkedList<Mechanism> mechanismsBibliography;
  public Salesperson limiter;
  public static String ContributionsDocket;
  public static BufferedWriter YieldRegister;

  public synchronized void prevail(String nii) {
    this.ContributionsDocket = nii;
    limiter = new Salesperson();
    mechanismsBibliography = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String plunderedMoniker =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      YieldRegister =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String stimulation = hearBinder(ContributionsDocket, StandardCharsets.UTF_8);
      String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(pkg);
      Matcher esi = p.matcher(stimulation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern f = Pattern.compile(exp2);
      Matcher ap = f.matcher(stimulation);

      while (esi.find()) {
        limiter.laySlayMoment(Integer.parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        mechanismsBibliography.add(
            new Mechanism(
                ap.group("ID"),
                Integer.parseInt(ap.group("Arrive")),
                Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    limiter.rigidMethod(mechanismsBibliography);
    limiter.extendDealer();
  }

  public static synchronized String hearBinder(String routes, Charset encrypted)
      throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(routes));
    return new String(programmed, encrypted);
  }
}
