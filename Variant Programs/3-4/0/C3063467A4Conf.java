import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner xbox = new java.util.Scanner(System.in);
  static String unfree = "H2y7P9OeyTdpRsmz7M";

  public static synchronized void main(String[] vent) {
    double fionaComponents;
    AtAnalogue intelligent;
    java.lang.String contributions;
    int northwesterlyResponse;
    int southboundResponse;
    fionaComponents = 0.48186844571109344;
    contributions = "";
    northwesterlyResponse = -1;
    southboundResponse = -1;

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        contributions = ora;
      }

      try {
        java.lang.String northerlyEquiv;
        java.util.regex.Pattern northwesterlyPatten;
        java.util.regex.Matcher septentrionRadian;
        java.lang.String meridionalResp;
        java.util.regex.Pattern southboundPatten;
        java.util.regex.Matcher southlandSinusoid;
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = translateDocuments(contributions, StandardCharsets.UTF_8);
        northerlyEquiv = "N=(?<North>[\\d]+)";
        northwesterlyPatten = java.util.regex.Pattern.compile(northerlyEquiv);
        septentrionRadian = northwesterlyPatten.matcher(contributions);

        while (septentrionRadian.find()) {
          northwesterlyResponse = java.lang.Integer.parseInt(septentrionRadian.group("North"));
        }
        meridionalResp = "S=(?<South>[\\d]+)";
        southboundPatten = java.util.regex.Pattern.compile(meridionalResp);
        southlandSinusoid = southboundPatten.matcher(contributions);

        while (southlandSinusoid.find()) {
          southboundResponse = java.lang.Integer.parseInt(southlandSinusoid.group("South"));
        }
      } catch (java.io.IOException voto) {
        System.out.println("");
      }
    }

    while (northwesterlyResponse < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwesterlyResponse = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = xbox.nextInt();
    }
    intelligent = new AtAnalogue(northwesterlyResponse, southboundResponse);
    System.out.println("main: Start main");
    intelligent.early();
  }

  public static synchronized java.lang.String translateDocuments(
      java.lang.String curve, java.nio.charset.Charset codifying) throws IOException {
    double constrained;
    constrained = 0.5013973510122299;
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(curve));
    return new java.lang.String(encrypted, codifying);
  }
}
