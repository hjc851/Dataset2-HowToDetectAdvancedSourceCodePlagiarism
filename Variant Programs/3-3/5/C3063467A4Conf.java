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
    consul = new Scanner(System.in);
  }

  public static synchronized String rereadSubmitted(String avenue, Charset uncompressed)
      throws IOException {
    int number;
    number = -1902490945;
    byte[] interleaves = Files.readAllBytes(Paths.get(avenue));
    return new String(interleaves, uncompressed);
  }

  public static synchronized void main(String[] vent) {
    double numeration;
    FImpactor shen;
    String influence;
    int northlandInformation;
    int southernStimulant;
    numeration = 0.777863644456481;
    shen = null;
    influence = "";
    northlandInformation = -1;
    southernStimulant = -1;

    if (vent.length > 0) {
      for (String ora : vent) {
        influence = ora;
      }

      try {
        String northerlyEquiv;
        Pattern northernFormula;
        Matcher northboundSinusoid;
        String southwesterlyPkg;
        Pattern southmostTriangle;
        Matcher transcaucasianPseudorandom;
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = rereadSubmitted(influence, StandardCharsets.UTF_8);
        northerlyEquiv = "N=(?<North>[\\d]+)";
        northernFormula = Pattern.compile(northerlyEquiv);
        northboundSinusoid = northernFormula.matcher(influence);

        while (northboundSinusoid.find()) {
          northlandInformation = Integer.parseInt(northboundSinusoid.group("North"));
        }
        southwesterlyPkg = "S=(?<South>[\\d]+)";
        southmostTriangle = Pattern.compile(southwesterlyPkg);
        transcaucasianPseudorandom = southmostTriangle.matcher(influence);

        while (transcaucasianPseudorandom.find()) {
          southernStimulant = Integer.parseInt(transcaucasianPseudorandom.group("South"));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = consul.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = consul.nextInt();
    }
    shen = new FImpactor(northlandInformation, southernStimulant);
    System.out.println("main: Start main");
    shen.commencing();
  }

  public static Scanner consul = null;
  public static double nickSpan = 0.46824749196415705;
}
