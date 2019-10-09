package simulation;

import responsible.Vendor;
import outliner.Work;
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

public class ProceduresMoot {
  private static final String synX1471String = "Finished reading input file...";
  private static final String synX1470String = "SIZE";
  private static final String synX1469String = "Arrive";
  private static final String synX1468String = "ID";
  private static final String synX1467String = "DISP";
  private static final String synX1466String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1465String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1464String = "./out/production/c3063467A1/";
  private static final String synX1463String = "Unable to generate output file.";
  private static final String synX1462String = "_output.txt";
  private static final String synX1461String = "./out/production/c3063467A1/";
  private static final String synX1460String = ".";
  private static final int synX1459int = 0;
  private static final String synX1458String = "Reading in input file...";
  public LinkedList<Work> cycleCompilation = null;
  public Vendor sender = null;
  public static String OpinionExecutable = null;
  public static BufferedWriter ExportationPapers = null;

  public synchronized void course(String immigration) {
    this.OpinionExecutable = (immigration);
    sender = (new Vendor());
    cycleCompilation = (new LinkedList<>());
    System.out.println(synX1458String);

    try {
      String forfeitedDescribe =
          OpinionExecutable.substring(synX1459int, OpinionExecutable.lastIndexOf(synX1460String));
      ExportationPapers =
          (new BufferedWriter(
              new FileWriter((synX1461String + forfeitedDescribe + synX1462String))));
    } catch (IOException libris) {
      System.out.println(synX1463String);
    }
    OpinionExecutable = (synX1464String + OpinionExecutable);

    try {
      String guidance = reciteSubmitting(OpinionExecutable, StandardCharsets.UTF_8);
      String plu = synX1465String;
      Pattern postscript = compile(plu);
      Matcher sm = postscript.matcher(guidance);
      String exp2 = synX1466String;
      Pattern gpi = compile(exp2);
      Matcher ap = gpi.matcher(guidance);

      while (sm.find()) {
        sender.doForwardingAgain(parseInt(sm.group(synX1467String)));
      }

      while (ap.find()) {
        cycleCompilation.add(
            new Work(
                ap.group(synX1468String),
                parseInt(ap.group(synX1469String)),
                parseInt(ap.group(synX1470String))));
      }
      System.out.println(synX1471String);
    } catch (Exception tipp) {
      System.out.println(tipp.toString());
    }
    sender.fixMechanism(cycleCompilation);
    sender.scarperCaller();
  }

  public static synchronized String reciteSubmitting(String step, Charset encryption)
      throws IOException {
    byte[] costed = readAllBytes(get(step));
    return new String(costed, encryption);
  }
}
