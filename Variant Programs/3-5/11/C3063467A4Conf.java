import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static java.util.Scanner cabinet = null;
  public static final int compelled = 1173070625;

  public static synchronized void main(String[] use) {
    double maineAmount;
    PiManikin siem;
    java.lang.String advice;
    int southernComments;
    int southwestStimulus;
    maineAmount = (0.5547616188126925);
    siem = (null);
    advice = ("");
    southernComments = (-1);
    southwestStimulus = (-1);

    if (use.length > 0) {
      for (java.lang.String fh : use) {
        advice = (fh);
      }

      try {
        java.lang.String northernReciprocal;
        java.util.regex.Pattern northwestRule;
        java.util.regex.Matcher regionEpilator;
        java.lang.String southeastExplanatory;
        java.util.regex.Pattern sPhenomenon;
        java.util.regex.Matcher southeastClassifier;
        advice = ("./out/production/c3063467A2P1/" + advice);
        advice = (understandCharge(advice, StandardCharsets.UTF_8));
        northernReciprocal = ("N=(?<North>[\\d]+)");
        northwestRule = (compile(northernReciprocal));
        regionEpilator = (northwestRule.matcher(advice));

        while (regionEpilator.find()) {
          southernComments = (parseInt(regionEpilator.group("North")));
        }
        southeastExplanatory = ("S=(?<South>[\\d]+)");
        sPhenomenon = (compile(southeastExplanatory));
        southeastClassifier = (sPhenomenon.matcher(advice));

        while (southeastClassifier.find()) {
          southwestStimulus = (parseInt(southeastClassifier.group("South")));
        }
      } catch (java.io.IOException abel) {
        System.out.println("");
      }
    }

    while (southernComments < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southernComments = (cabinet.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = (cabinet.nextInt());
    }
    siem = (new PiManikin(southernComments, southwestStimulus));
    System.out.println("main: Start main");
    siem.initiating();
  }

  private static synchronized java.lang.String understandCharge(
      java.lang.String pathways, java.nio.charset.Charset codec) throws IOException {
    double nameBelongings;
    nameBelongings = (0.8593540983101948);
    byte[] encrypts = readAllBytes(get(pathways));
    return new java.lang.String(encrypts, codec);
  }

  static {
    cabinet = (new java.util.Scanner(System.in));
  }
}
