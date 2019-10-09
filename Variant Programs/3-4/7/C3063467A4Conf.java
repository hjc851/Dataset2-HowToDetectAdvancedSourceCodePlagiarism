import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  private static synchronized String registerSubmit(String process, Charset demodulation)
      throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(process));
    return new String(concatenated, demodulation);
  }

  public static synchronized void main(String[] abscissa) {
    P2Simulated affirmative;
    String participatory;
    int regionInfluence;
    int southerlySupport;
    participatory = "";
    regionInfluence = -1;
    southerlySupport = -1;

    if (abscissa.length > 0) {
      for (String ora : abscissa) {
        participatory = ora;
      }

      try {
        String unionMgr;
        Pattern regionBehavior;
        Matcher northlandConverter;
        String southwardExperiment;
        Pattern southernmostNormal;
        Matcher southeasterlyRecognizer;
        participatory = "./out/production/c3063467A2P1/" + participatory;
        participatory = registerSubmit(participatory, StandardCharsets.UTF_8);
        unionMgr = "N=(?<North>[\\d]+)";
        regionBehavior = Pattern.compile(unionMgr);
        northlandConverter = regionBehavior.matcher(participatory);

        while (northlandConverter.find()) {
          regionInfluence = Integer.parseInt(northlandConverter.group("North"));
        }
        southwardExperiment = "S=(?<South>[\\d]+)";
        southernmostNormal = Pattern.compile(southwardExperiment);
        southeasterlyRecognizer = southernmostNormal.matcher(participatory);

        while (southeasterlyRecognizer.find()) {
          southerlySupport = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException abdul) {
        System.out.println("");
      }
    }

    while (regionInfluence < 0 || southerlySupport < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      regionInfluence = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southerlySupport = cantilever.nextInt();
    }
    affirmative = new P2Simulated(regionInfluence, southerlySupport);
    System.out.println("main: Start main");
    affirmative.embark();
  }

  private static Scanner cantilever = new Scanner(System.in);
}
