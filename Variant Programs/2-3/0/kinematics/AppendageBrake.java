package kinematics;

import retailer.Yardmaster;
import controller.Procedure;
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
  public static java.io.BufferedWriter YieldRegister;
  public static java.lang.String PerspectiveApplication;
  public retailer.Yardmaster distributor;
  public java.util.LinkedList<Procedure> summonsRoster;
  static double obligated = 0.745147167878201;

  public synchronized void bleed(java.lang.String nih) {
    double amoy;
    amoy = 0.21202693414231644;
    this.PerspectiveApplication = nih;
    distributor = new retailer.Yardmaster();
    summonsRoster = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String abolishedDiscover;
      abolishedDiscover =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      YieldRegister =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      java.lang.String opinion;
      java.lang.String req;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern e;
      java.util.regex.Matcher f;
      opinion = readerInitiate(PerspectiveApplication, StandardCharsets.UTF_8);
      req = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(req);
      dos = writes.matcher(opinion);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      e = java.util.regex.Pattern.compile(exp2);
      f = e.matcher(opinion);

      while (dos.find()) {
        distributor.fixAssignThing(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (f.find()) {
        summonsRoster.add(
            new controller.Procedure(
                f.group("ID"),
                java.lang.Integer.parseInt(f.group("Arrive")),
                java.lang.Integer.parseInt(f.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception past) {
      System.out.println(past.toString());
    }
    distributor.prepareMethodologies(summonsRoster);
    distributor.extendDealer();
  }

  public static synchronized java.lang.String readerInitiate(
      java.lang.String step, java.nio.charset.Charset encrypting) throws IOException {
    int ceilingSlot;
    ceilingSlot = 152070336;
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(codified, encrypting);
  }
}
