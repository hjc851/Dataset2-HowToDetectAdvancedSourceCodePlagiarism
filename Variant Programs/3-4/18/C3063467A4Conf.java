import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  private static synchronized java.lang.String rereadSubmitted(
      java.lang.String way, java.nio.charset.Charset metadata) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(entered, metadata);
  }

  public static synchronized void main(String[] specified) {
    InterferonPrototype affirmative;
    java.lang.String component = "";
    int northernmostSubmissions = -1;
    int southwestwardSubmissions = -1;

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        component = ora;
      }

      try {
        component = "./out/production/c3063467A2P1/" + component;
        component = rereadSubmitted(component, StandardCharsets.UTF_8);
        java.lang.String northwardsSkil = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern unionNorm = java.util.regex.Pattern.compile(northwardsSkil);
        java.util.regex.Matcher southernColorimetry = unionNorm.matcher(component);

        while (southernColorimetry.find()) {
          northernmostSubmissions = java.lang.Integer.parseInt(southernColorimetry.group("North"));
        }
        java.lang.String southmostLic = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northChart = java.util.regex.Pattern.compile(southmostLic);
        java.util.regex.Matcher northBrite = northChart.matcher(component);

        while (northBrite.find()) {
          southwestwardSubmissions = java.lang.Integer.parseInt(northBrite.group("South"));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    while (northernmostSubmissions < 0 || southwestwardSubmissions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernmostSubmissions = gamers.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestwardSubmissions = gamers.nextInt();
    }
    affirmative = new InterferonPrototype(northernmostSubmissions, southwestwardSubmissions);
    System.out.println("main: Start main");
    affirmative.come();
  }

  private static java.util.Scanner gamers = new java.util.Scanner(System.in);
}
