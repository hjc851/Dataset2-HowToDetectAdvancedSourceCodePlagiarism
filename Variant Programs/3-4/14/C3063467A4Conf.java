import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] rationalizations) {
    double quantify;
    AtAnalogue ims;
    java.lang.String response;
    int septentrionAssistance;
    int southwesterlyOpinion;
    quantify = 0.25380033605712027;
    ims = null;
    response = "";
    septentrionAssistance = -1;
    southwesterlyOpinion = -1;

    if (rationalizations.length > 0) {
      for (java.lang.String ora : rationalizations) {
        response = ora;
      }

      try {
        java.lang.String northerSvc;
        java.util.regex.Pattern northeastwardTrend;
        java.util.regex.Matcher northerlyRecognizer;
        java.lang.String northOpe;
        java.util.regex.Pattern southeasterlyFigure;
        java.util.regex.Matcher southerlySpecifier;
        response = "./out/production/c3063467A2P1/" + response;
        response = recordExecutable(response, StandardCharsets.UTF_8);
        northerSvc = "N=(?<North>[\\d]+)";
        northeastwardTrend = java.util.regex.Pattern.compile(northerSvc);
        northerlyRecognizer = northeastwardTrend.matcher(response);

        while (northerlyRecognizer.find()) {
          septentrionAssistance = java.lang.Integer.parseInt(northerlyRecognizer.group("North"));
        }
        northOpe = "S=(?<South>[\\d]+)";
        southeasterlyFigure = java.util.regex.Pattern.compile(northOpe);
        southerlySpecifier = southeasterlyFigure.matcher(response);

        while (southerlySpecifier.find()) {
          southwesterlyOpinion = java.lang.Integer.parseInt(southerlySpecifier.group("South"));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    while (septentrionAssistance < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      septentrionAssistance = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = joystick.nextInt();
    }
    ims = new AtAnalogue(septentrionAssistance, southwesterlyOpinion);
    System.out.println("main: Start main");
    ims.commencing();
  }

  static {
    joystick = new java.util.Scanner(System.in);
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String ride, java.nio.charset.Charset decoding) throws IOException {
    double greaterConstrain;
    greaterConstrain = 0.48616643734750675;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(interleaves, decoding);
  }

  static final double juniorRestriction = 0.8751181382674112;
  private static java.util.Scanner joystick = null;
}
