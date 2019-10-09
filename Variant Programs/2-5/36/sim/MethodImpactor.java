package sim;

import sender.Retailer;
import multitasking.Appendage;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class MethodImpactor {
  private static final String synX2652String = "Finished reading input file...";
  private static final String synX2651String = "SIZE";
  private static final String synX2650String = "Arrive";
  private static final String synX2649String = "ID";
  private static final String synX2648String = "DISP";
  private static final String synX2647String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2646String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2645String = "./out/production/c3063467A1/";
  private static final String synX2644String = "Unable to generate output file.";
  private static final String synX2643String = "_output.txt";
  private static final String synX2642String = "./out/production/c3063467A1/";
  private static final String synX2641String = ".";
  private static final int synX2640int = 0;
  private static final String synX2639String = "Reading in input file...";
  public static java.io.BufferedWriter InputInitiate;
  private sender.Retailer resellers;

  private static synchronized java.lang.String understandCharge(
      java.lang.String destiny, java.nio.charset.Charset encryption) throws IOException {
    byte[] interlaced = readAllBytes(get(destiny));
    return new java.lang.String(interlaced, encryption);
  }

  public synchronized void bleed(java.lang.String incumbents) {
    this.StimulationLodge = incumbents;
    resellers = new sender.Retailer();
    methodRanking = new java.util.LinkedList<>();
    System.out.println(synX2639String);

    try {
      java.lang.String plunderedMoniker;
      plunderedMoniker =
          StimulationLodge.substring(synX2640int, StimulationLodge.lastIndexOf(synX2641String));
      InputInitiate =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX2642String + plunderedMoniker + synX2643String));
    } catch (java.io.IOException adoptee) {
      System.out.println(synX2644String);
    }
    StimulationLodge = synX2645String + StimulationLodge;

    try {
      java.lang.String involvement;
      java.lang.String explanatory;
      java.util.regex.Pattern vig;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern f;
      java.util.regex.Matcher m1;
      involvement = understandCharge(StimulationLodge, StandardCharsets.UTF_8);
      explanatory = synX2646String;
      vig = compile(explanatory);
      esi = vig.matcher(involvement);
      exp2 = synX2647String;
      f = compile(exp2);
      m1 = f.matcher(involvement);

      while (esi.find()) {
        resellers.laySlayMoment(parseInt(esi.group(synX2648String)));
      }

      while (m1.find()) {
        methodRanking.add(
            new multitasking.Appendage(
                m1.group(synX2649String),
                parseInt(m1.group(synX2650String)),
                parseInt(m1.group(synX2651String))));
      }
      System.out.println(synX2652String);
    } catch (java.lang.Exception former) {
      System.out.println(former.toString());
    }
    resellers.orderedMechanisms(methodRanking);
    resellers.meltResellers();
  }

  private java.util.LinkedList<Appendage> methodRanking;
  private static java.lang.String StimulationLodge;
}
