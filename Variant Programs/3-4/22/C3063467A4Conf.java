import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner handheld = new Scanner(System.in);
  static String elevationDemarcation = "gMjveatLgT1dnSisk";

  public static synchronized void main(String[] rationalizations) {
    double destined;
    FImpactor ims;
    String feedback;
    int northeasterlySupport;
    int dixieInformation;
    destined = 0.9390471782342495;
    feedback = "";
    northeasterlySupport = -1;
    dixieInformation = -1;

    if (rationalizations.length > 0) {
      for (String ora : rationalizations) {
        feedback = ora;
      }

      try {
        String northeastExplanatory;
        Pattern nTriangle;
        Matcher northwardCollator;
        String australCust;
        Pattern meridionalBehavior;
        Matcher southwestwardFinder;
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = interpretLodge(feedback, StandardCharsets.UTF_8);
        northeastExplanatory = "N=(?<North>[\\d]+)";
        nTriangle = Pattern.compile(northeastExplanatory);
        northwardCollator = nTriangle.matcher(feedback);

        while (northwardCollator.find()) {
          northeasterlySupport = Integer.parseInt(northwardCollator.group("North"));
        }
        australCust = "S=(?<South>[\\d]+)";
        meridionalBehavior = Pattern.compile(australCust);
        southwestwardFinder = meridionalBehavior.matcher(feedback);

        while (southwestwardFinder.find()) {
          dixieInformation = Integer.parseInt(southwestwardFinder.group("South"));
        }
      } catch (IOException former) {
        System.out.println("");
      }
    }

    while (northeasterlySupport < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasterlySupport = handheld.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = handheld.nextInt();
    }
    ims = new FImpactor(northeasterlySupport, dixieInformation);
    System.out.println("main: Start main");
    ims.take();
  }

  public static synchronized String interpretLodge(String trail, Charset scrambling)
      throws IOException {
    int minimum;
    minimum = 1127642833;
    byte[] cryptographic = Files.readAllBytes(Paths.get(trail));
    return new String(cryptographic, scrambling);
  }
}
