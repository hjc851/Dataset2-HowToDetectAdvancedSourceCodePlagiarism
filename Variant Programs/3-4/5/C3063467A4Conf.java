import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner joystick = null;

  public static synchronized void main(String[] create) {
    AtAnalogue affirmative = null;
    java.lang.String opinion = "";
    int northwesterlyResponse = -1;
    int southwestStimulus = -1;

    if (create.length > 0) {
      for (java.lang.String ora : create) {
        opinion = ora;
      }

      try {
        opinion = "./out/production/c3063467A2P1/" + opinion;
        opinion = wrotePapers(opinion, StandardCharsets.UTF_8);
        java.lang.String northwesternExperiment = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northernmostPractice =
            java.util.regex.Pattern.compile(northwesternExperiment);
        java.util.regex.Matcher septentrionRadian = northernmostPractice.matcher(opinion);

        while (septentrionRadian.find()) {
          northwesterlyResponse = java.lang.Integer.parseInt(septentrionRadian.group("North"));
        }
        java.lang.String southernReciprocal = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwestRule = java.util.regex.Pattern.compile(southernReciprocal);
        java.util.regex.Matcher regionCreaser = southwestRule.matcher(opinion);

        while (regionCreaser.find()) {
          southwestStimulus = java.lang.Integer.parseInt(regionCreaser.group("South"));
        }
      } catch (java.io.IOException former) {
        System.out.println("");
      }
    }

    while (northwesterlyResponse < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwesterlyResponse = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = joystick.nextInt();
    }
    affirmative = new AtAnalogue(northwesterlyResponse, southwestStimulus);
    System.out.println("main: Start main");
    affirmative.commenced();
  }

  private static synchronized java.lang.String wrotePapers(
      java.lang.String approach, java.nio.charset.Charset code) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(keyed, code);
  }

  static {
    joystick = new java.util.Scanner(System.in);
  }
}
