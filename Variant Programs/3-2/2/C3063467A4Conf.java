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

  public static void main(String[] ing) {
    FlSimulations mackay;
    java.lang.String stimulation = "";
    int unionPerspective = -1;
    int southlandGuidance = -1;

    if (ing.length > 0) {
      for (java.lang.String ora : ing) {
        stimulation = ora;
      }

      try {
        stimulation = "./out/production/c3063467A2P1/" + stimulation;
        stimulation = readerInitiate(stimulation, StandardCharsets.UTF_8);
        java.lang.String northwesternExperiment = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern unionNorm = java.util.regex.Pattern.compile(northwesternExperiment);
        java.util.regex.Matcher northernmostFinder = unionNorm.matcher(stimulation);

        while (northernmostFinder.find()) {
          unionPerspective = java.lang.Integer.parseInt(northernmostFinder.group("North"));
        }
        java.lang.String northOpe = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern australCharacteristics = java.util.regex.Pattern.compile(northOpe);
        java.util.regex.Matcher southlandSinusoid = australCharacteristics.matcher(stimulation);

        while (southlandSinusoid.find()) {
          southlandGuidance = java.lang.Integer.parseInt(southlandSinusoid.group("South"));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || southlandGuidance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = soothe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southlandGuidance = soothe.nextInt();
    }
    mackay = new FlSimulations(unionPerspective, southlandGuidance);
    System.out.println("main: Start main");
    mackay.introduce();
  }

  private static java.lang.String readerInitiate(
      java.lang.String approach, java.nio.charset.Charset coder) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(interlaced, coder);
  }
}
