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

  public static void main(String[] array) {
    GSim sem;
    String influence = "";
    int northeastwardParticipation = -1;
    int southmostOutput = -1;

    if (array.length > 0) {
      for (String ora : array) {
        influence = ora;
      }

      try {
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = proofreadComplaint(influence, StandardCharsets.UTF_8);
        String northeasterlyYrs = "N=(?<North>[\\d]+)";
        Pattern northernFormula = Pattern.compile(northeasterlyYrs);
        Matcher northeastwardSpooler = northernFormula.matcher(influence);

        while (northeastwardSpooler.find()) {
          northeastwardParticipation = Integer.parseInt(northeastwardSpooler.group("North"));
        }
        String confederacyMgr = "S=(?<South>[\\d]+)";
        Pattern southeasternBlueprint = Pattern.compile(confederacyMgr);
        Matcher southlandSinusoid = southeasternBlueprint.matcher(influence);

        while (southlandSinusoid.find()) {
          southmostOutput = Integer.parseInt(southlandSinusoid.group("South"));
        }
      } catch (IOException post) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || southmostOutput < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = deck.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southmostOutput = deck.nextInt();
    }
    sem = new GSim(northeastwardParticipation, southmostOutput);
    System.out.println("main: Start main");
    sem.undertake();
  }

  private static String proofreadComplaint(String course, Charset codifying) throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(course));
    return new String(consolidated, codifying);
  }
}
