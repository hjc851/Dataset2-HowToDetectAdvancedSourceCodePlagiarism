package mock;

import distributor.Mailer;
import timer.Procedure;
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

public class LitigateMimic {
  private static final String synX3111String = "Finished reading input file...";
  private static final String synX3110String = "SIZE";
  private static final String synX3109String = "Arrive";
  private static final String synX3108String = "ID";
  private static final String synX3107String = "DISP";
  private static final String synX3106String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX3105String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX3104String = "./out/production/c3063467A1/";
  private static final String synX3103String = "Unable to generate output file.";
  private static final String synX3102String = "_output.txt";
  private static final String synX3101String = "./out/production/c3063467A1/";
  private static final String synX3100String = ".";
  private static final int synX3099int = 0;
  private static final String synX3098String = "Reading in input file...";
  private static final int synX3097int = 1812230785;
  private static final double synX3096double = 0.2340023276387201;
  static int highWidening = 1127575692;
  public static BufferedWriter ProducerSubmitted;
  private LinkedList<Procedure> methodologyRegistry;

  private static synchronized String interpretLodge(String pathway, Charset cipher)
      throws IOException {
    double namDetail;
    namDetail = synX3096double;
    byte[] programmed = Files.readAllBytes(Paths.get(pathway));
    return new String(programmed, cipher);
  }

  public synchronized void lean(String immigration) {
    int marquez;
    marquez = synX3097int;
    this.SupportPaperwork = immigration;
    plenum = new Mailer();
    methodologyRegistry = new LinkedList<>();
    out.println(synX3098String);

    try {
      String removedIdentify;
      removedIdentify =
          SupportPaperwork.substring(synX3099int, SupportPaperwork.lastIndexOf(synX3100String));
      ProducerSubmitted =
          new BufferedWriter(new FileWriter(synX3101String + removedIdentify + synX3102String));
    } catch (IOException appointed) {
      out.println(synX3103String);
    }
    SupportPaperwork = synX3104String + SupportPaperwork;

    try {
      String contributions;
      String appl;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern ribulose;
      Matcher f3;
      contributions = interpretLodge(SupportPaperwork, UTF_8);
      appl = synX3105String;
      p = Pattern.compile(appl);
      dos = p.matcher(contributions);
      exp2 = synX3106String;
      ribulose = Pattern.compile(exp2);
      f3 = ribulose.matcher(contributions);

      while (dos.find()) {
        plenum.settledHitPeriods(Integer.parseInt(dos.group(synX3107String)));
      }

      while (f3.find()) {
        methodologyRegistry.add(
            new Procedure(
                f3.group(synX3108String),
                Integer.parseInt(f3.group(synX3109String)),
                Integer.parseInt(f3.group(synX3110String))));
      }
      out.println(synX3111String);
    } catch (Exception eden) {
      out.println(eden.toString());
    }
    plenum.markSummons(methodologyRegistry);
    plenum.prevailDistributor();
  }

  private Mailer plenum;
  private static String SupportPaperwork;
}
