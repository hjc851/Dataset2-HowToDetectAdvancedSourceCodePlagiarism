package impactor;

import plenum.Regulator;
import organizer.Proceeding;
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

public class MechanismMockup {
  private static final String synX417String = "Finished reading input file...";
  private static final String synX416String = "SIZE";
  private static final String synX415String = "Arrive";
  private static final String synX414String = "ID";
  private static final String synX413String = "DISP";
  private static final String synX412String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX411String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX410String = "./out/production/c3063467A1/";
  private static final String synX409String = "Unable to generate output file.";
  private static final String synX408String = "_output.txt";
  private static final String synX407String = "./out/production/c3063467A1/";
  private static final String synX406String = ".";
  private static final int synX405int = 0;
  private static final String synX404String = "Reading in input file...";
  private static final int synX403int = 989242158;
  private static final String synX402String = "OFvjQOdJ";

  private static synchronized java.lang.String proofreadComplaint(
      java.lang.String footpath, java.nio.charset.Charset cipher) throws IOException {
    String ceiling;
    ceiling = (synX402String);
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(entered, cipher);
  }

  private java.util.LinkedList<Proceeding> marchTilt;

  public synchronized void footrace(java.lang.String without) {
    int border;
    border = (synX403int);
    this.InformationComplaint = (without);
    mailer = (new plenum.Regulator());
    marchTilt = (new java.util.LinkedList<>());
    System.out.println(synX404String);

    try {
      java.lang.String emptyRefer;
      emptyRefer =
          (InformationComplaint.substring(
              synX405int, InformationComplaint.lastIndexOf(synX406String)));
      OutturnLodge =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX407String + emptyRefer + synX408String))));
    } catch (java.io.IOException vet) {
      System.out.println(synX409String);
    }
    InformationComplaint = (synX410String + InformationComplaint);

    try {
      java.lang.String involvement;
      java.lang.String mgr;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher ff;
      involvement = (proofreadComplaint(InformationComplaint, StandardCharsets.UTF_8));
      mgr = (synX411String);
      postscript = (java.util.regex.Pattern.compile(mgr));
      esi = (postscript.matcher(involvement));
      exp2 = (synX412String);
      k = (java.util.regex.Pattern.compile(exp2));
      ff = (k.matcher(involvement));

      while (esi.find()) {
        mailer.putDespatchClock(java.lang.Integer.parseInt(esi.group(synX413String)));
      }

      while (ff.find()) {
        marchTilt.add(
            new organizer.Proceeding(
                ff.group(synX414String),
                java.lang.Integer.parseInt(ff.group(synX415String)),
                java.lang.Integer.parseInt(ff.group(synX416String))));
      }
      System.out.println(synX417String);
    } catch (java.lang.Exception adrian) {
      System.out.println(adrian.toString());
    }
    mailer.dictatedWork(marchTilt);
    mailer.scarperCaller();
  }

  private static java.lang.String InformationComplaint;
  public static java.io.BufferedWriter OutturnLodge;
  static double topmostCertain = 0.2500163080138659;
  private plenum.Regulator mailer;
}
