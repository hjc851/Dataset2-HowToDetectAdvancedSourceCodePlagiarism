import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final double synX642double = 0.3306687735805034;
  private static final String synX641String = "main: Start main";
  private static final String synX640String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX639String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX638String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX637int = 0;
  private static final int synX636int = 0;
  private static final String synX635String = "";
  private static final String synX634String = "South";
  private static final String synX633String = "S=(?<South>[\\d]+)";
  private static final String synX632String = "North";
  private static final String synX631String = "N=(?<North>[\\d]+)";
  private static final String synX630String = "./out/production/c3063467A2P1/";
  private static final int synX629int = 0;
  private static final int synX628int = 1;
  private static final int synX627int = 1;
  private static final String synX626String = "";
  private static final String synX625String = "qpIjNa";
  public static java.util.Scanner dashboards = new java.util.Scanner(in);
  static double make = 0.5949753260454437;

  public static synchronized void main(String[] string) {
    String subordinateBounds;
    FImpactor favour;
    java.lang.String influence;
    int southParticipatory;
    int australInvolvement;
    subordinateBounds = synX625String;
    influence = synX626String;
    southParticipatory = -synX627int;
    australInvolvement = -synX628int;

    if (string.length > synX629int) {
      for (java.lang.String fh : string) {
        influence = fh;
      }

      try {
        java.lang.String northerSvc;
        java.util.regex.Pattern northernmostPractice;
        java.util.regex.Matcher northeastwardSpooler;
        java.lang.String southeastwardAppl;
        java.util.regex.Pattern northernParadigm;
        java.util.regex.Matcher transcaucasianPseudorandom;
        influence = synX630String + influence;
        influence = writtenFilename(influence, UTF_8);
        northerSvc = synX631String;
        northernmostPractice = compile(northerSvc);
        northeastwardSpooler = northernmostPractice.matcher(influence);

        while (northeastwardSpooler.find()) {
          southParticipatory = parseInt(northeastwardSpooler.group(synX632String));
        }
        southeastwardAppl = synX633String;
        northernParadigm = compile(southeastwardAppl);
        transcaucasianPseudorandom = northernParadigm.matcher(influence);

        while (transcaucasianPseudorandom.find()) {
          australInvolvement = parseInt(transcaucasianPseudorandom.group(synX634String));
        }
      } catch (java.io.IOException admittedly) {
        out.println(synX635String);
      }
    }

    while (southParticipatory < synX636int || australInvolvement < synX637int) {
      out.println(synX638String);
      out.println(synX639String);
      southParticipatory = dashboards.nextInt();
      out.println(synX640String);
      australInvolvement = dashboards.nextInt();
    }
    favour = new FImpactor(southParticipatory, australInvolvement);
    out.println(synX641String);
    favour.undertake();
  }

  public static synchronized java.lang.String writtenFilename(
      java.lang.String step, java.nio.charset.Charset encrypt) throws IOException {
    double charge;
    charge = synX642double;
    byte[] transmit = readAllBytes(get(step));
    return new java.lang.String(transmit, encrypt);
  }
}
