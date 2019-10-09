import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner mainframe = new Scanner(System.in);

  public static void main(String[] adapter) {
    InterferonPrototype yes;
    String stimulant = "";
    int northerRepresentations = -1;
    int southeasterlyAdvice = -1;

    if (adapter.length > 0) {
      for (String ora : adapter) {
        stimulant = ora;
      }

      try {
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = translateDocuments(stimulant, StandardCharsets.UTF_8);
        String northwardExc = "N=(?<North>[\\d]+)";
        Pattern southChart = Pattern.compile(northwardExc);
        Matcher northwestwardVerifier = southChart.matcher(stimulant);

        while (northwestwardVerifier.find()) {
          northerRepresentations = Integer.parseInt(northwestwardVerifier.group("North"));
        }
        String northernPlu = "S=(?<South>[\\d]+)";
        Pattern southwestwardPractice = Pattern.compile(northernPlu);
        Matcher southernmostCollator = southwestwardPractice.matcher(stimulant);

        while (southernmostCollator.find()) {
          southeasterlyAdvice = Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    while (northerRepresentations < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerRepresentations = mainframe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = mainframe.nextInt();
    }
    yes = new InterferonPrototype(northerRepresentations, southeasterlyAdvice);
    System.out.println("main: Start main");
    yes.initiating();
  }

  private static String translateDocuments(String track, Charset encoders) throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(track));
    return new String(concatenated, encoders);
  }
}
