import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] adapter) {
    MMockup favour;
    java.lang.String representations;
    int northeastStimulation;
    int southeasternConsultation;
    favour = null;
    representations = "";
    northeastStimulation = -1;
    southeasternConsultation = -1;

    if (adapter.length > 0) {
      for (java.lang.String fh : adapter) {
        representations = fh;
      }

      try {
        java.lang.String southOpe;
        java.util.regex.Pattern northwesternShape;
        java.util.regex.Matcher southernColorimetry;
        java.lang.String regionSvc;
        java.util.regex.Pattern southeastModel;
        java.util.regex.Matcher northBrite;
        representations = "./out/production/c3063467A2P1/" + representations;
        representations = peruseDocket(representations, StandardCharsets.UTF_8);
        southOpe = "N=(?<North>[\\d]+)";
        northwesternShape = java.util.regex.Pattern.compile(southOpe);
        southernColorimetry = northwesternShape.matcher(representations);

        while (southernColorimetry.find()) {
          northeastStimulation = java.lang.Integer.parseInt(southernColorimetry.group("North"));
        }
        regionSvc = "S=(?<South>[\\d]+)";
        southeastModel = java.util.regex.Pattern.compile(regionSvc);
        northBrite = southeastModel.matcher(representations);

        while (northBrite.find()) {
          southeasternConsultation = java.lang.Integer.parseInt(northBrite.group("South"));
        }
      } catch (java.io.IOException afterwards) {
        System.out.println("");
      }
    }

    while (northeastStimulation < 0 || southeasternConsultation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = hardware.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasternConsultation = hardware.nextInt();
    }
    favour = new MMockup(northeastStimulation, southeasternConsultation);
    System.out.println("main: Start main");
    favour.started();
  }

  public static java.util.Scanner hardware = new java.util.Scanner(System.in);

  public static synchronized java.lang.String peruseDocket(
      java.lang.String avenue, java.nio.charset.Charset codified) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(encrypted, codified);
  }
}
