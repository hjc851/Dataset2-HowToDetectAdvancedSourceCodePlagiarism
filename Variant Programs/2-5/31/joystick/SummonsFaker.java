package joystick;

import dealer.Trainmaster;
import callback.Procedure;
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

public class SummonsFaker {
  private static final double synX2458double = 0.8675740171673659;
  private static final String synX2457String = "Finished reading input file...";
  private static final String synX2456String = "SIZE";
  private static final String synX2455String = "Arrive";
  private static final String synX2454String = "ID";
  private static final String synX2453String = "DISP";
  private static final String synX2452String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2451String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2450String = "./out/production/c3063467A1/";
  private static final String synX2449String = "Unable to generate output file.";
  private static final String synX2448String = "_output.txt";
  private static final String synX2447String = "./out/production/c3063467A1/";
  private static final String synX2446String = ".";
  private static final int synX2445int = 0;
  private static final String synX2444String = "Reading in input file...";
  private static final double synX2443double = 0.11411543879683583;
  private java.util.LinkedList<Procedure> marchTilt;
  private dealer.Trainmaster resellers;

  public synchronized void endure(java.lang.String without) {
    double thickness = synX2443double;
    this.InfluenceArchives = without;
    resellers = new dealer.Trainmaster();
    marchTilt = new java.util.LinkedList<>();
    out.println(synX2444String);

    try {
      java.lang.String removedIdentify =
          InfluenceArchives.substring(synX2445int, InfluenceArchives.lastIndexOf(synX2446String));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX2447String + removedIdentify + synX2448String));
    } catch (java.io.IOException late) {
      out.println(synX2449String);
    }
    InfluenceArchives = synX2450String + InfluenceArchives;

    try {
      java.lang.String stimulant = rereadSubmitted(InfluenceArchives, UTF_8);
      java.lang.String interactive = synX2451String;
      java.util.regex.Pattern vig = compile(interactive);
      java.util.regex.Matcher dos = vig.matcher(stimulant);
      java.lang.String exp2 = synX2452String;
      java.util.regex.Pattern a3 = compile(exp2);
      java.util.regex.Matcher m3 = a3.matcher(stimulant);

      while (dos.find()) {
        resellers.orderedDeployChance(parseInt(dos.group(synX2453String)));
      }

      while (m3.find()) {
        marchTilt.add(
            new callback.Procedure(
                m3.group(synX2454String),
                parseInt(m3.group(synX2455String)),
                parseInt(m3.group(synX2456String))));
      }
      out.println(synX2457String);
    } catch (java.lang.Exception post) {
      out.println(post.toString());
    }
    resellers.determineProces(marchTilt);
    resellers.campaignReseller();
  }

  private static synchronized java.lang.String rereadSubmitted(
      java.lang.String direction, java.nio.charset.Charset crypto) throws IOException {
    double designation = synX2458double;
    byte[] interleaves = readAllBytes(get(direction));
    return new java.lang.String(interleaves, crypto);
  }

  public static String maximalLength = "0tGTjxh";
  public static java.io.BufferedWriter ExportationPapers;
  private static java.lang.String InfluenceArchives;
}
