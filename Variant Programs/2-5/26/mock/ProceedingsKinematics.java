package mock;

import distributors.Caller;
import server.Procedure;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ProceedingsKinematics {
  private static final String synX2148String = "Finished reading input file...";
  private static final String synX2147String = "SIZE";
  private static final String synX2146String = "Arrive";
  private static final String synX2145String = "ID";
  private static final String synX2144String = "DISP";
  private static final String synX2143String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2142String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2141String = "./out/production/c3063467A1/";
  private static final String synX2140String = "Unable to generate output file.";
  private static final String synX2139String = "_output.txt";
  private static final String synX2138String = "./out/production/c3063467A1/";
  private static final String synX2137String = ".";
  private static final int synX2136int = 0;
  private static final String synX2135String = "Reading in input file...";
  public static BufferedWriter ProducesFilename;
  private static String InvolvementData;
  private Caller shipper;
  private LinkedList<Procedure> workLean;

  public synchronized void play(String immigration) {
    this.InvolvementData = (immigration);
    shipper = (new Caller());
    workLean = (new LinkedList<>());
    System.out.println(synX2135String);

    try {
      String rippedCall;
      rippedCall =
          (InvolvementData.substring(synX2136int, InvolvementData.lastIndexOf(synX2137String)));
      ProducesFilename =
          (new BufferedWriter(new FileWriter((synX2138String + rippedCall + synX2139String))));
    } catch (IOException abel) {
      System.out.println(synX2140String);
    }
    InvolvementData = (synX2141String + InvolvementData);

    try {
      String feedback;
      String explanatory;
      Pattern cern;
      Matcher esi;
      String exp2;
      Pattern p3;
      Matcher b2;
      feedback = (peruseDocket(InvolvementData, StandardCharsets.UTF_8));
      explanatory = (synX2142String);
      cern = (compile(explanatory));
      esi = (cern.matcher(feedback));
      exp2 = (synX2143String);
      p3 = (compile(exp2));
      b2 = (p3.matcher(feedback));

      while (esi.find()) {
        shipper.markDispatchesHours(parseInt(esi.group(synX2144String)));
      }

      while (b2.find()) {
        workLean.add(
            new Procedure(
                b2.group(synX2145String),
                parseInt(b2.group(synX2146String)),
                parseInt(b2.group(synX2147String))));
      }
      System.out.println(synX2148String);
    } catch (Exception abbe) {
      System.out.println(abbe.toString());
    }
    shipper.determineProces(workLean);
    shipper.extendDealer();
  }

  private static synchronized String peruseDocket(String roadway, Charset codify)
      throws IOException {
    byte[] formatted = readAllBytes(get(roadway));
    return new String(formatted, codify);
  }
}
