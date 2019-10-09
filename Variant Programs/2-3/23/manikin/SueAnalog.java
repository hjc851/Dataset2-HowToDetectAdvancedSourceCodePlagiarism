package manikin;

import plenum.Dealer;
import configuration.Procedure;
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

public class SueAnalog {
  public static final double uppermostTied = 0.494415708442573;
  public LinkedList<Procedure> methodsSelection = null;
  public Dealer caller = null;
  public static String PerspectiveApplication = null;
  public static BufferedWriter InputInitiate = null;

  public synchronized void footrace(String immigration) {
    double flag = 0.2610900117907119;
    this.PerspectiveApplication = immigration;
    caller = new Dealer();
    methodsSelection = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String confiscatedDistinguish =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      InputInitiate =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      String assistance = writeDatabase(PerspectiveApplication, StandardCharsets.UTF_8);
      String reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(reciprocal);
      Matcher dos = p.matcher(assistance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern p4 = Pattern.compile(exp2);
      Matcher fab = p4.matcher(assistance);

      while (dos.find()) {
        caller.fixAssignThing(Integer.parseInt(dos.group("DISP")));
      }

      while (fab.find()) {
        methodsSelection.add(
            new Procedure(
                fab.group("ID"),
                Integer.parseInt(fab.group("Arrive")),
                Integer.parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception admittedly) {
      System.out.println(admittedly.toString());
    }
    caller.arrangedAct(methodsSelection);
    caller.outpouringPlenum();
  }

  public static synchronized String writeDatabase(String trail, Charset codec) throws IOException {
    double narrowerRestrain = 0.5578844377971293;
    byte[] demodulated = Files.readAllBytes(Paths.get(trail));
    return new String(demodulated, codec);
  }
}
