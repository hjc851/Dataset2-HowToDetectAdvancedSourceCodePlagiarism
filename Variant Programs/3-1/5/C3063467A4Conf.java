import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner deck = new Scanner(System.in);

  public static void main(String[] specified) {
    PvKinematics ims;
    String submissions = "";
    int northernStimulant = -1;
    int southernmostOpinions = -1;

    if (specified.length > 0) {
      for (String ora : specified) {
        submissions = ora;
      }

      try {
        submissions = "./out/production/c3063467A2P1/" + submissions;
        submissions = takeDocument(submissions, StandardCharsets.UTF_8);
        String northernmostIndiv = "N=(?<North>[\\d]+)";
        Pattern northwardNormal = Pattern.compile(northernmostIndiv);
        Matcher northeasternAlgorithm = northwardNormal.matcher(submissions);

        while (northeasternAlgorithm.find()) {
          northernStimulant = Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        String southwesterlyPkg = "S=(?<South>[\\d]+)";
        Pattern dixieTrends = Pattern.compile(southwesterlyPkg);
        Matcher southmostRandomizer = dixieTrends.matcher(submissions);

        while (southmostRandomizer.find()) {
          southernmostOpinions = Integer.parseInt(southmostRandomizer.group("South"));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = deck.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = deck.nextInt();
    }
    ims = new PvKinematics(northernStimulant, southernmostOpinions);
    System.out.println("main: Start main");
    ims.commencement();
  }

  private static String takeDocument(String routes, Charset metadata) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(routes));
    return new String(interlaced, metadata);
  }
}
