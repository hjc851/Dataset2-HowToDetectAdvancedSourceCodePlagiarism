import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner handheld = null;

  public static synchronized void main(String[] handles) {
    ABrake mis;
    String participation;
    int northboundGuidance;
    int regionRepresentations;
    mis = null;
    participation = "";
    northboundGuidance = -1;
    regionRepresentations = -1;

    if (handles.length > 0) {
      for (String fh : handles) {
        participation = fh;
      }

      try {
        String northlandInd;
        Pattern northwestwardConvention;
        Matcher southernColorimetry;
        String meridionalResp;
        Pattern dixieTrends;
        Matcher dixielandSelectable;
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = rereadSubmitted(participation, StandardCharsets.UTF_8);
        northlandInd = "N=(?<North>[\\d]+)";
        northwestwardConvention = Pattern.compile(northlandInd);
        southernColorimetry = northwestwardConvention.matcher(participation);

        while (southernColorimetry.find()) {
          northboundGuidance = Integer.parseInt(southernColorimetry.group("North"));
        }
        meridionalResp = "S=(?<South>[\\d]+)";
        dixieTrends = Pattern.compile(meridionalResp);
        dixielandSelectable = dixieTrends.matcher(participation);

        while (dixielandSelectable.find()) {
          regionRepresentations = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    while (northboundGuidance < 0 || regionRepresentations < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northboundGuidance = handheld.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      regionRepresentations = handheld.nextInt();
    }
    mis = new ABrake(northboundGuidance, regionRepresentations);
    System.out.println("main: Start main");
    mis.hold();
  }

  public static synchronized String rereadSubmitted(String pathway, Charset keying)
      throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(pathway));
    return new String(cryptographic, keying);
  }

  static {
    handheld = new Scanner(System.in);
  }
}
