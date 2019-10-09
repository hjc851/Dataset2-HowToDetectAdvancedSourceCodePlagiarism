package manikin;

import device.Distributors;
import programming.Operation;
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

public class MethodImpactor {
  private Distributors forwarder;

  public synchronized void endure(String nsi) {
    double tokenish;
    tokenish = 0.9116303253460395;
    this.SupportPaperwork = nsi;
    forwarder = new Distributors();
    marchTilt = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String rippedCall;
      rippedCall = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      EfficiencyDocket =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + rippedCall + "_output.txt"));
    } catch (IOException con) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      String guidance;
      String resp;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern e;
      Matcher a1;
      guidance = translateDocuments(SupportPaperwork, StandardCharsets.UTF_8);
      resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(resp);
      dos = p.matcher(guidance);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      e = Pattern.compile(exp2);
      a1 = e.matcher(guidance);

      while (dos.find()) {
        forwarder.settledHitPeriods(Integer.parseInt(dos.group("DISP")));
      }

      while (a1.find()) {
        marchTilt.add(
            new Operation(
                a1.group("ID"),
                Integer.parseInt(a1.group("Arrive")),
                Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    forwarder.adjustProcedures(marchTilt);
    forwarder.footraceLimiter();
  }

  public static double circumscribe = 0.4225915640672183;

  private static synchronized String translateDocuments(String ride, Charset codified)
      throws IOException {
    double designator;
    designator = 0.19350906948711377;
    byte[] cryptographic = Files.readAllBytes(Paths.get(ride));
    return new String(cryptographic, codified);
  }

  private static String SupportPaperwork;
  public static BufferedWriter EfficiencyDocket;
  private LinkedList<Operation> marchTilt;
}
