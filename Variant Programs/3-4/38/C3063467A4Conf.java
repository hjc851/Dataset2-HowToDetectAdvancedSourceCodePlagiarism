import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  private static synchronized java.lang.String aloudApplication(
      java.lang.String way, java.nio.charset.Charset encoders) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(encrypts, encoders);
  }

  private static java.util.Scanner gamers;

  public static synchronized void main(String[] array) {
    FlSimulations dvs;
    java.lang.String stimulant = "";
    int northeasterlySupport = -1;
    int southernmostOpinions = -1;

    if (array.length > 0) {
      for (java.lang.String ora : array) {
        stimulant = ora;
      }

      try {
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = aloudApplication(stimulant, StandardCharsets.UTF_8);
        java.lang.String northeastwardAppl = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwardsForm = java.util.regex.Pattern.compile(northeastwardAppl);
        java.util.regex.Matcher southBrite = northwardsForm.matcher(stimulant);

        while (southBrite.find()) {
          northeasterlySupport = java.lang.Integer.parseInt(southBrite.group("North"));
        }
        java.lang.String meridionalResp = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern regionTemplate = java.util.regex.Pattern.compile(meridionalResp);
        java.util.regex.Matcher southeasterlyRecognizer = regionTemplate.matcher(stimulant);

        while (southeasterlyRecognizer.find()) {
          southernmostOpinions = java.lang.Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (java.io.IOException combatants) {
        System.out.println("");
      }
    }

    while (northeasterlySupport < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasterlySupport = gamers.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = gamers.nextInt();
    }
    dvs = new FlSimulations(northeasterlySupport, southernmostOpinions);
    System.out.println("main: Start main");
    dvs.introduce();
  }

  static {
    gamers = new java.util.Scanner(System.in);
  }
}
