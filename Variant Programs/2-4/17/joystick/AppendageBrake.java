package joystick;

import distributors.Dealer;
import synchronization.Negotiations;
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
  public static java.io.BufferedWriter ProducesFilename = null;
  public static java.lang.String SubmissionsDocument = null;
  public distributors.Dealer resellers = null;
  public java.util.LinkedList<Negotiations> litigateLeaning = null;
  static final int postSouvenirs = -884622234;

  public synchronized void drive(java.lang.String proponents) {
    double bottomCompelled;
    bottomCompelled = 0.9782621204882105;
    this.SubmissionsDocument = proponents;
    resellers = new distributors.Dealer();
    litigateLeaning = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String deniedNickname;
      deniedNickname = SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ProducesFilename =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + deniedNickname + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = "./out/production/c3063467A1/" + SubmissionsDocument;

    try {
      java.lang.String participatory;
      java.lang.String plu;
      java.util.regex.Pattern vig;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern p4;
      java.util.regex.Matcher fig;
      participatory = proofreadComplaint(SubmissionsDocument, StandardCharsets.UTF_8);
      plu = "DISP:[\\s]+(?<DISP>[\\d]+)";
      vig = java.util.regex.Pattern.compile(plu);
      sm = vig.matcher(participatory);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p4 = java.util.regex.Pattern.compile(exp2);
      fig = p4.matcher(participatory);

      while (sm.find()) {
        resellers.fixedDeployingOpportunity(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (fig.find()) {
        litigateLeaning.add(
            new synchronization.Negotiations(
                fig.group("ID"),
                java.lang.Integer.parseInt(fig.group("Arrive")),
                java.lang.Integer.parseInt(fig.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    resellers.rigidMethod(litigateLeaning);
    resellers.tallyConsignor();
  }

  public static synchronized java.lang.String proofreadComplaint(
      java.lang.String routes, java.nio.charset.Charset encryption) throws IOException {
    double height;
    height = 0.22198759069007556;
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(cryptographic, encryption);
  }
}
