package kinematics;

import starter.Starter;
import timer.Method;
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

public class MethodsRobot {
  public static java.lang.String InvolvementData;
  public static java.io.BufferedWriter PowerApplication;

  public static synchronized java.lang.String showDocumentation(
      java.lang.String destiny, java.nio.charset.Charset cipher) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(initiated, cipher);
  }

  public starter.Starter dealer;
  public java.util.LinkedList<Method> mechanismsBibliography;

  public synchronized void extend(java.lang.String proponents) {
    this.InvolvementData = proponents;
    dealer = new starter.Starter();
    mechanismsBibliography = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String undoneForename =
          InvolvementData.substring(0, InvolvementData.lastIndexOf("."));
      PowerApplication =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to generate output file.");
    }
    InvolvementData = "./out/production/c3063467A1/" + InvolvementData;

    try {
      java.lang.String output = showDocumentation(InvolvementData, StandardCharsets.UTF_8);
      java.lang.String lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(lic);
      java.util.regex.Matcher dos = cern.matcher(output);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern g = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher fab = g.matcher(output);

      while (dos.find()) {
        dealer.solidifyingOfficeJuncture(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (fab.find()) {
        mechanismsBibliography.add(
            new timer.Method(
                fab.group("ID"),
                java.lang.Integer.parseInt(fab.group("Arrive")),
                java.lang.Integer.parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abel) {
      System.out.println(abel.toString());
    }
    dealer.settledServe(mechanismsBibliography);
    dealer.passMailer();
  }
}
