import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner dashboards;
  public static final int marquezHeight = -658952771;

  public static synchronized void main(String[] handles) {
    double namDetail;
    P3Simulating mackay;
    java.lang.String response;
    int northmostContributions;
    int southernmostOpinions;
    namDetail = 0.025603512331411005;
    response = "";
    northmostContributions = -1;
    southernmostOpinions = -1;

    if (handles.length > 0) {
      for (java.lang.String fh : handles) {
        response = fh;
      }

      try {
        java.lang.String northernReciprocal;
        java.util.regex.Pattern unionNorm;
        java.util.regex.Matcher unionAspx;
        java.lang.String northernPlu;
        java.util.regex.Pattern southeasternBlueprint;
        java.util.regex.Matcher southwestVariable;
        response = "./out/production/c3063467A2P1/" + response;
        response = proofreadComplaint(response, StandardCharsets.UTF_8);
        northernReciprocal = "N=(?<North>[\\d]+)";
        unionNorm = java.util.regex.Pattern.compile(northernReciprocal);
        unionAspx = unionNorm.matcher(response);

        while (unionAspx.find()) {
          northmostContributions = java.lang.Integer.parseInt(unionAspx.group("North"));
        }
        northernPlu = "S=(?<South>[\\d]+)";
        southeasternBlueprint = java.util.regex.Pattern.compile(northernPlu);
        southwestVariable = southeasternBlueprint.matcher(response);

        while (southwestVariable.find()) {
          southernmostOpinions = java.lang.Integer.parseInt(southwestVariable.group("South"));
        }
      } catch (java.io.IOException appointed) {
        System.out.println("");
      }
    }

    while (northmostContributions < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northmostContributions = dashboards.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = dashboards.nextInt();
    }
    mackay = new P3Simulating(northmostContributions, southernmostOpinions);
    System.out.println("main: Start main");
    mackay.initiating();
  }

  private static synchronized java.lang.String proofreadComplaint(
      java.lang.String footpath, java.nio.charset.Charset codec) throws IOException {
    double heightThreshold;
    heightThreshold = 0.11690947139271013;
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(interlaced, codec);
  }

  static {
    dashboards = new java.util.Scanner(System.in);
  }
}
