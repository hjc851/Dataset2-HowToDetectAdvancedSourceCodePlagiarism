import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner deck;
  public static final int greaterConstrain = 944915321;

  public static synchronized void main(String[] variable) {
    double upstairsRestrain;
    InterferonPrototype favour;
    java.lang.String involvement;
    int northlandInformation;
    int southerlySupport;
    upstairsRestrain = (0.15051257770266668);
    involvement = ("");
    northlandInformation = (-1);
    southerlySupport = (-1);

    if (variable.length > 0) {
      for (java.lang.String fh : variable) {
        involvement = (fh);
      }

      try {
        java.lang.String uptownBens;
        java.util.regex.Pattern northmostCharacteristic;
        java.util.regex.Matcher northboundSinusoid;
        java.lang.String meridionalResp;
        java.util.regex.Pattern confederacyNorm;
        java.util.regex.Matcher southeasterlyRecognizer;
        involvement = ("./out/production/c3063467A2P1/" + involvement);
        involvement = (reciteSubmitting(involvement, StandardCharsets.UTF_8));
        uptownBens = ("N=(?<North>[\\d]+)");
        northmostCharacteristic = (java.util.regex.Pattern.compile(uptownBens));
        northboundSinusoid = (northmostCharacteristic.matcher(involvement));

        while (northboundSinusoid.find()) {
          northlandInformation = (java.lang.Integer.parseInt(northboundSinusoid.group("North")));
        }
        meridionalResp = ("S=(?<South>[\\d]+)");
        confederacyNorm = (java.util.regex.Pattern.compile(meridionalResp));
        southeasterlyRecognizer = (confederacyNorm.matcher(involvement));

        while (southeasterlyRecognizer.find()) {
          southerlySupport = (java.lang.Integer.parseInt(southeasterlyRecognizer.group("South")));
        }
      } catch (java.io.IOException pro) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || southerlySupport < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = (deck.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southerlySupport = (deck.nextInt());
    }
    favour = (new InterferonPrototype(northlandInformation, southerlySupport));
    System.out.println("main: Start main");
    favour.opens();
  }

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String avenue, java.nio.charset.Charset code) throws IOException {
    double kate;
    kate = (0.8123214753084617);
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(entered, code);
  }

  static {
    deck = (new java.util.Scanner(System.in));
  }
}
