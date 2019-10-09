import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {

  private static synchronized String learnRegister(String roadway, Charset encrypting)
      throws IOException {
    String lowlyEnchained = "";
    byte[] instantiated = readAllBytes(get(roadway));
    return new String(instantiated, encrypting);
  }

  public static synchronized void main(String[] align) {
    double hokkianeseRadius = 0.6091741297792127;
    B2Modelling affirmative;
    String advice = "";
    int northernmostSubmissions = -1;
    int confederacyPerspective = -1;

    if (align.length > 0) {
      for (String waffen : align) {
        advice = waffen;
      }

      try {
        advice = "./out/production/c3063467A2P1/" + advice;
        advice = learnRegister(advice, StandardCharsets.UTF_8);
        String nordCust = "N=(?<North>[\\d]+)";
        Pattern nTriangle = compile(nordCust);
        Matcher southBrite = nTriangle.matcher(advice);

        while (southBrite.find()) {
          northernmostSubmissions = parseInt(southBrite.group("North"));
        }
        String southmostLic = "S=(?<South>[\\d]+)";
        Pattern northChart = compile(southmostLic);
        Matcher dixieConverter = northChart.matcher(advice);

        while (dixieConverter.find()) {
          confederacyPerspective = parseInt(dixieConverter.group("South"));
        }
      } catch (IOException libris) {
        System.out.println("");
      }
    }

    while (northernmostSubmissions < 0 || confederacyPerspective < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernmostSubmissions = solace.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      confederacyPerspective = solace.nextInt();
    }
    affirmative = new B2Modelling(northernmostSubmissions, confederacyPerspective);
    System.out.println("main: Start main");
    affirmative.hold();
  }

  public static double reduceUnfree = 0.04947200021582132;
  private static Scanner solace = new Scanner(System.in);
}
