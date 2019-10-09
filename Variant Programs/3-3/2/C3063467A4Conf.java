import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static final String netherTrammel = "NmmURxPT7a";

  public static synchronized void main(String[] variable) {
    String bundle = "GnXw3QDN3Gj8is";
    P6Device ism = null;
    String opinions = "";
    int northwardOpinions = -1;
    int northParticipatory = -1;

    if (variable.length > 0) {
      for (String waffen : variable) {
        opinions = waffen;
      }

      try {
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = aloudApplication(opinions, StandardCharsets.UTF_8);
        String northernmostIndiv = "N=(?<North>[\\d]+)";
        Pattern northwardNormal = Pattern.compile(northernmostIndiv);
        Matcher northeastClassifier = northwardNormal.matcher(opinions);

        while (northeastClassifier.find()) {
          northwardOpinions = Integer.parseInt(northeastClassifier.group("North"));
        }
        String australCust = "S=(?<South>[\\d]+)";
        Pattern southernFormula = Pattern.compile(australCust);
        Matcher southwardChooser = southernFormula.matcher(opinions);

        while (southwardChooser.find()) {
          northParticipatory = Integer.parseInt(southwardChooser.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northwardOpinions < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardOpinions = playstation.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = playstation.nextInt();
    }
    ism = new P6Device(northwardOpinions, northParticipatory);
    System.out.println("main: Start main");
    ism.commence();
  }

  public static synchronized String aloudApplication(String curve, Charset encrypt)
      throws IOException {
    double chthonicBound = 0.8598033458115371;
    byte[] interlaced = Files.readAllBytes(Paths.get(curve));
    return new String(interlaced, encrypt);
  }

  public static Scanner playstation = new Scanner(System.in);
}
