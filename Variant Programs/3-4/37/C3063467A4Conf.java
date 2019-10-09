import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static final int ceiling = -633999125;
  public static java.util.Scanner joystick = new java.util.Scanner(System.in);

  public static synchronized void main(String[] number) {
    double nominate = 0.6236409086383787;
    EMoot ims;
    java.lang.String comments = "";
    int northerlyAdvice = -1;
    int southwardFeedback = -1;

    if (number.length > 0) {
      for (java.lang.String waffen : number) {
        comments = waffen;
      }

      try {
        comments = "./out/production/c3063467A2P1/" + comments;
        comments = showDocumentation(comments, StandardCharsets.UTF_8);
        java.lang.String northwestInteractive = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwardsForm =
            java.util.regex.Pattern.compile(northwestInteractive);
        java.util.regex.Matcher northeastClassifier = northwardsForm.matcher(comments);

        while (northeastClassifier.find()) {
          northerlyAdvice = java.lang.Integer.parseInt(northeastClassifier.group("North"));
        }
        java.lang.String sKnowl = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southlandMotif = java.util.regex.Pattern.compile(sKnowl);
        java.util.regex.Matcher northernColorimetry = southlandMotif.matcher(comments);

        while (northernColorimetry.find()) {
          southwardFeedback = java.lang.Integer.parseInt(northernColorimetry.group("South"));
        }
      } catch (java.io.IOException aba) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || southwardFeedback < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwardFeedback = joystick.nextInt();
    }
    ims = new EMoot(northerlyAdvice, southwardFeedback);
    System.out.println("main: Start main");
    ims.embark();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String avenue, java.nio.charset.Charset codec) throws IOException {
    double pawn = 0.5832141922619164;
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(programmed, codec);
  }
}
