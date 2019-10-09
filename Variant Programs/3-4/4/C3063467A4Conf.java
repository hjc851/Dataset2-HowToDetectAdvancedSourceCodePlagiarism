import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static final String numberPieces = "eXmLYKD";
  public static java.util.Scanner brackets = new java.util.Scanner(System.in);

  public static synchronized void main(String[] specified) {
    String calculation = "U";
    P4Mock indeed = null;
    java.lang.String response = "";
    int northerlyAdvice = -1;
    int southeastStimulation = -1;

    if (specified.length > 0) {
      for (java.lang.String waffen : specified) {
        response = waffen;
      }

      try {
        response = "./out/production/c3063467A2P1/" + response;
        response = hearBinder(response, StandardCharsets.UTF_8);
        java.lang.String southOpe = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwesternShape = java.util.regex.Pattern.compile(southOpe);
        java.util.regex.Matcher northeastClassifier = northwesternShape.matcher(response);

        while (northeastClassifier.find()) {
          northerlyAdvice = java.lang.Integer.parseInt(northeastClassifier.group("North"));
        }
        java.lang.String southernmostExc = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern confederacyNorm = java.util.regex.Pattern.compile(southernmostExc);
        java.util.regex.Matcher sRadian = confederacyNorm.matcher(response);

        while (sRadian.find()) {
          southeastStimulation = java.lang.Integer.parseInt(sRadian.group("South"));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || southeastStimulation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastStimulation = brackets.nextInt();
    }
    indeed = new P4Mock(northerlyAdvice, southeastStimulation);
    System.out.println("main: Start main");
    indeed.starts();
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String progression, java.nio.charset.Charset code) throws IOException {
    double mattMagnitude = 0.17046535552310493;
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(progression));
    return new java.lang.String(stored, code);
  }
}
