import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized String wrotePapers(String roadway, Charset coder) throws IOException {
    double span;
    span = 0.32462080934148163;
    byte[] demodulated = Files.readAllBytes(Paths.get(roadway));
    return new String(demodulated, coder);
  }

  static {
    videogame = new Scanner(System.in);
  }

  public static Scanner videogame = null;

  public static synchronized void main(String[] adapter) {
    double marxRoll;
    ABrake intelligent;
    String opinion;
    int northernStimulant;
    int southeasternConsultation;
    marxRoll = 0.4896283465966613;
    intelligent = null;
    opinion = "";
    northernStimulant = -1;
    southeasternConsultation = -1;

    if (adapter.length > 0) {
      for (String fh : adapter) {
        opinion = fh;
      }

      try {
        String northwardsSkil;
        Pattern northerTemplate;
        Matcher northwardsKeyword;
        String southernmostExc;
        Pattern southeastwardTrend;
        Matcher southmostRandomizer;
        opinion = "./out/production/c3063467A2P1/" + opinion;
        opinion = wrotePapers(opinion, StandardCharsets.UTF_8);
        northwardsSkil = "N=(?<North>[\\d]+)";
        northerTemplate = Pattern.compile(northwardsSkil);
        northwardsKeyword = northerTemplate.matcher(opinion);

        while (northwardsKeyword.find()) {
          northernStimulant = Integer.parseInt(northwardsKeyword.group("North"));
        }
        southernmostExc = "S=(?<South>[\\d]+)";
        southeastwardTrend = Pattern.compile(southernmostExc);
        southmostRandomizer = southeastwardTrend.matcher(opinion);

        while (southmostRandomizer.find()) {
          southeasternConsultation = Integer.parseInt(southmostRandomizer.group("South"));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || southeasternConsultation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = videogame.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasternConsultation = videogame.nextInt();
    }
    intelligent = new ABrake(northernStimulant, southeasternConsultation);
    System.out.println("main: Start main");
    intelligent.introduce();
  }

  static final double minutes = 0.27656141967172276;
}
