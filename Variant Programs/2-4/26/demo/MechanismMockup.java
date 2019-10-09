package demo;

import device.Forwarder;
import timer.Operation;
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

public class MechanismMockup {
  public LinkedList<Operation> mechanismsBibliography = null;
  public Forwarder limiter = null;
  public static String SupportPaperwork = null;
  public static BufferedWriter TurnoutCharge = null;

  public synchronized void race(String proponents) {
    this.SupportPaperwork = proponents;
    limiter = new Forwarder();
    mechanismsBibliography = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String removedIdentify = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      TurnoutCharge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      String suggestions = readableArchiving(SupportPaperwork, StandardCharsets.UTF_8);
      String resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(resp);
      Matcher manuscript = p.matcher(suggestions);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c2 = Pattern.compile(exp2);
      Matcher d = c2.matcher(suggestions);

      while (manuscript.find()) {
        limiter.situatedDeploymentMinutes(Integer.parseInt(manuscript.group("DISP")));
      }

      while (d.find()) {
        mechanismsBibliography.add(
            new Operation(
                d.group("ID"),
                Integer.parseInt(d.group("Arrive")),
                Integer.parseInt(d.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception eden) {
      System.out.println(eden.toString());
    }
    limiter.fixMechanism(mechanismsBibliography);
    limiter.carryDevice();
  }

  public static synchronized String readableArchiving(String pathways, Charset encoders)
      throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(pathways));
    return new String(decrypt, encoders);
  }
}
