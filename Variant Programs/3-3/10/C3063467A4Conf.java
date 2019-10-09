import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner comfort;

  public static synchronized void main(String[] using) {
    EMoot ims;
    java.lang.String submissions = "";
    int southParticipatory = -1;
    int southernStimulant = -1;

    if (using.length > 0) {
      for (java.lang.String fh : using) {
        submissions = fh;
      }

      try {
        submissions = "./out/production/c3063467A2P1/" + submissions;
        submissions = tellReadme(submissions, StandardCharsets.UTF_8);
        java.lang.String northeasternReq = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeastwardTrend =
            java.util.regex.Pattern.compile(northeasternReq);
        java.util.regex.Matcher northmostSelectable = northeastwardTrend.matcher(submissions);

        while (northmostSelectable.find()) {
          southParticipatory = java.lang.Integer.parseInt(northmostSelectable.group("North"));
        }
        java.lang.String australCust = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southeasterlyFigure = java.util.regex.Pattern.compile(australCust);
        java.util.regex.Matcher confederacyAspx = southeasterlyFigure.matcher(submissions);

        while (confederacyAspx.find()) {
          southernStimulant = java.lang.Integer.parseInt(confederacyAspx.group("South"));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = comfort.nextInt();
    }
    ims = new EMoot(southParticipatory, southernStimulant);
    System.out.println("main: Start main");
    ims.launch();
  }

  public static synchronized java.lang.String tellReadme(
      java.lang.String lane, java.nio.charset.Charset codifying) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(ciphered, codifying);
  }

  static {
    comfort = new java.util.Scanner(System.in);
  }
}
