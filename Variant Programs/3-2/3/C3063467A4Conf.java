import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner nintendo = new java.util.Scanner(System.in);

  public static void main(String[] claims) {
    MMockup mackay;
    java.lang.String comments = "";
    int northmostContributions = -1;
    int southeastwardParticipation = -1;

    if (claims.length > 0) {
      for (java.lang.String waffen : claims) {
        comments = waffen;
      }

      try {
        comments = "./out/production/c3063467A2P1/" + comments;
        comments = hearBinder(comments, StandardCharsets.UTF_8);
        java.lang.String northernmostIndiv = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeasterlyDesign =
            java.util.regex.Pattern.compile(northernmostIndiv);
        java.util.regex.Matcher northwesterlySynchroniser = northeasterlyDesign.matcher(comments);

        while (northwesterlySynchroniser.find()) {
          northmostContributions =
              java.lang.Integer.parseInt(northwesterlySynchroniser.group("North"));
        }
        java.lang.String southernReciprocal = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southerlyDesign =
            java.util.regex.Pattern.compile(southernReciprocal);
        java.util.regex.Matcher southeasternAlgorithm = southerlyDesign.matcher(comments);

        while (southeasternAlgorithm.find()) {
          southeastwardParticipation =
              java.lang.Integer.parseInt(southeasternAlgorithm.group("South"));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    while (northmostContributions < 0 || southeastwardParticipation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northmostContributions = nintendo.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = nintendo.nextInt();
    }
    mackay = new MMockup(northmostContributions, southeastwardParticipation);
    System.out.println("main: Start main");
    mackay.hold();
  }

  private static java.lang.String hearBinder(
      java.lang.String lane, java.nio.charset.Charset decoding) throws IOException {
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(costed, decoding);
  }
}
