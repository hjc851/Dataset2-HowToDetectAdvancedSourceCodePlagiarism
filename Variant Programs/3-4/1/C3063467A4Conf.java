import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner soothe = new java.util.Scanner(System.in);
  public static final double minimum = 0.9411108208543406;

  public static synchronized void main(String[] array) {
    String lourTreated;
    P6Device affirmative;
    java.lang.String feedback;
    int northlandInformation;
    int southernStimulant;
    lourTreated = "7yYBSry";
    affirmative = null;
    feedback = "";
    northlandInformation = -1;
    southernStimulant = -1;

    if (array.length > 0) {
      for (java.lang.String fh : array) {
        feedback = fh;
      }

      try {
        java.lang.String septentrionKnowl;
        java.util.regex.Pattern nordCharacteristics;
        java.util.regex.Matcher northernValidator;
        java.lang.String northernPlu;
        java.util.regex.Pattern regionTemplate;
        java.util.regex.Matcher southernValidator;
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = recordExecutable(feedback, StandardCharsets.UTF_8);
        septentrionKnowl = "N=(?<North>[\\d]+)";
        nordCharacteristics = java.util.regex.Pattern.compile(septentrionKnowl);
        northernValidator = nordCharacteristics.matcher(feedback);

        while (northernValidator.find()) {
          northlandInformation = java.lang.Integer.parseInt(northernValidator.group("North"));
        }
        northernPlu = "S=(?<South>[\\d]+)";
        regionTemplate = java.util.regex.Pattern.compile(northernPlu);
        southernValidator = regionTemplate.matcher(feedback);

        while (southernValidator.find()) {
          southernStimulant = java.lang.Integer.parseInt(southernValidator.group("South"));
        }
      } catch (java.io.IOException adrian) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = soothe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = soothe.nextInt();
    }
    affirmative = new P6Device(northlandInformation, southernStimulant);
    System.out.println("main: Start main");
    affirmative.commencement();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String road, java.nio.charset.Charset scrambling) throws IOException {
    double circumscribe;
    circumscribe = 0.3504328270340461;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(interleaves, scrambling);
  }
}
