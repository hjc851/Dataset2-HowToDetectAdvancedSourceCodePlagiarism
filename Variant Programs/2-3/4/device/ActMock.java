package device;

import yardmaster.Plenum;
import timer.Mechanism;
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

public class ActMock {
  private static java.lang.String SubmissionsDocument;

  public synchronized void lean(java.lang.String immigration) {
    this.SubmissionsDocument = immigration;
    regulator = new yardmaster.Plenum();
    methodRanking = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String minimalMention =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ProducePaperwork =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (java.io.IOException late) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = "./out/production/c3063467A1/" + SubmissionsDocument;

    try {
      java.lang.String stimulation =
          proofreadComplaint(SubmissionsDocument, StandardCharsets.UTF_8);
      java.lang.String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(exc);
      java.util.regex.Matcher manuscript = vig.matcher(stimulation);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern c4 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher pk = c4.matcher(stimulation);

      while (manuscript.find()) {
        regulator.settledHitPeriods(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (pk.find()) {
        methodRanking.add(
            new timer.Mechanism(
                pk.group("ID"),
                java.lang.Integer.parseInt(pk.group("Arrive")),
                java.lang.Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    regulator.placeSystems(methodRanking);
    regulator.moveSender();
  }

  public static java.io.BufferedWriter ProducePaperwork;

  private static synchronized java.lang.String proofreadComplaint(
      java.lang.String curve, java.nio.charset.Charset codification) throws IOException {
    byte[] decodes = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(curve));
    return new java.lang.String(decodes, codification);
  }

  private yardmaster.Plenum regulator;
  private java.util.LinkedList<Mechanism> methodRanking;
}
