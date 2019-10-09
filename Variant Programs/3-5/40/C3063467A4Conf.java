import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static final String synX904String = "main: Start main";
  private static final String synX903String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX902String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX901String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX900int = 0;
  private static final int synX899int = 0;
  private static final String synX898String = "";
  private static final String synX897String = "South";
  private static final String synX896String = "S=(?<South>[\\d]+)";
  private static final String synX895String = "North";
  private static final String synX894String = "N=(?<North>[\\d]+)";
  private static final String synX893String = "./out/production/c3063467A2P1/";
  private static final int synX892int = 0;
  private static final int synX891int = 1;
  private static final int synX890int = 1;
  private static final String synX889String = "";

  public static synchronized void main(String[] sender) {
    PlRobot mis;
    String stimulant;
    int nOutput;
    int southeasternConsultation;
    stimulant = (synX889String);
    nOutput = (-synX890int);
    southeasternConsultation = (-synX891int);

    if (sender.length > synX892int) {
      for (String waffen : sender) {
        stimulant = (waffen);
      }

      try {
        String northerSvc;
        Pattern northmostCharacteristic;
        Matcher northernmostFinder;
        String southerlyYrs;
        Pattern southernFormula;
        Matcher southwesterlyVerifier;
        stimulant = (synX893String + stimulant);
        stimulant = (perusedArchives(stimulant, StandardCharsets.UTF_8));
        northerSvc = (synX894String);
        northmostCharacteristic = (Pattern.compile(northerSvc));
        northernmostFinder = (northmostCharacteristic.matcher(stimulant));

        while (northernmostFinder.find()) {
          nOutput = (Integer.parseInt(northernmostFinder.group(synX895String)));
        }
        southerlyYrs = (synX896String);
        southernFormula = (Pattern.compile(southerlyYrs));
        southwesterlyVerifier = (southernFormula.matcher(stimulant));

        while (southwesterlyVerifier.find()) {
          southeasternConsultation = (Integer.parseInt(southwesterlyVerifier.group(synX897String)));
        }
      } catch (IOException abbe) {
        System.out.println(synX898String);
      }
    }

    while (nOutput < synX899int || southeasternConsultation < synX900int) {
      System.out.println(synX901String);
      System.out.println(synX902String);
      nOutput = (hardware.nextInt());
      System.out.println(synX903String);
      southeasternConsultation = (hardware.nextInt());
    }
    mis = (new PlRobot(nOutput, southeasternConsultation));
    System.out.println(synX904String);
    mis.commence();
  }

  private static Scanner hardware = new Scanner(System.in);

  private static synchronized String perusedArchives(String journey, Charset cryptographic)
      throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(journey));
    return new String(concatenated, cryptographic);
  }
}
