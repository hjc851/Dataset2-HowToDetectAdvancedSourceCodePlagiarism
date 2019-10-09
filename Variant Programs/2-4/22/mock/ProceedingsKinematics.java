package mock;

import dealer.Plenum;
import database.Negotiations;
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

public class ProceedingsKinematics {
  public static java.io.BufferedWriter CropData;
  private static java.lang.String OpinionsDocuments;
  private dealer.Plenum regulator;
  private java.util.LinkedList<Negotiations> methodologyRegistry;

  public synchronized void streak(java.lang.String without) {
    this.OpinionsDocuments = without;
    regulator = new dealer.Plenum();
    methodologyRegistry = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String denudedDiagnose;
      denudedDiagnose = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      CropData =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (java.io.IOException adult) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      java.lang.String influence;
      java.lang.String interactive;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern f;
      java.util.regex.Matcher e2;
      influence = proofreadComplaint(OpinionsDocuments, StandardCharsets.UTF_8);
      interactive = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(interactive);
      dos = cern.matcher(influence);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = java.util.regex.Pattern.compile(exp2);
      e2 = f.matcher(influence);

      while (dos.find()) {
        regulator.situatedDeploymentMinutes(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (e2.find()) {
        methodologyRegistry.add(
            new database.Negotiations(
                e2.group("ID"),
                java.lang.Integer.parseInt(e2.group("Arrive")),
                java.lang.Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abel) {
      System.out.println(abel.toString());
    }
    regulator.readyMarch(methodologyRegistry);
    regulator.testDistributors();
  }

  private static synchronized java.lang.String proofreadComplaint(
      java.lang.String curve, java.nio.charset.Charset encrypting) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(curve));
    return new java.lang.String(formatted, encrypting);
  }
}
