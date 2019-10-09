import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner rras = new java.util.Scanner(System.in);

  private static synchronized java.lang.String showDocumentation(
      java.lang.String process, java.nio.charset.Charset keying) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(encrypted, keying);
  }

  public static synchronized void main(String[] param) {
    AtAnalogue mackay;
    java.lang.String guidance;
    int unionPerspective;
    int northernComments;
    mackay = null;
    guidance = "";
    unionPerspective = -1;
    northernComments = -1;

    if (param.length > 0) {
      for (java.lang.String waffen : param) {
        guidance = waffen;
      }

      try {
        java.lang.String northmostSupp;
        java.util.regex.Pattern northeastModel;
        java.util.regex.Matcher northwardsKeyword;
        java.lang.String southmostLic;
        java.util.regex.Pattern southwestRule;
        java.util.regex.Matcher northernColorimetry;
        guidance = "./out/production/c3063467A2P1/" + guidance;
        guidance = showDocumentation(guidance, StandardCharsets.UTF_8);
        northmostSupp = "N=(?<North>[\\d]+)";
        northeastModel = java.util.regex.Pattern.compile(northmostSupp);
        northwardsKeyword = northeastModel.matcher(guidance);

        while (northwardsKeyword.find()) {
          unionPerspective = java.lang.Integer.parseInt(northwardsKeyword.group("North"));
        }
        southmostLic = "S=(?<South>[\\d]+)";
        southwestRule = java.util.regex.Pattern.compile(southmostLic);
        northernColorimetry = southwestRule.matcher(guidance);

        while (northernColorimetry.find()) {
          northernComments = java.lang.Integer.parseInt(northernColorimetry.group("South"));
        }
      } catch (java.io.IOException abbe) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = rras.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = rras.nextInt();
    }
    mackay = new AtAnalogue(unionPerspective, northernComments);
    System.out.println("main: Start main");
    mackay.opens();
  }
}
