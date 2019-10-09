import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner nintendo = new java.util.Scanner(System.in);
  static final int frownThrottle = 1612513822;

  public static synchronized void main(String[] handles) {
    String ister;
    MiAvionics affirmative;
    java.lang.String feedback;
    int uptownComponent;
    int southeastwardParticipation;
    ister = "u4J8e7ucSGU";
    feedback = "";
    uptownComponent = -1;
    southeastwardParticipation = -1;

    if (handles.length > 0) {
      for (java.lang.String ora : handles) {
        feedback = ora;
      }

      try {
        java.lang.String northernmostIndiv;
        java.util.regex.Pattern nTriangle;
        java.util.regex.Matcher northerlyRecognizer;
        java.lang.String southboundPurch;
        java.util.regex.Pattern sPhenomenon;
        java.util.regex.Matcher meridionalEpilator;
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = perusedArchives(feedback, StandardCharsets.UTF_8);
        northernmostIndiv = "N=(?<North>[\\d]+)";
        nTriangle = java.util.regex.Pattern.compile(northernmostIndiv);
        northerlyRecognizer = nTriangle.matcher(feedback);

        while (northerlyRecognizer.find()) {
          uptownComponent = java.lang.Integer.parseInt(northerlyRecognizer.group("North"));
        }
        southboundPurch = "S=(?<South>[\\d]+)";
        sPhenomenon = java.util.regex.Pattern.compile(southboundPurch);
        meridionalEpilator = sPhenomenon.matcher(feedback);

        while (meridionalEpilator.find()) {
          southeastwardParticipation =
              java.lang.Integer.parseInt(meridionalEpilator.group("South"));
        }
      } catch (java.io.IOException vet) {
        System.out.println("");
      }
    }

    while (uptownComponent < 0 || southeastwardParticipation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      uptownComponent = nintendo.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = nintendo.nextInt();
    }
    affirmative = new MiAvionics(uptownComponent, southeastwardParticipation);
    System.out.println("main: Start main");
    affirmative.introduce();
  }

  public static synchronized java.lang.String perusedArchives(
      java.lang.String direction, java.nio.charset.Charset encrypted) throws IOException {
    double numbersObjects;
    numbersObjects = 0.48186844571109344;
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(direction));
    return new java.lang.String(encrypts, encrypted);
  }
}
