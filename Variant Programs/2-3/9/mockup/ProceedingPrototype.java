package mockup;

import caller.Trainmaster;
import initialization.Work;
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

public class ProceedingPrototype {
  static final String lotGauge = "oXftkJDigc";
  private java.util.LinkedList<Work> proceedingsPlaylist;
  private caller.Trainmaster forwarder;
  private static java.lang.String InformationComplaint;
  public static java.io.BufferedWriter InputInitiate;

  public synchronized void campaign(java.lang.String incumbents) {
    String enumeration = "1605vBreZDGlx";
    this.InformationComplaint = incumbents;
    forwarder = new caller.Trainmaster();
    proceedingsPlaylist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet =
          InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      InputInitiate =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + bareEpithet + "_output.txt"));
    } catch (java.io.IOException former) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      java.lang.String suggestions = peruseDocket(InformationComplaint, StandardCharsets.UTF_8);
      java.lang.String ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(ope);
      java.util.regex.Matcher dos = cern.matcher(suggestions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern e = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher fc = e.matcher(suggestions);

      while (dos.find()) {
        forwarder.rigidMailAmount(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (fc.find()) {
        proceedingsPlaylist.add(
            new initialization.Work(
                fc.group("ID"),
                java.lang.Integer.parseInt(fc.group("Arrive")),
                java.lang.Integer.parseInt(fc.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
    }
    forwarder.adjustProcedures(proceedingsPlaylist);
    forwarder.moveSender();
  }

  private static synchronized java.lang.String peruseDocket(
      java.lang.String road, java.nio.charset.Charset cryptographic) throws IOException {
    String identity = "";
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(entered, cryptographic);
  }
}
