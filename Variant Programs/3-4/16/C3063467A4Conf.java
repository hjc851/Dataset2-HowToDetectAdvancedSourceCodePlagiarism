import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner comfort = null;
  public static final int chained = 1245669026;

  public static synchronized void main(String[] handles) {
    int maximum;
    P4Mock msi;
    java.lang.String feedback;
    int septentrionAssistance;
    int southwardFeedback;
    maximum = -1871496706;
    msi = null;
    feedback = "";
    septentrionAssistance = -1;
    southwardFeedback = -1;

    if (handles.length > 0) {
      for (java.lang.String waffen : handles) {
        feedback = waffen;
      }

      try {
        java.lang.String northerlyEquiv;
        java.util.regex.Pattern northlandTrends;
        java.util.regex.Matcher southBrite;
        java.lang.String northOpe;
        java.util.regex.Pattern southeastwardTrend;
        java.util.regex.Matcher dixieConverter;
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = understandCharge(feedback, StandardCharsets.UTF_8);
        northerlyEquiv = "N=(?<North>[\\d]+)";
        northlandTrends = java.util.regex.Pattern.compile(northerlyEquiv);
        southBrite = northlandTrends.matcher(feedback);

        while (southBrite.find()) {
          septentrionAssistance = java.lang.Integer.parseInt(southBrite.group("North"));
        }
        northOpe = "S=(?<South>[\\d]+)";
        southeastwardTrend = java.util.regex.Pattern.compile(northOpe);
        dixieConverter = southeastwardTrend.matcher(feedback);

        while (dixieConverter.find()) {
          southwardFeedback = java.lang.Integer.parseInt(dixieConverter.group("South"));
        }
      } catch (java.io.IOException voto) {
        System.out.println("");
      }
    }

    while (septentrionAssistance < 0 || southwardFeedback < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      septentrionAssistance = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwardFeedback = comfort.nextInt();
    }
    msi = new P4Mock(septentrionAssistance, southwardFeedback);
    System.out.println("main: Start main");
    msi.initiating();
  }

  private static synchronized java.lang.String understandCharge(
      java.lang.String journey, java.nio.charset.Charset codify) throws IOException {
    double cite;
    cite = 0.641559243760723;
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(scrambled, codify);
  }

  static {
    comfort = new java.util.Scanner(System.in);
  }
}
