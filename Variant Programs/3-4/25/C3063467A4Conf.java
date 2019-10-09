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

  private static synchronized java.lang.String perusedArchives(
      java.lang.String way, java.nio.charset.Charset metadata) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(programmed, metadata);
  }

  public static synchronized void main(String[] create) {
    AtAnalogue ims;
    java.lang.String participation;
    int unionPerspective;
    int southwestStimulus;
    ims = null;
    participation = "";
    unionPerspective = -1;
    southwestStimulus = -1;

    if (create.length > 0) {
      for (java.lang.String fh : create) {
        participation = fh;
      }

      try {
        java.lang.String northeastwardAppl;
        java.util.regex.Pattern northwestRule;
        java.util.regex.Matcher northwardCollator;
        java.lang.String sKnowl;
        java.util.regex.Pattern dixieTrends;
        java.util.regex.Matcher southernmostCollator;
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = perusedArchives(participation, StandardCharsets.UTF_8);
        northeastwardAppl = "N=(?<North>[\\d]+)";
        northwestRule = java.util.regex.Pattern.compile(northeastwardAppl);
        northwardCollator = northwestRule.matcher(participation);

        while (northwardCollator.find()) {
          unionPerspective = java.lang.Integer.parseInt(northwardCollator.group("North"));
        }
        sKnowl = "S=(?<South>[\\d]+)";
        dixieTrends = java.util.regex.Pattern.compile(sKnowl);
        southernmostCollator = dixieTrends.matcher(participation);

        while (southernmostCollator.find()) {
          southwestStimulus = java.lang.Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (java.io.IOException abdul) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = joystick.nextInt();
    }
    ims = new AtAnalogue(unionPerspective, southwestStimulus);
    System.out.println("main: Start main");
    ims.initiating();
  }

  static {
    joystick = new java.util.Scanner(System.in);
  }
}
