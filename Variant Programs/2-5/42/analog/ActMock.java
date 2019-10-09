package analog;

import sender.Vendor;
import synchronizer.Phase;
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
  private static final String synX2959String = "Finished reading input file...";
  private static final String synX2958String = "SIZE";
  private static final String synX2957String = "Arrive";
  private static final String synX2956String = "ID";
  private static final String synX2955String = "DISP";
  private static final String synX2954String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2953String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2952String = "./out/production/c3063467A1/";
  private static final String synX2951String = "Unable to generate output file.";
  private static final String synX2950String = "_output.txt";
  private static final String synX2949String = "./out/production/c3063467A1/";
  private static final String synX2948String = ".";
  private static final int synX2947int = 0;
  private static final String synX2946String = "Reading in input file...";

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String step, java.nio.charset.Charset codec) throws IOException {
    byte[] transmit = readAllBytes(get(step));
    return new java.lang.String(transmit, codec);
  }

  public synchronized void tally(java.lang.String officeholders) {
    this.InfluenceArchives = (officeholders);
    resellers = (new sender.Vendor());
    proceduresCompendium = (new java.util.LinkedList<>());
    out.println(synX2946String);

    try {
      java.lang.String eliminatedConstitute =
          InfluenceArchives.substring(synX2947int, InfluenceArchives.lastIndexOf(synX2948String));
      TurnoutCharge =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX2949String + eliminatedConstitute + synX2950String))));
    } catch (java.io.IOException libris) {
      out.println(synX2951String);
    }
    InfluenceArchives = (synX2952String + InfluenceArchives);

    try {
      java.lang.String advice = studyPaperwork(InfluenceArchives, UTF_8);
      java.lang.String pkg = synX2953String;
      java.util.regex.Pattern writes = compile(pkg);
      java.util.regex.Matcher manuscript = writes.matcher(advice);
      java.lang.String exp2 = synX2954String;
      java.util.regex.Pattern aj = compile(exp2);
      java.util.regex.Matcher fc = aj.matcher(advice);

      while (manuscript.find()) {
        resellers.primedExpeditionPeriod(parseInt(manuscript.group(synX2955String)));
      }

      while (fc.find()) {
        proceduresCompendium.add(
            new synchronizer.Phase(
                fc.group(synX2956String),
                parseInt(fc.group(synX2957String)),
                parseInt(fc.group(synX2958String))));
      }
      out.println(synX2959String);
    } catch (java.lang.Exception post) {
      out.println(post.toString());
    }
    resellers.dictatedWork(proceduresCompendium);
    resellers.operateStarter();
  }

  public static java.lang.String InfluenceArchives = null;
  public java.util.LinkedList<Phase> proceduresCompendium = null;
  public sender.Vendor resellers = null;
  public static java.io.BufferedWriter TurnoutCharge = null;
}
