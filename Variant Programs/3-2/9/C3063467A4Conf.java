import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner comfort = new java.util.Scanner(System.in);

  public static void main(String[] align) {
    TgfTrainer shum;
    java.lang.String contributions = "";
    int northwesterlyResponse = -1;
    int northernComments = -1;

    if (align.length > 0) {
      for (java.lang.String fh : align) {
        contributions = fh;
      }

      try {
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = studyPaperwork(contributions, StandardCharsets.UTF_8);
        java.lang.String northwardExc = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northernmostPractice =
            java.util.regex.Pattern.compile(northwardExc);
        java.util.regex.Matcher northboundSinusoid = northernmostPractice.matcher(contributions);

        while (northboundSinusoid.find()) {
          northwesterlyResponse = java.lang.Integer.parseInt(northboundSinusoid.group("North"));
        }
        java.lang.String dixieInd = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern dixieTrends = java.util.regex.Pattern.compile(dixieInd);
        java.util.regex.Matcher southeastwardSpooler = dixieTrends.matcher(contributions);

        while (southeastwardSpooler.find()) {
          northernComments = java.lang.Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (java.io.IOException combatants) {
        System.out.println("");
      }
    }

    while (northwesterlyResponse < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwesterlyResponse = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = comfort.nextInt();
    }
    shum = new TgfTrainer(northwesterlyResponse, northernComments);
    System.out.println("main: Start main");
    shum.initiating();
  }

  private static java.lang.String studyPaperwork(
      java.lang.String roadway, java.nio.charset.Charset coder) throws IOException {
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(consolidated, coder);
  }
}
