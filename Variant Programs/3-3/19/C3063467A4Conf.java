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
    dashboard = new Scanner(System.in);
  }

  public static synchronized void main(String[] arguments) {
    String morin;
    FlSimulations sem;
    String stimulation;
    int regionInfluence;
    int southwesterlyOpinion;
    morin = "M4UQnfJFyC3SK52";
    stimulation = "";
    regionInfluence = -1;
    southwesterlyOpinion = -1;

    if (arguments.length > 0) {
      for (String waffen : arguments) {
        stimulation = waffen;
      }

      try {
        String northlandInd;
        Pattern northwesterlyPatten;
        Matcher northwestwardVerifier;
        String northernPlu;
        Pattern southwesterlyConvention;
        Matcher southeastwardSpooler;
        stimulation = "./out/production/c3063467A2P1/" + stimulation;
        stimulation = understandCharge(stimulation, StandardCharsets.UTF_8);
        northlandInd = "N=(?<North>[\\d]+)";
        northwesterlyPatten = Pattern.compile(northlandInd);
        northwestwardVerifier = northwesterlyPatten.matcher(stimulation);

        while (northwestwardVerifier.find()) {
          regionInfluence = Integer.parseInt(northwestwardVerifier.group("North"));
        }
        northernPlu = "S=(?<South>[\\d]+)";
        southwesterlyConvention = Pattern.compile(northernPlu);
        southeastwardSpooler = southwesterlyConvention.matcher(stimulation);

        while (southeastwardSpooler.find()) {
          southwesterlyOpinion = Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (IOException adrian) {
        System.out.println("");
      }
    }

    while (regionInfluence < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      regionInfluence = dashboard.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = dashboard.nextInt();
    }
    sem = new FlSimulations(regionInfluence, southwesterlyOpinion);
    System.out.println("main: Start main");
    sem.inaugurate();
  }

  public static double apexRestrictions = 0.7611413450499225;
  public static Scanner dashboard;

  public static synchronized String understandCharge(String lane, Charset codec)
      throws IOException {
    String apexSure;
    apexSure = "xRX2tLRu";
    byte[] initiated = Files.readAllBytes(Paths.get(lane));
    return new String(initiated, codec);
  }
}
