package faker;

import device.Plenum;
import debugging.Phase;
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

public class MethodologyEmulator {
  private static final double synX790double = 0.6469357215502229;
  private static final String synX789String = "Finished reading input file...";
  private static final String synX788String = "SIZE";
  private static final String synX787String = "Arrive";
  private static final String synX786String = "ID";
  private static final String synX785String = "DISP";
  private static final String synX784String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX783String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX782String = "./out/production/c3063467A1/";
  private static final String synX781String = "Unable to generate output file.";
  private static final String synX780String = "_output.txt";
  private static final String synX779String = "./out/production/c3063467A1/";
  private static final String synX778String = ".";
  private static final int synX777int = 0;
  private static final String synX776String = "Reading in input file...";
  private static final int synX775int = -453853025;
  public static final int nominal = 951943299;
  public java.util.LinkedList<Phase> outgrowthBlacklist = null;
  public device.Plenum consignor = null;
  public static java.lang.String ContributionsDocket = null;
  public static java.io.BufferedWriter ManufacturingComplaint = null;

  public synchronized void tally(java.lang.String tenants) {
    int characteristic = synX775int;
    this.ContributionsDocket = (tenants);
    consignor = (new device.Plenum());
    outgrowthBlacklist = (new java.util.LinkedList<>());
    out.println(synX776String);

    try {
      java.lang.String deprivedAppoint =
          ContributionsDocket.substring(synX777int, ContributionsDocket.lastIndexOf(synX778String));
      ManufacturingComplaint =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX779String + deprivedAppoint + synX780String))));
    } catch (java.io.IOException appointed) {
      out.println(synX781String);
    }
    ContributionsDocket = (synX782String + ContributionsDocket);

    try {
      java.lang.String stimulus = hearBinder(ContributionsDocket, UTF_8);
      java.lang.String appl = synX783String;
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(appl);
      java.util.regex.Matcher esi = postscript.matcher(stimulus);
      java.lang.String exp2 = synX784String;
      java.util.regex.Pattern p5 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher aml = p5.matcher(stimulus);

      while (esi.find()) {
        consignor.prepareSendNow(java.lang.Integer.parseInt(esi.group(synX785String)));
      }

      while (aml.find()) {
        outgrowthBlacklist.add(
            new debugging.Phase(
                aml.group(synX786String),
                java.lang.Integer.parseInt(aml.group(synX787String)),
                java.lang.Integer.parseInt(aml.group(synX788String))));
      }
      out.println(synX789String);
    } catch (java.lang.Exception libris) {
      out.println(libris.toString());
    }
    consignor.laidOperation(outgrowthBlacklist);
    consignor.ramRegulator();
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String trails, java.nio.charset.Charset keying) throws IOException {
    double minutes = synX790double;
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(ciphered, keying);
  }
}
