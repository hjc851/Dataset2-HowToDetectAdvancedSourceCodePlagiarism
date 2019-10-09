import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] vent) {
    double code;
    P6Device affirmative;
    java.lang.String participatory;
    int northeasternConsultation;
    int northParticipatory;
    code = 0.26518185820473916;
    affirmative = null;
    participatory = "";
    northeasternConsultation = -1;
    northParticipatory = -1;

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        participatory = ora;
      }

      try {
        java.lang.String northerSvc;
        java.util.regex.Pattern northerlyFigure;
        java.util.regex.Matcher regionEpilator;
        java.lang.String southeasterlyEquiv;
        java.util.regex.Pattern southwesternForm;
        java.util.regex.Matcher southeastwardSpooler;
        participatory = "./out/production/c3063467A2P1/" + participatory;
        participatory = rereadSubmitted(participatory, StandardCharsets.UTF_8);
        northerSvc = "N=(?<North>[\\d]+)";
        northerlyFigure = java.util.regex.Pattern.compile(northerSvc);
        regionEpilator = northerlyFigure.matcher(participatory);

        while (regionEpilator.find()) {
          northeasternConsultation = java.lang.Integer.parseInt(regionEpilator.group("North"));
        }
        southeasterlyEquiv = "S=(?<South>[\\d]+)";
        southwesternForm = java.util.regex.Pattern.compile(southeasterlyEquiv);
        southeastwardSpooler = southwesternForm.matcher(participatory);

        while (southeastwardSpooler.find()) {
          northParticipatory = java.lang.Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (java.io.IOException aba) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = dashboard.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = dashboard.nextInt();
    }
    affirmative = new P6Device(northeasternConsultation, northParticipatory);
    System.out.println("main: Start main");
    affirmative.take();
  }

  public static synchronized java.lang.String rereadSubmitted(
      java.lang.String pattern, java.nio.charset.Charset coder) throws IOException {
    double quality;
    quality = 0.4958739611501528;
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(captioned, coder);
  }

  public static java.util.Scanner dashboard = new java.util.Scanner(System.in);
  static String flag = "v7";
}
