package demo;

import sender.Resellers;
import developer.System;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class NegotiationsAvionics {
  private static final String synX1379String = "Finished reading input file...";
  private static final String synX1378String = "SIZE";
  private static final String synX1377String = "Arrive";
  private static final String synX1376String = "ID";
  private static final String synX1375String = "DISP";
  private static final String synX1374String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1373String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1372String = "./out/production/c3063467A1/";
  private static final String synX1371String = "Unable to generate output file.";
  private static final String synX1370String = "_output.txt";
  private static final String synX1369String = "./out/production/c3063467A1/";
  private static final String synX1368String = ".";
  private static final int synX1367int = 0;
  private static final String synX1366String = "Reading in input file...";
  public java.util.LinkedList<System> negotiationsListings;
  public sender.Resellers regulator;
  public static java.lang.String SuggestionsFolders;
  public static java.io.BufferedWriter TurnoutCharge;

  public synchronized void streak(java.lang.String details) {
    this.SuggestionsFolders = (details);
    regulator = (new sender.Resellers());
    negotiationsListings = (new java.util.LinkedList<>());
    out.println(synX1366String);

    try {
      java.lang.String dismantledKey =
          SuggestionsFolders.substring(synX1367int, SuggestionsFolders.lastIndexOf(synX1368String));
      TurnoutCharge =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX1369String + dismantledKey + synX1370String))));
    } catch (java.io.IOException appointed) {
      out.println(synX1371String);
    }
    SuggestionsFolders = (synX1372String + SuggestionsFolders);

    try {
      java.lang.String stimulation = sayFolder(SuggestionsFolders, UTF_8);
      java.lang.String exc = synX1373String;
      java.util.regex.Pattern writes = compile(exc);
      java.util.regex.Matcher dos = writes.matcher(stimulation);
      java.lang.String exp2 = synX1374String;
      java.util.regex.Pattern e = compile(exp2);
      java.util.regex.Matcher f1 = e.matcher(stimulation);

      while (dos.find()) {
        regulator.dictatedCommuniqueMeter(parseInt(dos.group(synX1375String)));
      }

      while (f1.find()) {
        negotiationsListings.add(
            new developer.System(
                f1.group(synX1376String),
                parseInt(f1.group(synX1377String)),
                parseInt(f1.group(synX1378String))));
      }
      out.println(synX1379String);
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
    }
    regulator.rigidMethod(negotiationsListings);
    regulator.workForwarder();
  }

  public static synchronized java.lang.String sayFolder(
      java.lang.String step, java.nio.charset.Charset keying) throws IOException {
    byte[] captioned = readAllBytes(get(step));
    return new java.lang.String(captioned, keying);
  }
}
