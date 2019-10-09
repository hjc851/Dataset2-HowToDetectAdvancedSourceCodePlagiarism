package mimic;

import device.Mailer;
import synchronization.Cycle;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class MechanismMockup {
  public static java.io.BufferedWriter ExportationPapers;
  public java.util.LinkedList<Cycle> methodRanking;

  public synchronized void endure(java.lang.String elected) {
    this.PerspectiveApplication = elected;
    dealer = new device.Mailer();
    methodRanking = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String plunderedMoniker;
      plunderedMoniker =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (java.io.IOException voto) {
      out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      java.lang.String stimulant;
      java.lang.String supp;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern e;
      java.util.regex.Matcher e2;
      stimulant = reciteSubmitting(PerspectiveApplication, UTF_8);
      supp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(supp);
      dos = writes.matcher(stimulant);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      e = java.util.regex.Pattern.compile(exp2);
      e2 = e.matcher(stimulant);

      while (dos.find()) {
        dealer.dictatedCommuniqueMeter(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (e2.find()) {
        methodRanking.add(
            new synchronization.Cycle(
                e2.group("ID"),
                java.lang.Integer.parseInt(e2.group("Arrive")),
                java.lang.Integer.parseInt(e2.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception vet) {
      out.println(vet.toString());
    }
    dealer.orderedMechanisms(methodRanking);
    dealer.passMailer();
  }

  public static java.lang.String PerspectiveApplication;
  public device.Mailer dealer;

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String track, java.nio.charset.Charset codifying) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(initiated, codifying);
  }
}
