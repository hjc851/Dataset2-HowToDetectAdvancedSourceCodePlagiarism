import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {
  private static final String synX414String = "main: Start main";
  private static final String synX413String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX412String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX411String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX410int = 0;
  private static final int synX409int = 0;
  private static final String synX408String = "";
  private static final String synX407String = "South";
  private static final String synX406String = "S=(?<South>[\\d]+)";
  private static final String synX405String = "North";
  private static final String synX404String = "N=(?<North>[\\d]+)";
  private static final String synX403String = "./out/production/c3063467A2P1/";
  private static final int synX402int = 0;
  private static final int synX401int = 1;
  private static final int synX400int = 1;
  private static final String synX399String = "";
  private static final double synX398double = 0.8019263751935903;
  private static final int synX397int = 2011703085;
  public static java.util.Scanner gamers = new java.util.Scanner(System.in);

  public static synchronized java.lang.String learnRegister(
      java.lang.String routes, java.nio.charset.Charset consolidation) throws IOException {
    int topmostCertain;
    topmostCertain = synX397int;
    byte[] initiated = readAllBytes(get(routes));
    return new java.lang.String(initiated, consolidation);
  }

  static final int time = -1253042001;

  public static synchronized void main(String[] using) {
    double max;
    ConfSimulation smart;
    java.lang.String submissions;
    int northeastwardParticipation;
    int southwardFeedback;
    max = synX398double;
    smart = null;
    submissions = synX399String;
    northeastwardParticipation = -synX400int;
    southwardFeedback = -synX401int;

    if (using.length > synX402int) {
      for (java.lang.String fh : using) {
        submissions = fh;
      }

      try {
        java.lang.String northlandInd;
        java.util.regex.Pattern uptownMethod;
        java.util.regex.Matcher northwestwardVerifier;
        java.lang.String southwesterlyPkg;
        java.util.regex.Pattern southwesterlyConvention;
        java.util.regex.Matcher southwestVariable;
        submissions = synX403String + submissions;
        submissions = learnRegister(submissions, StandardCharsets.UTF_8);
        northlandInd = synX404String;
        uptownMethod = compile(northlandInd);
        northwestwardVerifier = uptownMethod.matcher(submissions);

        while (northwestwardVerifier.find()) {
          northeastwardParticipation = parseInt(northwestwardVerifier.group(synX405String));
        }
        southwesterlyPkg = synX406String;
        southwesterlyConvention = compile(southwesterlyPkg);
        southwestVariable = southwesterlyConvention.matcher(submissions);

        while (southwestVariable.find()) {
          southwardFeedback = parseInt(southwestVariable.group(synX407String));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println(synX408String);
      }
    }

    while (northeastwardParticipation < synX409int || southwardFeedback < synX410int) {
      System.out.println(synX411String);
      System.out.println(synX412String);
      northeastwardParticipation = gamers.nextInt();
      System.out.println(synX413String);
      southwardFeedback = gamers.nextInt();
    }
    smart = new ConfSimulation(northeastwardParticipation, southwardFeedback);
    System.out.println(synX414String);
    smart.launch();
  }
}
