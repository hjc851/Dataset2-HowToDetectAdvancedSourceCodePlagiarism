import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized java.lang.String writeDatabase(
      java.lang.String step, java.nio.charset.Charset demodulation) throws IOException {
    double key;
    key = 0.21306658840258652;
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(encrypts, demodulation);
  }

  static final String senateCurb = "fX";
  public static java.util.Scanner solace = new java.util.Scanner(System.in);

  public static synchronized void main(String[] arguments) {
    double boundary;
    P3Simulating yes;
    java.lang.String participation;
    int northeastStimulation;
    int southmostOutput;
    boundary = 0.6422489780015678;
    participation = "";
    northeastStimulation = -1;
    southmostOutput = -1;

    if (arguments.length > 0) {
      for (java.lang.String waffen : arguments) {
        participation = waffen;
      }

      try {
        java.lang.String northernmostIndiv;
        java.util.regex.Pattern northerlyFigure;
        java.util.regex.Matcher northerlyRecognizer;
        java.lang.String southerlyYrs;
        java.util.regex.Pattern confederacyNorm;
        java.util.regex.Matcher southernValidator;
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = writeDatabase(participation, StandardCharsets.UTF_8);
        northernmostIndiv = "N=(?<North>[\\d]+)";
        northerlyFigure = java.util.regex.Pattern.compile(northernmostIndiv);
        northerlyRecognizer = northerlyFigure.matcher(participation);

        while (northerlyRecognizer.find()) {
          northeastStimulation = java.lang.Integer.parseInt(northerlyRecognizer.group("North"));
        }
        southerlyYrs = "S=(?<South>[\\d]+)";
        confederacyNorm = java.util.regex.Pattern.compile(southerlyYrs);
        southernValidator = confederacyNorm.matcher(participation);

        while (southernValidator.find()) {
          southmostOutput = java.lang.Integer.parseInt(southernValidator.group("South"));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    while (northeastStimulation < 0 || southmostOutput < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = solace.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southmostOutput = solace.nextInt();
    }
    yes = new P3Simulating(northeastStimulation, southmostOutput);
    System.out.println("main: Start main");
    yes.undertake();
  }
}
