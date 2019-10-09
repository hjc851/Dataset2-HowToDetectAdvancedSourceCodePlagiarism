import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] ae) {
    double confine;
    PlRobot shum;
    String comments;
    int northwardsSuggestions;
    int southernStimulant;
    confine = 0.08010871269478392;
    shum = null;
    comments = "";
    northwardsSuggestions = -1;
    southernStimulant = -1;

    if (ae.length > 0) {
      for (String ora : ae) {
        comments = ora;
      }

      try {
        String northerlyEquiv;
        Pattern northwardNormal;
        Matcher northlandConverter;
        String meridionalResp;
        Pattern southernmostNormal;
        Matcher confederacyAspx;
        comments = "./out/production/c3063467A2P1/" + comments;
        comments = readerInitiate(comments, StandardCharsets.UTF_8);
        northerlyEquiv = "N=(?<North>[\\d]+)";
        northwardNormal = Pattern.compile(northerlyEquiv);
        northlandConverter = northwardNormal.matcher(comments);

        while (northlandConverter.find()) {
          northwardsSuggestions = Integer.parseInt(northlandConverter.group("North"));
        }
        meridionalResp = "S=(?<South>[\\d]+)";
        southernmostNormal = Pattern.compile(meridionalResp);
        confederacyAspx = southernmostNormal.matcher(comments);

        while (confederacyAspx.find()) {
          southernStimulant = Integer.parseInt(confederacyAspx.group("South"));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    while (northwardsSuggestions < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardsSuggestions = gamers.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = gamers.nextInt();
    }
    shum = new PlRobot(northwardsSuggestions, southernStimulant);
    System.out.println("main: Start main");
    shum.enter();
  }

  public static synchronized String readerInitiate(String track, Charset decoding)
      throws IOException {
    double length;
    length = 0.7529635903908599;
    byte[] codified = Files.readAllBytes(Paths.get(track));
    return new String(codified, decoding);
  }

  static {
    gamers = new Scanner(System.in);
  }

  public static Scanner gamers = null;
  static double shackled = 0.6675357900950086;
}
