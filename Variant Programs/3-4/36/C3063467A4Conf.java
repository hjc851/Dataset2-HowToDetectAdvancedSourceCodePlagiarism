import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner nintendo;

  public static synchronized void main(String[] ae) {
    FImpactor dmi;
    java.lang.String opinions = "";
    int northwesternFeedback = -1;
    int southwestStimulus = -1;

    if (ae.length > 0) {
      for (java.lang.String fh : ae) {
        opinions = fh;
      }

      try {
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = showDocumentation(opinions, StandardCharsets.UTF_8);
        java.lang.String northeastExplanatory = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern unionNorm = java.util.regex.Pattern.compile(northeastExplanatory);
        java.util.regex.Matcher northwestVariable = unionNorm.matcher(opinions);

        while (northwestVariable.find()) {
          northwesternFeedback = java.lang.Integer.parseInt(northwestVariable.group("North"));
        }
        java.lang.String southeasterlyEquiv = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern sPhenomenon = java.util.regex.Pattern.compile(southeasterlyEquiv);
        java.util.regex.Matcher southeasternAlgorithm = sPhenomenon.matcher(opinions);

        while (southeasternAlgorithm.find()) {
          southwestStimulus = java.lang.Integer.parseInt(southeasternAlgorithm.group("South"));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    while (northwesternFeedback < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwesternFeedback = nintendo.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = nintendo.nextInt();
    }
    dmi = new FImpactor(northwesternFeedback, southwestStimulus);
    System.out.println("main: Start main");
    dmi.commencing();
  }

  private static synchronized java.lang.String showDocumentation(
      java.lang.String roadway, java.nio.charset.Charset demodulation) throws IOException {
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(transmit, demodulation);
  }

  static {
    nintendo = new java.util.Scanner(System.in);
  }
}
