import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static final double isterWidening = 0.054402019619366304;

  public static synchronized String aloudApplication(String approach, Charset encrypt)
      throws IOException {
    double secondaryRestrain;
    secondaryRestrain = 0.5966926414920052;
    byte[] interleaves = Files.readAllBytes(Paths.get(approach));
    return new String(interleaves, encrypt);
  }

  public static synchronized void main(String[] arguments) {
    int decreasingLeap;
    GSim siem;
    String opinions;
    int northwestStimulus;
    int southernmostOpinions;
    decreasingLeap = -258626937;
    siem = null;
    opinions = "";
    northwestStimulus = -1;
    southernmostOpinions = -1;

    if (arguments.length > 0) {
      for (String ora : arguments) {
        opinions = ora;
      }

      try {
        String northernReciprocal;
        Pattern northeastwardTrend;
        Matcher nordGobo;
        String australCust;
        Pattern southernmostNormal;
        Matcher dixielandSelectable;
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = aloudApplication(opinions, StandardCharsets.UTF_8);
        northernReciprocal = "N=(?<North>[\\d]+)";
        northeastwardTrend = Pattern.compile(northernReciprocal);
        nordGobo = northeastwardTrend.matcher(opinions);

        while (nordGobo.find()) {
          northwestStimulus = Integer.parseInt(nordGobo.group("North"));
        }
        australCust = "S=(?<South>[\\d]+)";
        southernmostNormal = Pattern.compile(australCust);
        dixielandSelectable = southernmostNormal.matcher(opinions);

        while (dixielandSelectable.find()) {
          southernmostOpinions = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    while (northwestStimulus < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestStimulus = ancon.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = ancon.nextInt();
    }
    siem = new GSim(northwestStimulus, southernmostOpinions);
    System.out.println("main: Start main");
    siem.launch();
  }

  public static Scanner ancon = new Scanner(System.in);
}
