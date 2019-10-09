import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized String proofreadComplaint(String road, Charset encoders)
      throws IOException {
    byte[] initiated = Files.readAllBytes(Paths.get(road));
    return new String(initiated, encoders);
  }

  public static Scanner dashboards = new Scanner(System.in);

  public static synchronized void main(String[] create) {
    P3Simulating indeed = null;
    String component = "";
    int northwestwardOpinion = -1;
    int southernStimulant = -1;

    if (create.length > 0) {
      for (String fh : create) {
        component = fh;
      }

      try {
        component = "./out/production/c3063467A2P1/" + component;
        component = proofreadComplaint(component, StandardCharsets.UTF_8);
        String northwesternExperiment = "N=(?<North>[\\d]+)";
        Pattern southernParadigm = Pattern.compile(northwesternExperiment);
        Matcher northernmostFinder = southernParadigm.matcher(component);

        while (northernmostFinder.find()) {
          northwestwardOpinion = Integer.parseInt(northernmostFinder.group("North"));
        }
        String southernmostExc = "S=(?<South>[\\d]+)";
        Pattern southeasternBlueprint = Pattern.compile(southernmostExc);
        Matcher southwesterlyVerifier = southeasternBlueprint.matcher(component);

        while (southwesterlyVerifier.find()) {
          southernStimulant = Integer.parseInt(southwesterlyVerifier.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = dashboards.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = dashboards.nextInt();
    }
    indeed = new P3Simulating(northwestwardOpinion, southernStimulant);
    System.out.println("main: Start main");
    indeed.starts();
  }
}
