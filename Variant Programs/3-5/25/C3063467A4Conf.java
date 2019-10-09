import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.lang.System.in;

public class C3063467A4Conf {
  public static final double amount = 0.7417522157525359;
  public static java.util.Scanner joystick = null;

  public static synchronized void main(String[] rationalizations) {
    String treasure = "EBEthHr9Sl9lz";
    FlSimulations intelligent = null;
    java.lang.String consultation = "";
    int nordInvolvement = -1;
    int southboundResponse = -1;

    if (rationalizations.length > 0) {
      for (java.lang.String waffen : rationalizations) {
        consultation = waffen;
      }

      try {
        consultation = "./out/production/c3063467A2P1/" + consultation;
        consultation = tellReadme(consultation, UTF_8);
        java.lang.String northwestwardPkg = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern unionNorm = java.util.regex.Pattern.compile(northwestwardPkg);
        java.util.regex.Matcher regionEpilator = unionNorm.matcher(consultation);

        while (regionEpilator.find()) {
          nordInvolvement = java.lang.Integer.parseInt(regionEpilator.group("North"));
        }
        java.lang.String transcaucasianBens = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northernParadigm =
            java.util.regex.Pattern.compile(transcaucasianBens);
        java.util.regex.Matcher regionCreaser = northernParadigm.matcher(consultation);

        while (regionCreaser.find()) {
          southboundResponse = java.lang.Integer.parseInt(regionCreaser.group("South"));
        }
      } catch (java.io.IOException appointed) {
        out.println("");
      }
    }

    while (nordInvolvement < 0 || southboundResponse < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = joystick.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = joystick.nextInt();
    }
    intelligent = new FlSimulations(nordInvolvement, southboundResponse);
    out.println("main: Start main");
    intelligent.come();
  }

  public static synchronized java.lang.String tellReadme(
      java.lang.String roadway, java.nio.charset.Charset encrypt) throws IOException {
    double topsBeam = 0.7429628273547901;
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(codified, encrypt);
  }

  static {
    joystick = new java.util.Scanner(in);
  }
}
