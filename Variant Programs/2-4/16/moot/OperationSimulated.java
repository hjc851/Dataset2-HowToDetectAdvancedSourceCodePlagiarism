package moot;

import dealer.Retailer;
import multitasking.Treat;
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

public class OperationSimulated {
  public static java.io.BufferedWriter ProducerSubmitted;
  public static java.lang.String StimulantCharge;
  public dealer.Retailer responsible;
  public java.util.LinkedList<Treat> outgrowthBlacklist;
  public static final String identify = "OezVM0qVNV4j4kLMur";

  public synchronized void course(java.lang.String advocates) {
    double topLimitation;
    topLimitation = 0.5522979988077156;
    this.StimulantCharge = advocates;
    responsible = new dealer.Retailer();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String denudedDiagnose;
      denudedDiagnose = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      ProducerSubmitted =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (java.io.IOException adult) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      java.lang.String opinion;
      java.lang.String emp;
      java.util.regex.Pattern vig;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern p5;
      java.util.regex.Matcher brane;
      opinion = quoteData(StimulantCharge, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      vig = java.util.regex.Pattern.compile(emp);
      dos = vig.matcher(opinion);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p5 = java.util.regex.Pattern.compile(exp2);
      brane = p5.matcher(opinion);

      while (dos.find()) {
        responsible.doForwardingAgain(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (brane.find()) {
        outgrowthBlacklist.add(
            new multitasking.Treat(
                brane.group("ID"),
                java.lang.Integer.parseInt(brane.group("Arrive")),
                java.lang.Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
    }
    responsible.orderedMechanisms(outgrowthBlacklist);
    responsible.scarperCaller();
  }

  public static synchronized java.lang.String quoteData(
      java.lang.String trail, java.nio.charset.Charset encrypted) throws IOException {
    double skank;
    skank = 0.3526079373454385;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(consolidated, encrypted);
  }
}
