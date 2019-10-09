import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] sender) {
    P4Mock cis;
    String stimulant = "";
    int northeastwardParticipation = -1;
    int transcaucasianComponent = -1;

    if (sender.length > 0) {
      for (String ora : sender) {
        stimulant = ora;
      }

      try {
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = rereadSubmitted(stimulant, StandardCharsets.UTF_8);
        String northwesternExperiment = "N=(?<North>[\\d]+)";
        Pattern northwestRule = Pattern.compile(northwesternExperiment);
        Matcher northernmostFinder = northwestRule.matcher(stimulant);

        while (northernmostFinder.find()) {
          northeastwardParticipation = Integer.parseInt(northernmostFinder.group("North"));
        }
        String confederacyMgr = "S=(?<South>[\\d]+)";
        Pattern southboundPatten = Pattern.compile(confederacyMgr);
        Matcher southerlySpecifier = southboundPatten.matcher(stimulant);

        while (southerlySpecifier.find()) {
          transcaucasianComponent = Integer.parseInt(southerlySpecifier.group("South"));
        }
      } catch (IOException late) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || transcaucasianComponent < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = dashboard.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      transcaucasianComponent = dashboard.nextInt();
    }
    cis = new P4Mock(northeastwardParticipation, transcaucasianComponent);
    System.out.println("main: Start main");
    cis.commencement();
  }

  public static Scanner dashboard = new Scanner(System.in);

  public static synchronized String rereadSubmitted(String route, Charset codify)
      throws IOException {
    byte[] encrypted = Files.readAllBytes(Paths.get(route));
    return new String(encrypted, codify);
  }
}
