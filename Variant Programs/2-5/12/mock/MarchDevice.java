package mock;

import responsible.Shipper;
import initialization.Procedures;
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

public class MarchDevice {
  private static final int synX1152int = 1200773110;
  private static final String synX1151String = "Finished reading input file...";
  private static final String synX1150String = "SIZE";
  private static final String synX1149String = "Arrive";
  private static final String synX1148String = "ID";
  private static final String synX1147String = "DISP";
  private static final String synX1146String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1145String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1144String = "./out/production/c3063467A1/";
  private static final String synX1143String = "Unable to generate output file.";
  private static final String synX1142String = "_output.txt";
  private static final String synX1141String = "./out/production/c3063467A1/";
  private static final String synX1140String = ".";
  private static final int synX1139int = 0;
  private static final String synX1138String = "Reading in input file...";
  private static final double synX1137double = 0.23767586260914686;
  public static java.io.BufferedWriter CropData = null;
  private static java.lang.String StimulantCharge = null;
  private responsible.Shipper distributor = null;
  private java.util.LinkedList<Procedures> summonsRoster = null;
  public static double trammel = 0.4890519392976993;

  public synchronized void lean(java.lang.String advocates) {
    double prices;
    prices = (synX1137double);
    this.StimulantCharge = (advocates);
    distributor = (new responsible.Shipper());
    summonsRoster = (new java.util.LinkedList<>());
    out.println(synX1138String);

    try {
      java.lang.String unclothedList;
      unclothedList =
          (StimulantCharge.substring(synX1139int, StimulantCharge.lastIndexOf(synX1140String)));
      CropData =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX1141String + unclothedList + synX1142String))));
    } catch (java.io.IOException former) {
      out.println(synX1143String);
    }
    StimulantCharge = (synX1144String + StimulantCharge);

    try {
      java.lang.String contributions;
      java.lang.String resp;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern a2;
      java.util.regex.Matcher fig;
      contributions = (takeDocument(StimulantCharge, UTF_8));
      resp = (synX1145String);
      postscript = (compile(resp));
      dos = (postscript.matcher(contributions));
      exp2 = (synX1146String);
      a2 = (compile(exp2));
      fig = (a2.matcher(contributions));

      while (dos.find()) {
        distributor.determinedDischargeDays(parseInt(dos.group(synX1147String)));
      }

      while (fig.find()) {
        summonsRoster.add(
            new initialization.Procedures(
                fig.group(synX1148String),
                parseInt(fig.group(synX1149String)),
                parseInt(fig.group(synX1150String))));
      }
      out.println(synX1151String);
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
    }
    distributor.placedSue(summonsRoster);
    distributor.meltResellers();
  }

  private static synchronized java.lang.String takeDocument(
      java.lang.String trajectory, java.nio.charset.Charset encrypt) throws IOException {
    int thresholds;
    thresholds = (synX1152int);
    byte[] coded = readAllBytes(get(trajectory));
    return new java.lang.String(coded, encrypt);
  }
}
