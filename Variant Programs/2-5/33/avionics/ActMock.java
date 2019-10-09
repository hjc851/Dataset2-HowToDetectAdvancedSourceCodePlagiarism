package avionics;

import regulator.Reseller;
import workspace.System;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class ActMock {
  public regulator.Reseller consignor;
  public java.util.LinkedList<System> operationName;
  public static java.io.BufferedWriter ProductivityDocuments;

  public static synchronized java.lang.String scanFolders(
      java.lang.String lane, java.nio.charset.Charset encoders) throws IOException {
    byte[] synthesized = readAllBytes(get(lane));
    return new java.lang.String(synthesized, encoders);
  }

  public static java.lang.String GuidanceFilename;

  public synchronized void lead(java.lang.String proponents) {
    this.GuidanceFilename = (proponents);
    consignor = (new regulator.Reseller());
    operationName = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet;
      bareEpithet = (GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf(".")));
      ProductivityDocuments =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + bareEpithet + "_output.txt"))));
    } catch (java.io.IOException appointed) {
      out.println("Unable to generate output file.");
    }
    GuidanceFilename = ("./out/production/c3063467A1/" + GuidanceFilename);

    try {
      java.lang.String feedback;
      java.lang.String yrs;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern aj;
      java.util.regex.Matcher ap;
      feedback = (scanFolders(GuidanceFilename, UTF_8));
      yrs = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      postscript = (compile(yrs));
      esi = (postscript.matcher(feedback));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      aj = (compile(exp2));
      ap = (aj.matcher(feedback));

      while (esi.find()) {
        consignor.prepareSendNow(parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        operationName.add(
            new workspace.System(
                ap.group("ID"), parseInt(ap.group("Arrive")), parseInt(ap.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception abe) {
      out.println(abe.toString());
    }
    consignor.settledServe(operationName);
    consignor.moveSender();
  }
}
