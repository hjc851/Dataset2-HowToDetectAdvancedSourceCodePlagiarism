package simulations;

import exporter.Caller;
import parser.Serve;
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

public class CycleJoystick {
  private static final double synX2787double = 0.6574445521975957;
  private static final String synX2786String = "Finished reading input file...";
  private static final String synX2785String = "SIZE";
  private static final String synX2784String = "Arrive";
  private static final String synX2783String = "ID";
  private static final String synX2782String = "DISP";
  private static final String synX2781String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2780String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2779String = "./out/production/c3063467A1/";
  private static final String synX2778String = "Unable to generate output file.";
  private static final String synX2777String = "_output.txt";
  private static final String synX2776String = "./out/production/c3063467A1/";
  private static final String synX2775String = ".";
  private static final int synX2774int = 0;
  private static final String synX2773String = "Reading in input file...";
  private static final double synX2772double = 0.8892731443702203;
  static final double fullThick = 0.8480770966088282;
  public java.util.LinkedList<Serve> serveNames;
  public exporter.Caller limiter;
  public static java.lang.String InvolvementData;
  public static java.io.BufferedWriter TurnoutCharge;

  public synchronized void lean(java.lang.String whys) {
    double cite = synX2772double;
    this.InvolvementData = whys;
    limiter = new exporter.Caller();
    serveNames = new java.util.LinkedList<>();
    out.println(synX2773String);

    try {
      java.lang.String disassembledPatronymic =
          InvolvementData.substring(synX2774int, InvolvementData.lastIndexOf(synX2775String));
      TurnoutCharge =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX2776String + disassembledPatronymic + synX2777String));
    } catch (java.io.IOException afterwards) {
      out.println(synX2778String);
    }
    InvolvementData = synX2779String + InvolvementData;

    try {
      java.lang.String representations = hearBinder(InvolvementData, UTF_8);
      java.lang.String indiv = synX2780String;
      java.util.regex.Pattern writes = compile(indiv);
      java.util.regex.Matcher dos = writes.matcher(representations);
      java.lang.String exp2 = synX2781String;
      java.util.regex.Pattern n = compile(exp2);
      java.util.regex.Matcher fc = n.matcher(representations);

      while (dos.find()) {
        limiter.determinedDischargeDays(parseInt(dos.group(synX2782String)));
      }

      while (fc.find()) {
        serveNames.add(
            new parser.Serve(
                fc.group(synX2783String),
                parseInt(fc.group(synX2784String)),
                parseInt(fc.group(synX2785String))));
      }
      out.println(synX2786String);
    } catch (java.lang.Exception libris) {
      out.println(libris.toString());
    }
    limiter.prepareMethodologies(serveNames);
    limiter.testDistributors();
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String trajectory, java.nio.charset.Charset encoders) throws IOException {
    double distinguishing = synX2787double;
    byte[] decrypt = readAllBytes(get(trajectory));
    return new java.lang.String(decrypt, encoders);
  }
}
