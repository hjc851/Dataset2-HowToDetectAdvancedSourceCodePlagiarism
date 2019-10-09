import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Conf {
  private static java.util.Scanner handheld = new java.util.Scanner(in);

  public static synchronized void main(String[] align) {
    P4Mock dvs = null;
    java.lang.String response = "";
    int southParticipatory = -1;
    int confederacyPerspective = -1;

    if (align.length > 0) {
      for (java.lang.String fh : align) {
        response = (fh);
      }

      try {
        response = ("./out/production/c3063467A2P1/" + response);
        response = (hearBinder(response, UTF_8));
        java.lang.String northerlyEquiv = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeasternBlueprint =
            java.util.regex.Pattern.compile(northerlyEquiv);
        java.util.regex.Matcher northwestwardVerifier = northeasternBlueprint.matcher(response);

        while (northwestwardVerifier.find()) {
          southParticipatory = (java.lang.Integer.parseInt(northwestwardVerifier.group("North")));
        }
        java.lang.String southerlyYrs = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southernmostNormal = java.util.regex.Pattern.compile(southerlyYrs);
        java.util.regex.Matcher southerlySpecifier = southernmostNormal.matcher(response);

        while (southerlySpecifier.find()) {
          confederacyPerspective = (java.lang.Integer.parseInt(southerlySpecifier.group("South")));
        }
      } catch (java.io.IOException combatants) {
        out.println("");
      }
    }

    while (southParticipatory < 0 || confederacyPerspective < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = (handheld.nextInt());
      out.println("Enter the number of South Island Farmers to initialize:");
      confederacyPerspective = (handheld.nextInt());
    }
    dvs = (new P4Mock(southParticipatory, confederacyPerspective));
    out.println("main: Start main");
    dvs.conduct();
  }

  private static synchronized java.lang.String hearBinder(
      java.lang.String approach, java.nio.charset.Charset crypto) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(interlaced, crypto);
  }
}
