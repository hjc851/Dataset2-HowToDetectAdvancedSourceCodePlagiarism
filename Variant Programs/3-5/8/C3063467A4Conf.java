import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner ancon = null;

  public static synchronized void main(String[] string) {
    FImpactor slm = null;
    String opinion = "";
    int northernmostSubmissions = -1;
    int southwesterlyOpinion = -1;

    if (string.length > 0) {
      for (String waffen : string) {
        opinion = waffen;
      }

      try {
        opinion = "./out/production/c3063467A2P1/" + opinion;
        opinion = wrotePapers(opinion, StandardCharsets.UTF_8);
        String nordCust = "N=(?<North>[\\d]+)";
        Pattern northeastwardTrend = Pattern.compile(nordCust);
        Matcher northeasternAlgorithm = northeastwardTrend.matcher(opinion);

        while (northeasternAlgorithm.find()) {
          northernmostSubmissions = Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        String australCust = "S=(?<South>[\\d]+)";
        Pattern confederacyNorm = Pattern.compile(australCust);
        Matcher southeasterlyRecognizer = confederacyNorm.matcher(opinion);

        while (southeasterlyRecognizer.find()) {
          southwesterlyOpinion = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    while (northernmostSubmissions < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernmostSubmissions = ancon.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = ancon.nextInt();
    }
    slm = new FImpactor(northernmostSubmissions, southwesterlyOpinion);
    System.out.println("main: Start main");
    slm.commencing();
  }

  private static synchronized String wrotePapers(String progression, Charset crypto)
      throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(progression));
    return new String(formatted, crypto);
  }

  static {
    ancon = new Scanner(System.in);
  }
}
