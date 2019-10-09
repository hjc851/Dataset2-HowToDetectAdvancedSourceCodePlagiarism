package mock;

import coordinator.Distributor;
import writer.Phase;
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
  private static final int synX1287int = -406476250;
  private static final String synX1286String = "Finished reading input file...";
  private static final String synX1285String = "SIZE";
  private static final String synX1284String = "Arrive";
  private static final String synX1283String = "ID";
  private static final String synX1282String = "DISP";
  private static final String synX1281String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1280String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1279String = "./out/production/c3063467A1/";
  private static final String synX1278String = "Unable to generate output file.";
  private static final String synX1277String = "_output.txt";
  private static final String synX1276String = "./out/production/c3063467A1/";
  private static final String synX1275String = ".";
  private static final int synX1274int = 0;
  private static final String synX1273String = "Reading in input file...";
  private static final int synX1272int = 1656944860;
  public static final double fukkianese = 0.3519113063507413;
  public java.util.LinkedList<Phase> proceedingRosters;
  public coordinator.Distributor vendor;
  public static java.lang.String AssistancePapers;
  public static java.io.BufferedWriter ProducerSubmitted;

  public synchronized void work(java.lang.String nsi) {
    int leaping = synX1272int;
    this.AssistancePapers = nsi;
    vendor = new coordinator.Distributor();
    proceedingRosters = new java.util.LinkedList<>();
    System.out.println(synX1273String);

    try {
      java.lang.String bareEpithet =
          AssistancePapers.substring(synX1274int, AssistancePapers.lastIndexOf(synX1275String));
      ProducerSubmitted =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX1276String + bareEpithet + synX1277String));
    } catch (java.io.IOException abbe) {
      System.out.println(synX1278String);
    }
    AssistancePapers = synX1279String + AssistancePapers;

    try {
      java.lang.String representations =
          showDocumentation(AssistancePapers, StandardCharsets.UTF_8);
      java.lang.String bens = synX1280String;
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(bens);
      java.util.regex.Matcher dos = cern.matcher(representations);
      java.lang.String exp2 = synX1281String;
      java.util.regex.Pattern a1 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher d = a1.matcher(representations);

      while (dos.find()) {
        vendor.fitExpeditiousnessYear(java.lang.Integer.parseInt(dos.group(synX1282String)));
      }

      while (d.find()) {
        proceedingRosters.add(
            new writer.Phase(
                d.group(synX1283String),
                java.lang.Integer.parseInt(d.group(synX1284String)),
                java.lang.Integer.parseInt(d.group(synX1285String))));
      }
      System.out.println(synX1286String);
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
    }
    vendor.bentTechnologies(proceedingRosters);
    vendor.streakVendor();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String step, java.nio.charset.Charset coder) throws IOException {
    int figure = synX1287int;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(synthesized, coder);
  }
}
