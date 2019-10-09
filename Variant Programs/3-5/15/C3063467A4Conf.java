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
  private static final double synX262double = 0.7365124739114426;
  private static final String synX261String = "main: Start main";
  private static final String synX260String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX259String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX258String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX257int = 0;
  private static final int synX256int = 0;
  private static final String synX255String = "";
  private static final String synX254String = "South";
  private static final String synX253String = "S=(?<South>[\\d]+)";
  private static final String synX252String = "North";
  private static final String synX251String = "N=(?<North>[\\d]+)";
  private static final String synX250String = "./out/production/c3063467A2P1/";
  private static final int synX249int = 0;
  private static final int synX248int = 1;
  private static final int synX247int = 1;
  private static final String synX246String = "";
  private static final double synX245double = 0.04239085625745331;
  static double height = 0.45790037072321854;
  public static java.util.Scanner dashboard;

  public static synchronized void main(String[] sender) {
    double span = synX245double;
    TgfTrainer mackay;
    java.lang.String perspective = synX246String;
    int southernComments = -synX247int;
    int southerlySupport = -synX248int;

    if (sender.length > synX249int) {
      for (java.lang.String fh : sender) {
        perspective = fh;
      }

      try {
        perspective = synX250String + perspective;
        perspective = proofreadComplaint(perspective, StandardCharsets.UTF_8);
        java.lang.String northwardsSkil = synX251String;
        java.util.regex.Pattern northwesterlyPatten = compile(northwardsSkil);
        java.util.regex.Matcher northboundSinusoid = northwesterlyPatten.matcher(perspective);

        while (northboundSinusoid.find()) {
          southernComments = parseInt(northboundSinusoid.group(synX252String));
        }
        java.lang.String southwestInteractive = synX253String;
        java.util.regex.Pattern dixielandCharacteristic = compile(southwestInteractive);
        java.util.regex.Matcher southernmostCollator = dixielandCharacteristic.matcher(perspective);

        while (southernmostCollator.find()) {
          southerlySupport = parseInt(southernmostCollator.group(synX254String));
        }
      } catch (java.io.IOException voto) {
        System.out.println(synX255String);
      }
    }

    while (southernComments < synX256int || southerlySupport < synX257int) {
      System.out.println(synX258String);
      System.out.println(synX259String);
      southernComments = dashboard.nextInt();
      System.out.println(synX260String);
      southerlySupport = dashboard.nextInt();
    }
    mackay = new TgfTrainer(southernComments, southerlySupport);
    System.out.println(synX261String);
    mackay.undertake();
  }

  public static synchronized java.lang.String proofreadComplaint(
      java.lang.String trail, java.nio.charset.Charset codify) throws IOException {
    double winder = synX262double;
    byte[] ciphered = readAllBytes(get(trail));
    return new java.lang.String(ciphered, codify);
  }

  static {
    dashboard = new java.util.Scanner(System.in);
  }
}
