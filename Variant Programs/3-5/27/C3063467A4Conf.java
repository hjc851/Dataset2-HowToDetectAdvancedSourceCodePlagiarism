import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  public static java.util.Scanner ancon = new java.util.Scanner(System.in);
  static double curve = 0.360548631841468;

  public static synchronized void main(String[] array) {
    int topmostMinimum;
    MMockup siem;
    java.lang.String support;
    int northeasternConsultation;
    int meridionalInfluence;
    topmostMinimum = 940629502;
    support = "";
    northeasternConsultation = -1;
    meridionalInfluence = -1;

    if (array.length > 0) {
      for (java.lang.String waffen : array) {
        support = waffen;
      }

      try {
        java.lang.String northeastExplanatory;
        java.util.regex.Pattern northwestwardConvention;
        java.util.regex.Matcher northerlyRecognizer;
        java.lang.String southboundPurch;
        java.util.regex.Pattern sPhenomenon;
        java.util.regex.Matcher southwestVariable;
        support = "./out/production/c3063467A2P1/" + support;
        support = sayFolder(support, StandardCharsets.UTF_8);
        northeastExplanatory = "N=(?<North>[\\d]+)";
        northwestwardConvention = compile(northeastExplanatory);
        northerlyRecognizer = northwestwardConvention.matcher(support);

        while (northerlyRecognizer.find()) {
          northeasternConsultation = parseInt(northerlyRecognizer.group("North"));
        }
        southboundPurch = "S=(?<South>[\\d]+)";
        sPhenomenon = compile(southboundPurch);
        southwestVariable = sPhenomenon.matcher(support);

        while (southwestVariable.find()) {
          meridionalInfluence = parseInt(southwestVariable.group("South"));
        }
      } catch (java.io.IOException abdul) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || meridionalInfluence < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = ancon.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      meridionalInfluence = ancon.nextInt();
    }
    siem = new MMockup(northeasternConsultation, meridionalInfluence);
    System.out.println("main: Start main");
    siem.starting();
  }

  public static synchronized java.lang.String sayFolder(
      java.lang.String journey, java.nio.charset.Charset coder) throws IOException {
    double appoint;
    appoint = 0.955551942891227;
    byte[] costed = readAllBytes(get(journey));
    return new java.lang.String(costed, coder);
  }
}
