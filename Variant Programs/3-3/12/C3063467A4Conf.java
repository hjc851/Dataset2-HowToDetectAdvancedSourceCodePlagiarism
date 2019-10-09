import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static String diagnose = "ikzJewLs8BDPeIKf";
  private static java.util.Scanner cantilever = new java.util.Scanner(System.in);

  public static synchronized void main(String[] param) {
    double outer = 0.400032378665927;
    ConfSimulation dmi;
    java.lang.String support = "";
    int northeasternConsultation = -1;
    int southernStimulant = -1;

    if (param.length > 0) {
      for (java.lang.String fh : param) {
        support = fh;
      }

      try {
        support = "./out/production/c3063467A2P1/" + support;
        support = interpretLodge(support, StandardCharsets.UTF_8);
        java.lang.String northwesterlyPurch = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northboundMotif =
            java.util.regex.Pattern.compile(northwesterlyPurch);
        java.util.regex.Matcher northboundSinusoid = northboundMotif.matcher(support);

        while (northboundSinusoid.find()) {
          northeasternConsultation = java.lang.Integer.parseInt(northboundSinusoid.group("North"));
        }
        java.lang.String australCust = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southeasternBlueprint =
            java.util.regex.Pattern.compile(australCust);
        java.util.regex.Matcher southeastClassifier = southeasternBlueprint.matcher(support);

        while (southeastClassifier.find()) {
          southernStimulant = java.lang.Integer.parseInt(southeastClassifier.group("South"));
        }
      } catch (java.io.IOException adult) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = cantilever.nextInt();
    }
    dmi = new ConfSimulation(northeasternConsultation, southernStimulant);
    System.out.println("main: Start main");
    dmi.resume();
  }

  private static synchronized java.lang.String interpretLodge(
      java.lang.String progression, java.nio.charset.Charset encrypting) throws IOException {
    double decreaseRolled = 0.8093396370853324;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(progression));
    return new java.lang.String(consolidated, encrypting);
  }
}
