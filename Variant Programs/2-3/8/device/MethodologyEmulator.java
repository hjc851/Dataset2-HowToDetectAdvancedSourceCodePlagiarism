package device;

import shipper.Mailer;
import synchronizer.Summons;
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

public class MethodologyEmulator {
  private shipper.Mailer responsible;
  private java.util.LinkedList<Summons> systemDocket;
  private static java.lang.String PerspectiveApplication;

  private static synchronized java.lang.String tellReadme(
      java.lang.String trajectory, java.nio.charset.Charset consolidation) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(formatted, consolidation);
  }

  public static java.io.BufferedWriter AmperageSubmitting;

  public synchronized void race(java.lang.String whys) {
    this.PerspectiveApplication = whys;
    responsible = new shipper.Mailer();
    systemDocket = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String plunderedMoniker;
      plunderedMoniker =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      AmperageSubmitting =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      java.lang.String submissions;
      java.lang.String ope;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern f2;
      java.util.regex.Matcher cm2;
      submissions = tellReadme(PerspectiveApplication, StandardCharsets.UTF_8);
      ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(ope);
      dos = cern.matcher(submissions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f2 = java.util.regex.Pattern.compile(exp2);
      cm2 = f2.matcher(submissions);

      while (dos.find()) {
        responsible.prepareSendNow(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (cm2.find()) {
        systemDocket.add(
            new synchronizer.Summons(
                cm2.group("ID"),
                java.lang.Integer.parseInt(cm2.group("Arrive")),
                java.lang.Integer.parseInt(cm2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception voto) {
      System.out.println(voto.toString());
    }
    responsible.situatedMethodology(systemDocket);
    responsible.leanExporter();
  }
}
