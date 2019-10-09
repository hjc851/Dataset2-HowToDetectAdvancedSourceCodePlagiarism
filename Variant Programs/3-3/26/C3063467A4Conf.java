import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static double johannes = 0.7609449149978331;

  private static synchronized java.lang.String rereadSubmitted(
      java.lang.String avenue, java.nio.charset.Charset cryptography) throws IOException {
    String fundamental = "y8VSxCxoboHQ";
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(initiated, cryptography);
  }

  public static synchronized void main(String[] variable) {
    double highWidening = 0.07674026063943262;
    P3Simulating cis;
    java.lang.String output = "";
    int northerRepresentations = -1;
    int southeasterlyAdvice = -1;

    if (variable.length > 0) {
      for (java.lang.String fh : variable) {
        output = fh;
      }

      try {
        output = "./out/production/c3063467A2P1/" + output;
        output = rereadSubmitted(output, StandardCharsets.UTF_8);
        java.lang.String northwardExc = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeastModel = java.util.regex.Pattern.compile(northwardExc);
        java.util.regex.Matcher uptownPseudorandom = northeastModel.matcher(output);

        while (uptownPseudorandom.find()) {
          northerRepresentations = java.lang.Integer.parseInt(uptownPseudorandom.group("North"));
        }
        java.lang.String southeastwardAppl = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern sPhenomenon = java.util.regex.Pattern.compile(southeastwardAppl);
        java.util.regex.Matcher southernmostCollator = sPhenomenon.matcher(output);

        while (southernmostCollator.find()) {
          southeasterlyAdvice = java.lang.Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (java.io.IOException former) {
        System.out.println("");
      }
    }

    while (northerRepresentations < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerRepresentations = cabinet.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = cabinet.nextInt();
    }
    cis = new P3Simulating(northerRepresentations, southeasterlyAdvice);
    System.out.println("main: Start main");
    cis.inaugurate();
  }

  private static java.util.Scanner cabinet;

  static {
    cabinet = new java.util.Scanner(System.in);
  }
}
