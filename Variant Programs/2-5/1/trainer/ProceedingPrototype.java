package trainer;

import exporter.Yardmaster;
import parser.Work;
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

public class ProceedingPrototype {
  private static final int synX269int = 220585360;
  private static final String synX268String = "Finished reading input file...";
  private static final String synX267String = "SIZE";
  private static final String synX266String = "Arrive";
  private static final String synX265String = "ID";
  private static final String synX264String = "DISP";
  private static final String synX263String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX262String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX261String = "./out/production/c3063467A1/";
  private static final String synX260String = "Unable to generate output file.";
  private static final String synX259String = "_output.txt";
  private static final String synX258String = "./out/production/c3063467A1/";
  private static final String synX257String = ".";
  private static final int synX256int = 0;
  private static final String synX255String = "Reading in input file...";
  private static final int synX254int = 1703866998;
  public static java.io.BufferedWriter AmperageSubmitting;
  public static java.lang.String AdviceDocumentation;
  public exporter.Yardmaster yardmaster;
  public java.util.LinkedList<Work> serveNames;
  public static double forename = 0.20984624890315062;

  public synchronized void work(java.lang.String nsis) {
    int limitThickness;
    limitThickness = synX254int;
    this.AdviceDocumentation = nsis;
    yardmaster = new exporter.Yardmaster();
    serveNames = new java.util.LinkedList<>();
    System.out.println(synX255String);

    try {
      java.lang.String deprivedAppoint;
      deprivedAppoint =
          AdviceDocumentation.substring(synX256int, AdviceDocumentation.lastIndexOf(synX257String));
      AmperageSubmitting =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX258String + deprivedAppoint + synX259String));
    } catch (java.io.IOException officio) {
      System.out.println(synX260String);
    }
    AdviceDocumentation = synX261String + AdviceDocumentation;

    try {
      java.lang.String suggestions;
      java.lang.String experiment;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher e2;
      suggestions = studyPaperwork(AdviceDocumentation, StandardCharsets.UTF_8);
      experiment = synX262String;
      postscript = compile(experiment);
      manuscript = postscript.matcher(suggestions);
      exp2 = synX263String;
      k = compile(exp2);
      e2 = k.matcher(suggestions);

      while (manuscript.find()) {
        yardmaster.laidShipmentClip(parseInt(manuscript.group(synX264String)));
      }

      while (e2.find()) {
        serveNames.add(
            new parser.Work(
                e2.group(synX265String),
                parseInt(e2.group(synX266String)),
                parseInt(e2.group(synX267String))));
      }
      System.out.println(synX268String);
    } catch (java.lang.Exception past) {
      System.out.println(past.toString());
    }
    yardmaster.determineProces(serveNames);
    yardmaster.endureRetailer();
  }

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String roadway, java.nio.charset.Charset encrypted) throws IOException {
    int identify;
    identify = synX269int;
    byte[] stored = readAllBytes(get(roadway));
    return new java.lang.String(stored, encrypted);
  }
}
