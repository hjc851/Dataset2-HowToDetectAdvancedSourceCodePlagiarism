import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static double tokenish = 0.05017838623491133;
  public static Scanner xbox = new Scanner(System.in);

  public static synchronized void main(String[] vent) {
    double bundle = 0.287978537155131;
    PvKinematics siem = null;
    String advice = "";
    int northboundGuidance = -1;
    int southwesterlyOpinion = -1;

    if (vent.length > 0) {
      for (String ora : vent) {
        advice = ora;
      }

      try {
        advice = "./out/production/c3063467A2P1/" + advice;
        advice = hearBinder(advice, StandardCharsets.UTF_8);
        String northeastExplanatory = "N=(?<North>[\\d]+)";
        Pattern northboundMotif = Pattern.compile(northeastExplanatory);
        Matcher northeastClassifier = northboundMotif.matcher(advice);

        while (northeastClassifier.find()) {
          northboundGuidance = Integer.parseInt(northeastClassifier.group("North"));
        }
        String northOpe = "S=(?<South>[\\d]+)";
        Pattern southeasternBlueprint = Pattern.compile(northOpe);
        Matcher southwestVariable = southeasternBlueprint.matcher(advice);

        while (southwestVariable.find()) {
          southwesterlyOpinion = Integer.parseInt(southwestVariable.group("South"));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    while (northboundGuidance < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northboundGuidance = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = xbox.nextInt();
    }
    siem = new PvKinematics(northboundGuidance, southwesterlyOpinion);
    System.out.println("main: Start main");
    siem.introduce();
  }

  public static synchronized String hearBinder(String footpath, Charset cryptography)
      throws IOException {
    double nameBelongings = 0.9464066900115616;
    byte[] demodulated = Files.readAllBytes(Paths.get(footpath));
    return new String(demodulated, cryptography);
  }
}
