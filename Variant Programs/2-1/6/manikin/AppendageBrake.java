package manikin;

import regulator.Consignor;
import controller.Formalities;
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
  private LinkedList<Formalities> actInclination;
  private Consignor forwarder;
  private static String SupportPaperwork;
  public static BufferedWriter TurnoutCharge;

  public void melt(String nsi) {
    this.SupportPaperwork = nsi;
    forwarder = new Consignor();
    actInclination = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String eliminatedConstitute =
          SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      TurnoutCharge =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      String support = learnRegister(SupportPaperwork, StandardCharsets.UTF_8);
      String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(skil);
      Matcher sm = p.matcher(support);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a3 = Pattern.compile(exp2);
      Matcher fab = a3.matcher(support);

      while (sm.find()) {
        forwarder.fixAssignThing(Integer.parseInt(sm.group("DISP")));
      }

      while (fab.find()) {
        actInclination.add(
            new Formalities(
                fab.group("ID"),
                Integer.parseInt(fab.group("Arrive")),
                Integer.parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
    }
    forwarder.readyMarch(actInclination);
    forwarder.outpouringPlenum();
  }

  private static String learnRegister(String direction, Charset encrypted) throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(direction));
    return new String(demodulated, encrypted);
  }
}
