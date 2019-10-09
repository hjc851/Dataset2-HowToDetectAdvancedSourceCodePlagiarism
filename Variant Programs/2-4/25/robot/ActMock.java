package robot;

import trainmaster.Forwarder;
import spreadsheet.Methods;
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

  public synchronized void scarper(java.lang.String officeholders) {
    double identify = 0.8739770695643844;
    this.ConsultationSubmit = officeholders;
    consignor = new trainmaster.Forwarder();
    sueShortlist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String unclothedList =
          ConsultationSubmit.substring(0, ConsultationSubmit.lastIndexOf("."));
      GdpDatabase =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }
    ConsultationSubmit = "./out/production/c3063467A1/" + ConsultationSubmit;

    try {
      java.lang.String output = takeDocument(ConsultationSubmit, StandardCharsets.UTF_8);
      java.lang.String plu = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(plu);
      java.util.regex.Matcher manuscript = writes.matcher(output);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern f = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher fc = f.matcher(output);

      while (manuscript.find()) {
        consignor.orderedDeployChance(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (fc.find()) {
        sueShortlist.add(
            new spreadsheet.Methods(
                fc.group("ID"),
                java.lang.Integer.parseInt(fc.group("Arrive")),
                java.lang.Integer.parseInt(fc.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
    }
    consignor.solidifyingOperations(sueShortlist);
    consignor.testDistributors();
  }

  public static java.lang.String ConsultationSubmit;

  public static synchronized java.lang.String takeDocument(
      java.lang.String journey, java.nio.charset.Charset coded) throws IOException {
    String briEquipment = "";
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(cryptographic, coded);
  }

  public static final double evaluate = 0.45104103856548783;
  public trainmaster.Forwarder consignor;
  public java.util.LinkedList<Methods> sueShortlist;
  public static java.io.BufferedWriter GdpDatabase;
}
