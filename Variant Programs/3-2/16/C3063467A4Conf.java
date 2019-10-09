import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner cantilever = new Scanner(System.in);

  public static void main(String[] ing) {
    PvKinematics mis;
    String participation = "";
    int northeasternConsultation = -1;
    int southwestStimulus = -1;

    if (ing.length > 0) {
      for (String waffen : ing) {
        participation = waffen;
      }

      try {
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = wrotePapers(participation, StandardCharsets.UTF_8);
        String northeastwardAppl = "N=(?<North>[\\d]+)";
        Pattern regionBehavior = Pattern.compile(northeastwardAppl);
        Matcher northeasternAlgorithm = regionBehavior.matcher(participation);

        while (northeasternAlgorithm.find()) {
          northeasternConsultation = Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        String southwestwardIndiv = "S=(?<South>[\\d]+)";
        Pattern southwardShape = Pattern.compile(southwestwardIndiv);
        Matcher northBrite = southwardShape.matcher(participation);

        while (northBrite.find()) {
          southwestStimulus = Integer.parseInt(northBrite.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = cantilever.nextInt();
    }
    mis = new PvKinematics(northeasternConsultation, southwestStimulus);
    System.out.println("main: Start main");
    mis.resume();
  }

  private static String wrotePapers(String footpath, Charset metadata) throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(footpath));
    return new String(demodulated, metadata);
  }
}
