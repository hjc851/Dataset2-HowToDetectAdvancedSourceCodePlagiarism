import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner xbox = null;

  public static synchronized void main(String[] specified) {
    P6Device smart = null;
    java.lang.String support = "";
    int southParticipatory = -1;
    int southeastStimulation = -1;

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        support = ora;
      }

      try {
        support = "./out/production/c3063467A2P1/" + support;
        support = perusedArchives(support, StandardCharsets.UTF_8);
        java.lang.String southOpe = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwesternShape = java.util.regex.Pattern.compile(southOpe);
        java.util.regex.Matcher northwesternChooser = northwesternShape.matcher(support);

        while (northwesternChooser.find()) {
          southParticipatory = java.lang.Integer.parseInt(northwesternChooser.group("North"));
        }
        java.lang.String southwestwardIndiv = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern sPhenomenon = java.util.regex.Pattern.compile(southwestwardIndiv);
        java.util.regex.Matcher southernValidator = sPhenomenon.matcher(support);

        while (southernValidator.find()) {
          southeastStimulation = java.lang.Integer.parseInt(southernValidator.group("South"));
        }
      } catch (java.io.IOException post) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southeastStimulation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastStimulation = xbox.nextInt();
    }
    smart = new P6Device(southParticipatory, southeastStimulation);
    System.out.println("main: Start main");
    smart.opens();
  }

  private static synchronized java.lang.String perusedArchives(
      java.lang.String road, java.nio.charset.Charset scrambling) throws IOException {
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(stored, scrambling);
  }

  static {
    xbox = new java.util.Scanner(System.in);
  }
}
