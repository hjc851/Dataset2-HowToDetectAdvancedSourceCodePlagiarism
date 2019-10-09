import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner hardware = new java.util.Scanner(System.in);

  public static void main(String[] adapter) {
    AtAnalogue siem;
    java.lang.String feedback = "";
    int uptownComponent = -1;
    int southwesternSuggestions = -1;

    if (adapter.length > 0) {
      for (java.lang.String waffen : adapter) {
        feedback = waffen;
      }

      try {
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = hearBinder(feedback, StandardCharsets.UTF_8);
        java.lang.String northeasternReq = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern nTriangle = java.util.regex.Pattern.compile(northeasternReq);
        java.util.regex.Matcher northeastClassifier = nTriangle.matcher(feedback);

        while (northeastClassifier.find()) {
          uptownComponent = java.lang.Integer.parseInt(northeastClassifier.group("North"));
        }
        java.lang.String transcaucasianBens = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern sPhenomenon = java.util.regex.Pattern.compile(transcaucasianBens);
        java.util.regex.Matcher transcaucasianPseudorandom = sPhenomenon.matcher(feedback);

        while (transcaucasianPseudorandom.find()) {
          southwesternSuggestions =
              java.lang.Integer.parseInt(transcaucasianPseudorandom.group("South"));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    while (uptownComponent < 0 || southwesternSuggestions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      uptownComponent = hardware.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesternSuggestions = hardware.nextInt();
    }
    siem = new AtAnalogue(uptownComponent, southwesternSuggestions);
    System.out.println("main: Start main");
    siem.commencement();
  }

  private static java.lang.String hearBinder(
      java.lang.String routes, java.nio.charset.Charset crypto) throws IOException {
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(decrypt, crypto);
  }
}
