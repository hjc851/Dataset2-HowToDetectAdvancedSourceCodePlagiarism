import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static {
    xbox = new java.util.Scanner(System.in);
  }

  public static synchronized void main(String[] string) {
    double moniker;
    EMoot favour;
    java.lang.String perspective;
    int nordInvolvement;
    int transcaucasianComponent;
    moniker = 0.12558289998640915;
    perspective = "";
    nordInvolvement = -1;
    transcaucasianComponent = -1;

    if (string.length > 0) {
      for (java.lang.String waffen : string) {
        perspective = waffen;
      }

      try {
        java.lang.String northwesternExperiment;
        java.util.regex.Pattern northernmostPractice;
        java.util.regex.Matcher northwardCollator;
        java.lang.String dixieInd;
        java.util.regex.Pattern southerlyDesign;
        java.util.regex.Matcher dixieConverter;
        perspective = "./out/production/c3063467A2P1/" + perspective;
        perspective = learnRegister(perspective, StandardCharsets.UTF_8);
        northwesternExperiment = "N=(?<North>[\\d]+)";
        northernmostPractice = java.util.regex.Pattern.compile(northwesternExperiment);
        northwardCollator = northernmostPractice.matcher(perspective);

        while (northwardCollator.find()) {
          nordInvolvement = java.lang.Integer.parseInt(northwardCollator.group("North"));
        }
        dixieInd = "S=(?<South>[\\d]+)";
        southerlyDesign = java.util.regex.Pattern.compile(dixieInd);
        dixieConverter = southerlyDesign.matcher(perspective);

        while (dixieConverter.find()) {
          transcaucasianComponent = java.lang.Integer.parseInt(dixieConverter.group("South"));
        }
      } catch (java.io.IOException abel) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || transcaucasianComponent < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      transcaucasianComponent = xbox.nextInt();
    }
    favour = new EMoot(nordInvolvement, transcaucasianComponent);
    System.out.println("main: Start main");
    favour.launch();
  }

  private static java.util.Scanner xbox;
  public static int length = -21464409;

  private static synchronized java.lang.String learnRegister(
      java.lang.String destiny, java.nio.charset.Charset encrypting) throws IOException {
    double boundary;
    boundary = 0.2692372063093963;
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(demodulated, encrypting);
  }
}
