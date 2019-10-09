package moot;

import limiter.Trainmaster;
import workspace.Treat;
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

public class MethodologyEmulator {
  private static final String synX3210String = "Finished reading input file...";
  private static final String synX3209String = "SIZE";
  private static final String synX3208String = "Arrive";
  private static final String synX3207String = "ID";
  private static final String synX3206String = "DISP";
  private static final String synX3205String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX3204String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX3203String = "./out/production/c3063467A1/";
  private static final String synX3202String = "Unable to generate output file.";
  private static final String synX3201String = "_output.txt";
  private static final String synX3200String = "./out/production/c3063467A1/";
  private static final String synX3199String = ".";
  private static final int synX3198int = 0;
  private static final String synX3197String = "Reading in input file...";
  public Trainmaster reseller;
  public static String GuidanceFilename;
  public LinkedList<Treat> formalitiesCatalog;

  public static synchronized String showDocumentation(String route, Charset code)
      throws IOException {
    byte[] cryptographic = readAllBytes(get(route));
    return new String(cryptographic, code);
  }

  public synchronized void course(String details) {
    this.GuidanceFilename = details;
    reseller = new Trainmaster();
    formalitiesCatalog = new LinkedList<>();
    out.println(synX3197String);

    try {
      String removedIdentify =
          GuidanceFilename.substring(synX3198int, GuidanceFilename.lastIndexOf(synX3199String));
      IntensityReadme =
          new BufferedWriter(new FileWriter(synX3200String + removedIdentify + synX3201String));
    } catch (IOException post) {
      out.println(synX3202String);
    }
    GuidanceFilename = synX3203String + GuidanceFilename;

    try {
      String representations = showDocumentation(GuidanceFilename, UTF_8);
      String knowl = synX3204String;
      Pattern p = compile(knowl);
      Matcher sm = p.matcher(representations);
      String exp2 = synX3205String;
      Pattern c4 = compile(exp2);
      Matcher ap = c4.matcher(representations);

      while (sm.find()) {
        reseller.laidShipmentClip(parseInt(sm.group(synX3206String)));
      }

      while (ap.find()) {
        formalitiesCatalog.add(
            new Treat(
                ap.group(synX3207String),
                parseInt(ap.group(synX3208String)),
                parseInt(ap.group(synX3209String))));
      }
      out.println(synX3210String);
    } catch (Exception vet) {
      out.println(vet.toString());
    }
    reseller.settledServe(formalitiesCatalog);
    reseller.endureRetailer();
  }

  public static BufferedWriter IntensityReadme;
}
