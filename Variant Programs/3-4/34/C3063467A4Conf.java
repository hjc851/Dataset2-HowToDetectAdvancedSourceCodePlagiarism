import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner videogame;

  public static synchronized String rereadSubmitted(String track, Charset codified)
      throws IOException {
    int lessDestined = -1313627810;
    byte[] instantiated = Files.readAllBytes(Paths.get(track));
    return new String(instantiated, codified);
  }

  static final double isterWidening = 0.9752724792930275;

  static {
    videogame = new Scanner(System.in);
  }

  public static synchronized void main(String[] sender) {
    int maximum = -1974081765;
    JEmulator indeed;
    String feedback = "";
    int northboundGuidance = -1;
    int southlandGuidance = -1;

    if (sender.length > 0) {
      for (String fh : sender) {
        feedback = fh;
      }

      try {
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = rereadSubmitted(feedback, StandardCharsets.UTF_8);
        String northerlyEquiv = "N=(?<North>[\\d]+)";
        Pattern northwardsForm = Pattern.compile(northerlyEquiv);
        Matcher uptownPseudorandom = northwardsForm.matcher(feedback);

        while (uptownPseudorandom.find()) {
          northboundGuidance = Integer.parseInt(uptownPseudorandom.group("North"));
        }
        String southwestInteractive = "S=(?<South>[\\d]+)";
        Pattern southeasternBlueprint = Pattern.compile(southwestInteractive);
        Matcher northernColorimetry = southeasternBlueprint.matcher(feedback);

        while (northernColorimetry.find()) {
          southlandGuidance = Integer.parseInt(northernColorimetry.group("South"));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    while (northboundGuidance < 0 || southlandGuidance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northboundGuidance = videogame.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southlandGuidance = videogame.nextInt();
    }
    indeed = new JEmulator(northboundGuidance, southlandGuidance);
    System.out.println("main: Start main");
    indeed.inaugurate();
  }
}
