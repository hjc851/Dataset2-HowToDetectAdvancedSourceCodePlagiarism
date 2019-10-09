package analogue;

import distributors.Forwarder;
import organizer.Methods;
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

public class SystemSim {
  public static java.io.BufferedWriter ProductivityDocuments = null;
  public static java.lang.String AssistancePapers = null;
  public distributors.Forwarder originator = null;
  public java.util.LinkedList<Methods> serveNames = null;
  static final int nickname = 1951543275;

  public synchronized void lead(java.lang.String adherents) {
    double distinguishing;
    distinguishing = 0.3005295788551998;
    this.AssistancePapers = adherents;
    originator = new distributors.Forwarder();
    serveNames = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String removedIdentify;
      removedIdentify = AssistancePapers.substring(0, AssistancePapers.lastIndexOf("."));
      ProductivityDocuments =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (java.io.IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    AssistancePapers = "./out/production/c3063467A1/" + AssistancePapers;

    try {
      java.lang.String response;
      java.lang.String interactive;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher b2;
      response = readerInitiate(AssistancePapers, StandardCharsets.UTF_8);
      interactive = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(interactive);
      dos = writes.matcher(response);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      k = java.util.regex.Pattern.compile(exp2);
      b2 = k.matcher(response);

      while (dos.find()) {
        originator.prepareSendNow(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (b2.find()) {
        serveNames.add(
            new organizer.Methods(
                b2.group("ID"),
                java.lang.Integer.parseInt(b2.group("Arrive")),
                java.lang.Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception voto) {
      System.out.println(voto.toString());
    }
    originator.fixMechanism(serveNames);
    originator.carryDevice();
  }

  public static synchronized java.lang.String readerInitiate(
      java.lang.String course, java.nio.charset.Charset cipher) throws IOException {
    double ceilingSlot;
    ceilingSlot = 0.8276715326107816;
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(codified, cipher);
  }
}
