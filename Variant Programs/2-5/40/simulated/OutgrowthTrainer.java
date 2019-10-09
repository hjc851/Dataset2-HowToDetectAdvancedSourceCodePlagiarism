package simulated;

import device.Mailer;
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

public class OutgrowthTrainer {
  private static final String synX2879String = "Finished reading input file...";
  private static final String synX2878String = "SIZE";
  private static final String synX2877String = "Arrive";
  private static final String synX2876String = "ID";
  private static final String synX2875String = "DISP";
  private static final String synX2874String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2873String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2872String = "./out/production/c3063467A1/";
  private static final String synX2871String = "Unable to generate output file.";
  private static final String synX2870String = "_output.txt";
  private static final String synX2869String = "./out/production/c3063467A1/";
  private static final String synX2868String = ".";
  private static final int synX2867int = 0;
  private static final String synX2866String = "Reading in input file...";
  public java.util.LinkedList<System> proceduresCompendium;
  public device.Mailer forwarder;
  public static java.lang.String InformationComplaint;
  public static java.io.BufferedWriter EfficiencyDocket;

  public synchronized void bleed(java.lang.String without) {
    this.InformationComplaint = (without);
    forwarder = (new device.Mailer());
    proceduresCompendium = (new java.util.LinkedList<>());
    System.out.println(synX2866String);

    try {
      java.lang.String abolishedDiscover =
          InformationComplaint.substring(
              synX2867int, InformationComplaint.lastIndexOf(synX2868String));
      EfficiencyDocket =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX2869String + abolishedDiscover + synX2870String))));
    } catch (java.io.IOException afterwards) {
      System.out.println(synX2871String);
    }
    InformationComplaint = (synX2872String + InformationComplaint);

    try {
      java.lang.String stimulation = registerSubmit(InformationComplaint, StandardCharsets.UTF_8);
      java.lang.String pkg = synX2873String;
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(pkg);
      java.util.regex.Matcher sm = postscript.matcher(stimulation);
      java.lang.String exp2 = synX2874String;
      java.util.regex.Pattern n = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f3 = n.matcher(stimulation);

      while (sm.find()) {
        forwarder.markDispatchesHours(java.lang.Integer.parseInt(sm.group(synX2875String)));
      }

      while (f3.find()) {
        proceduresCompendium.add(
            new developer.System(
                f3.group(synX2876String),
                java.lang.Integer.parseInt(f3.group(synX2877String)),
                java.lang.Integer.parseInt(f3.group(synX2878String))));
      }
      System.out.println(synX2879String);
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
    }
    forwarder.rigidMethod(proceduresCompendium);
    forwarder.testDistributors();
  }

  public static synchronized java.lang.String registerSubmit(
      java.lang.String ride, java.nio.charset.Charset cipher) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(coded, cipher);
  }
}
