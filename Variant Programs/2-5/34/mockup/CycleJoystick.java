package mockup;

import salesperson.Dealer;
import compiler.Proceeding;
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

public class CycleJoystick {
  private static final String synX2546String = "Finished reading input file...";
  private static final String synX2545String = "SIZE";
  private static final String synX2544String = "Arrive";
  private static final String synX2543String = "ID";
  private static final String synX2542String = "DISP";
  private static final String synX2541String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2540String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2539String = "./out/production/c3063467A1/";
  private static final String synX2538String = "Unable to generate output file.";
  private static final String synX2537String = "_output.txt";
  private static final String synX2536String = "./out/production/c3063467A1/";
  private static final String synX2535String = ".";
  private static final int synX2534int = 0;
  private static final String synX2533String = "Reading in input file...";
  private static java.lang.String ParticipatoryArchiving;

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String lane, java.nio.charset.Charset decoding) throws IOException {
    byte[] transmit = readAllBytes(get(lane));
    return new java.lang.String(transmit, decoding);
  }

  private java.util.LinkedList<Proceeding> proceduresCompendium;

  public synchronized void lead(java.lang.String proponents) {
    this.ParticipatoryArchiving = proponents;
    limiter = new salesperson.Dealer();
    proceduresCompendium = new java.util.LinkedList<>();
    out.println(synX2533String);

    try {
      java.lang.String dismantledKey =
          ParticipatoryArchiving.substring(
              synX2534int, ParticipatoryArchiving.lastIndexOf(synX2535String));
      InputInitiate =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX2536String + dismantledKey + synX2537String));
    } catch (java.io.IOException past) {
      out.println(synX2538String);
    }
    ParticipatoryArchiving = synX2539String + ParticipatoryArchiving;

    try {
      java.lang.String opinion = reciteSubmitting(ParticipatoryArchiving, UTF_8);
      java.lang.String supp = synX2540String;
      java.util.regex.Pattern writes = compile(supp);
      java.util.regex.Matcher sm = writes.matcher(opinion);
      java.lang.String exp2 = synX2541String;
      java.util.regex.Pattern n1 = compile(exp2);
      java.util.regex.Matcher aml = n1.matcher(opinion);

      while (sm.find()) {
        limiter.solidifyingOfficeJuncture(parseInt(sm.group(synX2542String)));
      }

      while (aml.find()) {
        proceduresCompendium.add(
            new compiler.Proceeding(
                aml.group(synX2543String),
                parseInt(aml.group(synX2544String)),
                parseInt(aml.group(synX2545String))));
      }
      out.println(synX2546String);
    } catch (java.lang.Exception adult) {
      out.println(adult.toString());
    }
    limiter.readyMarch(proceduresCompendium);
    limiter.leanExporter();
  }

  public static java.io.BufferedWriter InputInitiate;
  private salesperson.Dealer limiter;
}
