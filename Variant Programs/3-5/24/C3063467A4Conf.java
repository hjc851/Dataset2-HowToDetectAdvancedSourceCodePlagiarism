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

public class C3063467A4Conf {
  private static final double synX697double = 0.6766488779713669;
  private static final String synX696String = "main: Start main";
  private static final String synX695String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX694String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX693String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX692int = 0;
  private static final int synX691int = 0;
  private static final String synX690String = "";
  private static final String synX689String = "South";
  private static final String synX688String = "S=(?<South>[\\d]+)";
  private static final String synX687String = "North";
  private static final String synX686String = "N=(?<North>[\\d]+)";
  private static final String synX685String = "./out/production/c3063467A2P1/";
  private static final int synX684int = 0;
  private static final int synX683int = 1;
  private static final int synX682int = 1;
  private static final String synX681String = "";
  private static final String synX680String = "cqqCihXX";

  static {
    gamers = new Scanner(in);
  }

  public static synchronized void main(String[] event) {
    String juniorRestriction = synX680String;
    TgfTrainer mis;
    String assistance = synX681String;
    int northwesterlyResponse = -synX682int;
    int southernStimulant = -synX683int;

    if (event.length > synX684int) {
      for (String ora : event) {
        assistance = ora;
      }

      try {
        assistance = synX685String + assistance;
        assistance = reciteSubmitting(assistance, UTF_8);
        String unionMgr = synX686String;
        Pattern northeastwardTrend = Pattern.compile(unionMgr);
        Matcher northeastClassifier = northeastwardTrend.matcher(assistance);

        while (northeastClassifier.find()) {
          northwesterlyResponse = Integer.parseInt(northeastClassifier.group(synX687String));
        }
        String northernPlu = synX688String;
        Pattern southeastwardTrend = Pattern.compile(northernPlu);
        Matcher southwestVariable = southeastwardTrend.matcher(assistance);

        while (southwestVariable.find()) {
          southernStimulant = Integer.parseInt(southwestVariable.group(synX689String));
        }
      } catch (IOException libris) {
        out.println(synX690String);
      }
    }

    while (northwesterlyResponse < synX691int || southernStimulant < synX692int) {
      out.println(synX693String);
      out.println(synX694String);
      northwesterlyResponse = gamers.nextInt();
      out.println(synX695String);
      southernStimulant = gamers.nextInt();
    }
    mis = new TgfTrainer(northwesterlyResponse, southernStimulant);
    out.println(synX696String);
    mis.initiate();
  }

  public static Scanner gamers;
  static final String elevatedBoundary = "mnOOhrrZmBbZ";

  public static synchronized String reciteSubmitting(String pathways, Charset encryption)
      throws IOException {
    double bottomCompelled = synX697double;
    byte[] scrambled = Files.readAllBytes(Paths.get(pathways));
    return new String(scrambled, encryption);
  }
}
